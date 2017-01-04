package tetris.vdm;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class TetraminoZ extends Tetramino {
  public void cg_init_TetraminoZ_1(final Board board) {

    super.setColor(tetris.vdm.quotes.RedQuote.getInstance());
    super.setId(7L);
    super.initialSetMinoes(board, SeqUtil.seq(1L, 4L));
    return;
  }

  public TetraminoZ(final Board board) {

    cg_init_TetraminoZ_1(board);
  }

  public VDMSeq getNextMino(final VDMSeq position, final Number index) {

    VDMSeq result = Utils.copy(position);
    Number casesExp_35 = super.getOrientation();
    Number intPattern_87 = casesExp_35;
    Boolean success_35 = Utils.equals(intPattern_87, 0L);

    if (!(success_35)) {
      Number intPattern_88 = casesExp_35;
      success_35 = Utils.equals(intPattern_88, 1L);

      if (!(success_35)) {
        Number intPattern_89 = casesExp_35;
        success_35 = Utils.equals(intPattern_89, 2L);

        if (!(success_35)) {
          Number intPattern_90 = casesExp_35;
          success_35 = Utils.equals(intPattern_90, 3L);

          if (success_35) {
            Number intPattern_91 = index;
            Boolean success_36 = Utils.equals(intPattern_91, 2L);

            if (success_36) {
              Utils.mapSeqUpdate(result, 2L, ((Number) Utils.get(position, 2L)).longValue() + 1L);
            } else {
              Utils.mapSeqUpdate(result, 1L, ((Number) Utils.get(position, 1L)).longValue() - 1L);
            }
          }

        } else {
          Number intPattern_92 = index;
          Boolean success_37 = Utils.equals(intPattern_92, 2L);

          if (success_37) {
            Utils.mapSeqUpdate(result, 1L, ((Number) Utils.get(position, 1L)).longValue() - 1L);
          } else {
            Utils.mapSeqUpdate(result, 2L, ((Number) Utils.get(position, 2L)).longValue() - 1L);
          }
        }

      } else {
        Number intPattern_93 = index;
        Boolean success_38 = Utils.equals(intPattern_93, 2L);

        if (success_38) {
          Utils.mapSeqUpdate(result, 2L, ((Number) Utils.get(position, 2L)).longValue() - 1L);
        } else {
          Utils.mapSeqUpdate(result, 1L, ((Number) Utils.get(position, 1L)).longValue() + 1L);
        }
      }

    } else {
      Number intPattern_94 = index;
      Boolean success_39 = Utils.equals(intPattern_94, 2L);

      if (success_39) {
        Utils.mapSeqUpdate(result, 1L, ((Number) Utils.get(position, 1L)).longValue() + 1L);
      } else {
        Utils.mapSeqUpdate(result, 2L, ((Number) Utils.get(position, 2L)).longValue() + 1L);
      }
    }

    return Utils.copy(result);
  }

  public VDMSeq getRotatedMino(final VDMSeq position) {

    VDMSeq result = Utils.copy(position);
    Number casesExp_40 = super.getOrientation();
    Number intPattern_95 = casesExp_40;
    Boolean success_40 = Utils.equals(intPattern_95, 0L);

    if (!(success_40)) {
      Number intPattern_96 = casesExp_40;
      success_40 = Utils.equals(intPattern_96, 1L);

      if (!(success_40)) {
        Number intPattern_97 = casesExp_40;
        success_40 = Utils.equals(intPattern_97, 2L);

        if (!(success_40)) {
          Number intPattern_98 = casesExp_40;
          success_40 = Utils.equals(intPattern_98, 3L);

          if (success_40) {
            Utils.mapSeqUpdate(result, 1L, ((Number) Utils.get(position, 1L)).longValue() - 2L);
          }

        } else {
          Utils.mapSeqUpdate(result, 2L, ((Number) Utils.get(position, 2L)).longValue() - 2L);
        }

      } else {
        Utils.mapSeqUpdate(result, 1L, ((Number) Utils.get(position, 1L)).longValue() + 2L);
      }

    } else {
      Utils.mapSeqUpdate(result, 2L, ((Number) Utils.get(position, 2L)).longValue() + 2L);
    }

    return Utils.copy(result);
  }

  public TetraminoZ() {}

  public String toString() {

    return "TetraminoZ{}";
  }
}
