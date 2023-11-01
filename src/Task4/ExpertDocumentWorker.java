package Task4;

public class ExpertDocumentWorker extends ProDocumentWorker{

    @Override
    public void openDocument() {
        super.openDocument();
    }

    @Override
    public void editDocument() {
        super.editDocument();
    }

    @Override
    public void saveDocument() {
        System.out.println("Документ збережено у новому форматі");
    }
}
