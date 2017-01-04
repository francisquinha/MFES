package tetris.vdm;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class Timer {
  private Number curTime = 0L;
  private Number curStep = 0L;

  public void incTimers() {

    curTime = curTime.longValue() + 1L;
    curStep = curStep.longValue() + 1L;
  }

  public Number getTimer(final String option) {

    {
      if (Utils.equals(option, "time")) {
        return curTime;

      } else if (Utils.equals(option, "step")) {
        return curStep;
      }
    }

    return 0L;
  }

  public void resetTimer(final String option) {

    {
      if (Utils.equals(option, "time")) {
        curTime = 0L;

      } else if (Utils.equals(option, "step")) {
        curStep = 0L;

      } else if (Utils.equals(option, "all")) {
        curStep = 0L;
        curTime = 0L;
      }
    }
  }

  public Timer() {}

  public String toString() {

    return "Timer{"
        + "curTime := "
        + Utils.toString(curTime)
        + ", curStep := "
        + Utils.toString(curStep)
        + "}";
  }
}
