package services.ui;

import java.util.Optional;



public class UiTestExecutorFactory {

  private static final String UI_TEST_MODE = "ui.test.mode";

  private static final UiTestExecutorFactory INSTANCE = new UiTestExecutorFactory();

  public UiTestExecutor get() {
    final UiTestExecutor.UiExecutorType type = Optional.of(UI_TEST_MODE)
        .map(System::getProperty)
        .map(UiTestExecutor.UiExecutorType::valueOf)
        .orElse(UiTestExecutor.UiExecutorType.COMPARE);
    return get(type);
  }

  public UiTestExecutor get(final UiTestExecutor.UiExecutorType type) {
    if (type == UiTestExecutor.UiExecutorType.COMPARE) {
      return new CompareUiExecutor();
    } else if (type == UiTestExecutor.UiExecutorType.UPDATE) {
      return new UpdateExpectedScreenshotExecutor();
    }

    throw new IllegalArgumentException(type + " does not exist");
  }

  public static UiTestExecutorFactory getInstance() {
    return INSTANCE;
  }
}
