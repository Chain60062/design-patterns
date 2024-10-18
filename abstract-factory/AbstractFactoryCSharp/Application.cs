class Application{
    private GUIFactory factory;
    private Button button;
    private CheckBox checkBox;

    public Application(GUIFactory factory){
        this.factory = factory;
        button = factory.CreateButton();
        checkBox = factory.CreateCheckBox();
    }
    public static void Main(String[] args)
    {
        string OS = "Windows";
        GUIFactory guiFactory;

        if (OS.ToLowerInvariant().Trim().Equals("windows"))
        {
            guiFactory = new WindowsFactory();
        }
        else if (OS.ToLowerInvariant().Trim().Equals("mac"))
        {
            guiFactory = new MacFactory();
        }
        else
        {
            throw new Exception("Seu sistema operacional não é suportado por nossa aplicação.");
        }
        Application app = new Application(guiFactory);
        app.button.Click();
        app.checkBox.Check();
        Console.WriteLine($"CheckBox está marcada? {(app.checkBox.IsChecked() ? "Sim" : "Não")}");
    }
}