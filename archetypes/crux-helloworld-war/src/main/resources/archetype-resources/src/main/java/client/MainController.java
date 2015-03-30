package ${package}.client;

import org.cruxframework.crux.core.client.controller.Controller;
import org.cruxframework.crux.core.client.controller.Expose;
import org.cruxframework.crux.core.client.ioc.Inject;
import org.cruxframework.crux.core.client.screen.views.BindView;
import org.cruxframework.crux.core.client.screen.views.WidgetAccessor;
import org.cruxframework.crux.widgets.client.dialog.FlatMessageBox;
import org.cruxframework.crux.widgets.client.dialog.FlatMessageBox.MessageType;

import com.google.gwt.user.client.ui.TextBox;

@Controller("mainController")
public class MainController 
{
    @Inject
    public MainView screen;
    
    @Expose
    public void onLoad()
    {
        //do something
    }
    
    @Expose   
    public void sayOk()
    {
    	FlatMessageBox.show("OK : " + screen.nameTextBox().getText() , MessageType.INFO);
    }  
    
    @BindView("main")
    public static interface MainView extends WidgetAccessor
    {
        TextBox nameTextBox();
    }
}