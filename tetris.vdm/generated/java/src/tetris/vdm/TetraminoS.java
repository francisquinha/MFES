package tetris.vdm;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class TetraminoS extends Tetramino {
  public void cg_init_TetraminoS_1(final Board board) {

    super.setColor(tetris.vdm.quotes.GreenQuote.getInstance());
    super.setId(5L);
    super.initialSetMinoes(board, SeqUtil.seq(1L, 6L));
    return;
  }

  public TetraminoS(final Board board) {

    cg_init_TetraminoS_1(board);
  }

  public VDMSeq getNextMino(final VDMSeq position, final Number index) {

    VDMSeq result = Utils.copy(position);
    Number casesExp_23 = super.getOrientation();
    Number intPattern_63 = casesExp_23;
    Boolean success_23 = Utils.equals(intPattern_63, 0L);

    if (!(success_23)) {
      Number intPattern_64 = casesExp_23;
      success_23 = Utils.equals(intPattern_64, 1L);

      if (!(success_23)) {
        Number intPattern_65 = casesExp_23;
        success_23 = Utils.equals(intPattern_65, 2L);

        if (!(success_23)) {
          Number intPattern_66 = casesExp_23;
          success_23 = Utils.equals(intPattern_66, 3L);

          if (success_23) {
            Number intPattern_67 = index;
            Boolean success_24 = Utils.equals(intPattern_67, 2L);

            if (success_24) {
              Utils.mapSeqUpdate(result, 2L, ((Number) Utils.get(position, 2L)).longValue() + 1L);
            } else {
              Utils.mapSeqUpdate(result, 1L, ((Number) Utils.get(position, 1L)).longValue() + 1L);
            }
          }

        } else {
          Number intPattern_68 = index;
          Boolean success_25 = Utils.equals(intPattern_68, 2L);

          if (success_25) {
            Utils.mapSeqUpdate(result, 1L, ((Number) Utils.get(position, 1L)).longValue() - 1L);
          } else {
            Utils.mapSeqUpdate(result, 2L, ((Number) Utils.get(position, 2L)).longValue() + 1L);
          }
        }

      } else {
        Number intPattern_69 = index;
        Boolean success_26 = Utils.equals(intPattern_69, 2L);

        if (success_26) {
          Utils.mapSeqUpdate(result, 2L, ((Number) Utils.get(position, 2L)).longValue() - 1L);
        } else {
          Utils.mapSeqUpdate(result, 1L, ((Number) Utils.get(position, 1L)).longValue() - 1L);
        }
      }

    } else {
      Number intPattern_70 = index;
      Boolean success_27 = Utils.equals(intPattern_70, 2L);

      if (success_27) {
        Utils.mapSeqUpdate(result, 1L, ((Number) Utils.get(position, 1L)).longValue() + 1L);
      } else {
        Utils.mapSeqUpdate(result, 2L, ((Number) Utils.get(position, 2L)).longValue() - 1L);
      }
    }

    return Utils.copy(result);
  }

  public VDMSeq getRotatedMino(final VDMSeq position) {

    VDMSeq result = Utils.copy(position);
    Number casesExp_28 = super.getOrientation();
    Number intPattern_71 = casesExp_28;
    Boolean success_28 = Utils.equals(intPattern_71, 0L);

    if (!(success_28)) {
      Number intPattern_72 = casesExp_28;
      success_28 = Utils.equals(intPattern_72, 1L);

      if (!(success_28)) {
        Number intPattern_73 = casesExp_28;
        success_28 = Utils.equals(intPattern_73, 2L);

        if (!(success_28)) {
          Number intPattern_74 = casesExp_28;
          success_28 = Utils.equals(intPattern_74, 3L);

          if (success_28) {
            Utils.mapSeqUpdate(result, 2L, ((Number) Utils.get(position, 2L)).longValue() + 2L);
          }

        } else {
          Utils.mapSeqUpdate(result, 1L, ((Number) Utils.get(position, 1L)).longValue() - 2L);
        }

      } else {
        Utils.mapSeqUpdate(result, 2L, ((Number) Utils.get(position, 2L)).longValue() - 2L);
      }

    } else {
      Utils.mapSeqUpdate(result, 1L, ((Number) Utils.get(position, 1L)).longValue() + 2L);
    }

    return Utils.copy(result);
  }

  public TetraminoS() {}

  public String toString() {

    return "TetraminoS{}";
  }
}
