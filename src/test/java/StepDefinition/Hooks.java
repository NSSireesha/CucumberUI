package StepDefinition;

import Utils.Injectionclass;
import io.cucumber.java.Before;

public class Hooks {
Injectionclass injection;

    public Hooks(Injectionclass injection) {
this.injection= injection;
    }

@Before (order = 0)

    public void Beforescenario()
{
  if (injection.objectManager.getRegistrationpageobj().getsuccessmsg() ==null)
  {

  }
}

}
