package tetris.vdm;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class TetraminoT extends Tetramino {
  public void cg_init_TetraminoT_1(final Board board) {

    super.setColor(tetris.vdm.quotes.PurpleQuote.getInstance());
    super.setId(6L);
    super.initialSetMinoes(board, SeqUtil.seq(1L, 5L));
    return;
  }

  public TetraminoT(final Board board) {

    cg_init_TetraminoT_1(board);
  }

  public VDMSeq getNextMino(final VDMSeq position, final Number index) {

    VDMSeq result = Utils.copy(position);
    Number casesExp_29 = super.getOrientation();
    Number intPattern_75 = casesExp_29;
    Boolean success_29 = Utils.equals(intPattern_75, 0L);

    if (!(success_29)) {
      Number intPattern_76 = casesExp_29;
      success_29 = Utils.equals(intPattern_76, 1L);

      if (!(success_29)) {
        Number intPattern_77 = casesExp_29;
        success_29 = Utils.equals(intPattern_77, 2L);

        if (!(success_29)) {
          Number intPattern_78 = casesExp_29;
          success_29 = Utils.equals(intPattern_78, 3L);

          if (success_29) {
            Number intPattern_79 = index;
            Boolean success_30 = Utils.equals(intPattern_79, 1L);

            if (success_30) {
              {
                Utils.mapSeqUpdate(result, 1L, ((Number) Utils.get(position, 1L)).longValue() + 1L);
                Utils.mapSeqUpdate(result, 2L, ((Number) Utils.get(position, 2L)).longValue() + 1L);
              }

            } else {
              Utils.mapSeqUpdate(result, 1L, ((Number) Utils.get(position, 1L)).longValue() - 1L);
            }
          }

        } else {
          Number intPattern_80 = index;
          Boolean success_31 = Utils.equals(intPattern_80, 1L);

          if (success_31) {
            {
              Utils.mapSeqUpdate(result, 1L, ((Number) Utils.get(position, 1L)).longValue() - 1L);
              Utils.mapSeqUpdate(result, 2L, ((Number) Utils.get(position, 2L)).longValue() + 1L);
            }

          } else {
            Utils.mapSeqUpdate(result, 2L, ((Number) Utils.get(position, 2L)).longValue() - 1L);
          }
        }

      } else {
        Number intPattern_81 = index;
        Boolean success_32 = Utils.equals(intPattern_81, 1L);

        if (success_32) {
          {
            Utils.mapSeqUpdate(result, 1L, ((Number) Utils.get(position, 1L)).longValue() - 1L);
            Utils.mapSeqUpdate(result, 2L, ((Number) Utils.get(position, 2L)).longValue() - 1L);
          }

        } else {
          Utils.mapSeqUpdate(result, 1L, ((Number) Utils.get(position, 1L)).longValue() + 1L);
        }
      }

    } else {
      Number intPattern_82 = index;
      Boolean success_33 = Utils.equals(intPattern_82, 1L);

      if (success_33) {
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

  public VDMSeq getRotatedMino(final VDMSeq position) {

    VDMSeq result = Utils.copy(position);
    Number casesExp_34 = super.getOrientation();
    Number intPattern_83 = casesExp_34;
    Boolean success_34 = Utils.equals(intPattern_83, 0L);

    if (!(success_34)) {
      Number intPattern_84 = casesExp_34;
      success_34 = Utils.equals(intPattern_84, 1L);

      if (!(success_34)) {
        Number intPattern_85 = casesExp_34;
        success_34 = Utils.equals(intPattern_85, 2L);

        if (!(success_34)) {
          Number intPattern_86 = casesExp_34;
          success_34 = Utils.equals(intPattern_86, 3L);

          if (success_34) {
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
