class MacFactory : GUIFactory
{
    public Button CreateButton() => new MacButton();
    public CheckBox CreateCheckBox() => new MacCheckBox();
}
