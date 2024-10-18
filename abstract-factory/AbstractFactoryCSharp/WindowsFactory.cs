class WindowsFactory : GUIFactory
{
    public Button CreateButton() => new WindowsButton();
    public CheckBox CreateCheckBox() => new WindowsCheckBox();
}