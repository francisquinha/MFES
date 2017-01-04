package tetris.vdm;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class TetraminoI extends Tetramino {
  public void cg_init_TetraminoI_1(final Board board) {

    super.setColor(tetris.vdm.quotes.CyanQuote.getInstance());
    super.setId(1L);
    super.initialSetMinoes(board, SeqUtil.seq(2L, 4L));
    return;
  }

  public TetraminoI(final Board board) {

    cg_init_TetraminoI_1(board);
  }

  public VDMSeq getNextMino(final VDMSeq position, final Number index) {

    VDMSeq result = Utils.copy(position);
    Number casesExp_3 = super.getOrientation();
    Number intPattern_15 = casesExp_3;
    Boolean success_3 = Utils.equals(intPattern_15, 0L);

    if (!(success_3)) {
      Number intPattern_16 = casesExp_3;
      success_3 = Utils.equals(intPattern_16, 1L);

      if (!(success_3)) {
        Number intPattern_17 = casesExp_3;
        success_3 = Utils.equals(intPattern_17, 2L);

        if (!(success_3)) {
          Number intPattern_18 = casesExp_3;
          success_3 = Utils.equals(intPattern_18, 3L);

          if (success_3) {
            Utils.mapSeqUpdate(result, 1L, ((Number) Utils.get(position, 1L)).longValue() - 1L);
          }

        } else {
          Utils.mapSeqUpdate(result, 2L, ((Number) Utils.get(position, 2L)).longValue() - 1L);
        }

      } else {
        Utils.mapSeqUpdate(result, 1L, ((Number) Utils.get(position, 1L)).longValue() + 1L);
      }

    } else {
      Utils.mapSeqUpdate(result, 2L, ((Number) Utils.get(position, 2L)).longValue() + 1L);
    }

    return Utils.copy(result);
  }

  public VDMSeq getRotatedMino(final VDMSeq position) {

    VDMSeq result = Utils.copy(position);
    Number casesExp_4 = super.getOrientation();
    Number intPattern_19 = casesExp_4;
    Boolean success_4 = Utils.equals(intPattern_19, 0L);

    if (!(success_4)) {
      Number intPattern_20 = casesExp_4;
      success_4 = Utils.equals(intPattern_20, 1L);

      if (!(success_4)) {
        Number intPattern_21 = casesExp_4;
        success_4 = Utils.equals(intPattern_21, 2L);

        if (!(success_4)) {
          Number intPattern_22 = casesExp_4;
          success_4 = Utils.equals(intPattern_22, 3L);

          if (success_4) {
            {
              Utils.mapSeqUpdate(result, 1L, ((Number) Utils.get(position, 1L)).longValue() - 2L);
              Utils.mapSeqUpdate(result, 2L, ((Number) Utils.get(position, 2L)).longValue() - 1L);
            }
          }

        } else {
          {
            Utils.mapSeqUpdate(result, 1L, ((Number) Utils.get(position, 1L)).longValue() + 1L);
            Utils.mapSeqUpdate(result, 2L, ((Number) Utils.get(position, 2L)).longValue() - 2L);
          }
        }

      } else {
        {
          Utils.mapSeqUpdate(result, 1L, ((Number) Utils.get(position, 1L)).longValue() + 2L);
          Utils.mapSeqUpdate(result, 2L, ((Number) Utils.get(position, 2L)).longValue() + 1L);
        }
      }

    } else {
      {
        Utils.mapSeqUpdate(result, 1L, ((Number) Utils.get(position, 1L)).longValue() - 1L);
        Utils.mapSeqUpdate(result, 2L, ((Number) Utils.get(position, 2L)).longValue() + 2L);
      }
    }

    return Utils.copy(result);
  }

  public TetraminoI() {}

  public String toString() {

    return "TetraminoI{}";
  }
}
