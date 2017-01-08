package tetris.vdm;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class TetraminoT extends Tetramino {
  public void cg_init_TetraminoT_1(final Game game) {

    super.setColor(tetris.vdm.quotes.PurpleQuote.getInstance());
    super.setId(6L);
    super.initialSetMinoes(game, SeqUtil.seq(1L, 5L));
    return;
  }

  public TetraminoT(final Game game) {

    cg_init_TetraminoT_1(game);
  }

  protected VDMSeq getNextMino(final VDMSeq position, final Number index) {

    VDMSeq result = Utils.copy(position);
    Number casesExp_30 = super.getOrientation();
    Number intPattern_76 = casesExp_30;
    Boolean success_30 = Utils.equals(intPattern_76, 0L);

    if (!(success_30)) {
      Number intPattern_77 = casesExp_30;
      success_30 = Utils.equals(intPattern_77, 1L);

      if (!(success_30)) {
        Number intPattern_78 = casesExp_30;
        success_30 = Utils.equals(intPattern_78, 2L);

        if (!(success_30)) {
          Number intPattern_79 = casesExp_30;
          success_30 = Utils.equals(intPattern_79, 3L);

          if (success_30) {
            Number intPattern_80 = index;
            Boolean success_31 = Utils.equals(intPattern_80, 1L);

            if (success_31) {
              {
                Utils.mapSeqUpdate(result, 1L, ((Number) Utils.get(position, 1L)).longValue() + 1L);
                Utils.mapSeqUpdate(result, 2L, ((Number) Utils.get(position, 2L)).longValue() + 1L);
              }

            } else {
              Utils.mapSeqUpdate(result, 1L, ((Number) Utils.get(position, 1L)).longValue() - 1L);
            }
          }

        } else {
          Number intPattern_81 = index;
          Boolean success_32 = Utils.equals(intPattern_81, 1L);

          if (success_32) {
            {
              Utils.mapSeqUpdate(result, 1L, ((Number) Utils.get(position, 1L)).longValue() - 1L);
              Utils.mapSeqUpdate(result, 2L, ((Number) Utils.get(position, 2L)).longValue() + 1L);
            }

          } else {
            Utils.mapSeqUpdate(result, 2L, ((Number) Utils.get(position, 2L)).longValue() - 1L);
          }
        }

      } else {
        Number intPattern_82 = index;
        Boolean success_33 = Utils.equals(intPattern_82, 1L);

        if (success_33) {
          {
            Utils.mapSeqUpdate(result, 1L, ((Number) Utils.get(position, 1L)).longValue() - 1L);
            Utils.mapSeqUpdate(result, 2L, ((Number) Utils.get(position, 2L)).longValue() - 1L);
          }

        } else {
          Utils.mapSeqUpdate(result, 1L, ((Number) Utils.get(position, 1L)).longValue() + 1L);
        }
      }

    } else {
      Number intPattern_83 = index;
      Boolean success_34 = Utils.equals(intPattern_83, 1L);

      if (success_34) {
        {
          Utils.mapSeqUpdate(result, 1L, ((Number) Utils.get(position, 1L)).longValue() + 1L);
          Utils.mapSeqUpdate(result, 2L, ((Number) Utils.get(position, 2L)).longValue() - 1L);
        }

      } else {
        Utils.mapSeqUpdate(result, 2L, ((Number) Utils.get(position, 2L)).longValue() + 1L);
      }
    }

    return Utils.copy(result);
  }

  protected VDMSeq getRotatedMino(final VDMSeq position) {

    VDMSeq result = Utils.copy(position);
    Number casesExp_35 = super.getOrientation();
    Number intPattern_84 = casesExp_35;
    Boolean success_35 = Utils.equals(intPattern_84, 0L);

    if (!(success_35)) {
      Number intPattern_85 = casesExp_35;
      success_35 = Utils.equals(intPattern_85, 1L);

      if (!(success_35)) {
        Number intPattern_86 = casesExp_35;
        success_35 = Utils.equals(intPattern_86, 2L);

        if (!(success_35)) {
          Number intPattern_87 = casesExp_35;
          success_35 = Utils.equals(intPattern_87, 3L);

          if (success_35) {
            {
              Utils.mapSeqUpdate(result, 1L, ((Number) Utils.get(position, 1L)).longValue() - 1L);
              Utils.mapSeqUpdate(result, 2L, ((Number) Utils.get(position, 2L)).longValue() + 1L);
            }
          }

        } else {
          {
            Utils.mapSeqUpdate(result, 1L, ((Number) Utils.get(position, 1L)).longValue() - 1L);
            Utils.mapSeqUpdate(result, 2L, ((Number) Utils.get(position, 2L)).longValue() - 1L);
          }
        }

      } else {
        {
          Utils.mapSeqUpdate(result, 1L, ((Number) Utils.get(position, 1L)).longValue() + 1L);
          Utils.mapSeqUpdate(result, 2L, ((Number) Utils.get(position, 2L)).longValue() - 1L);
        }
      }

    } else {
      {
        Utils.mapSeqUpdate(result, 1L, ((Number) Utils.get(position, 1L)).longValue() + 1L);
        Utils.mapSeqUpdate(result, 2L, ((Number) Utils.get(position, 2L)).longValue() + 1L);
      }
    }

    return Utils.copy(result);
  }

  public TetraminoT() {}

  public String toString() {

    return "TetraminoT{}";
  }
}
