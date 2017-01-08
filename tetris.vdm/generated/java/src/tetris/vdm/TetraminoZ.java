package tetris.vdm;

import java.util.*;
import org.overture.codegen.runtime.*;

@SuppressWarnings("all")
public class TetraminoZ extends Tetramino {
  public void cg_init_TetraminoZ_1(final Game game) {

    super.setColor(tetris.vdm.quotes.RedQuote.getInstance());
    super.setId(7L);
    super.initialSetMinoes(game, SeqUtil.seq(1L, 4L));
    return;
  }

  public TetraminoZ(final Game game) {

    cg_init_TetraminoZ_1(game);
  }

  protected VDMSeq getNextMino(final VDMSeq position, final Number index) {

    VDMSeq result = Utils.copy(position);
    Number casesExp_36 = super.getOrientation();
    Number intPattern_88 = casesExp_36;
    Boolean success_36 = Utils.equals(intPattern_88, 0L);

    if (!(success_36)) {
      Number intPattern_89 = casesExp_36;
      success_36 = Utils.equals(intPattern_89, 1L);

      if (!(success_36)) {
        Number intPattern_90 = casesExp_36;
        success_36 = Utils.equals(intPattern_90, 2L);

        if (!(success_36)) {
          Number intPattern_91 = casesExp_36;
          success_36 = Utils.equals(intPattern_91, 3L);

          if (success_36) {
            Number intPattern_92 = index;
            Boolean success_37 = Utils.equals(intPattern_92, 2L);

            if (success_37) {
              Utils.mapSeqUpdate(result, 2L, ((Number) Utils.get(position, 2L)).longValue() + 1L);
            } else {
              Utils.mapSeqUpdate(result, 1L, ((Number) Utils.get(position, 1L)).longValue() - 1L);
            }
          }

        } else {
          Number intPattern_93 = index;
          Boolean success_38 = Utils.equals(intPattern_93, 2L);

          if (success_38) {
            Utils.mapSeqUpdate(result, 1L, ((Number) Utils.get(position, 1L)).longValue() - 1L);
          } else {
            Utils.mapSeqUpdate(result, 2L, ((Number) Utils.get(position, 2L)).longValue() - 1L);
          }
        }

      } else {
        Number intPattern_94 = index;
        Boolean success_39 = Utils.equals(intPattern_94, 2L);

        if (success_39) {
          Utils.mapSeqUpdate(result, 2L, ((Number) Utils.get(position, 2L)).longValue() - 1L);
        } else {
          Utils.mapSeqUpdate(result, 1L, ((Number) Utils.get(position, 1L)).longValue() + 1L);
        }
      }

    } else {
      Number intPattern_95 = index;
      Boolean success_40 = Utils.equals(intPattern_95, 2L);

      if (success_40) {
        Utils.mapSeqUpdate(result, 1L, ((Number) Utils.get(position, 1L)).longValue() + 1L);
      } else {
        Utils.mapSeqUpdate(result, 2L, ((Number) Utils.get(position, 2L)).longValue() + 1L);
      }
    }

    return Utils.copy(result);
  }

  protected VDMSeq getRotatedMino(final VDMSeq position) {

    VDMSeq result = Utils.copy(position);
    Number casesExp_41 = super.getOrientation();
    Number intPattern_96 = casesExp_41;
    Boolean success_41 = Utils.equals(intPattern_96, 0L);

    if (!(success_41)) {
      Number intPattern_97 = casesExp_41;
      success_41 = Utils.equals(intPattern_97, 1L);

      if (!(success_41)) {
        Number intPattern_98 = casesExp_41;
        success_41 = Utils.equals(intPattern_98, 2L);

        if (!(success_41)) {
          Number intPattern_99 = casesExp_41;
          success_41 = Utils.equals(intPattern_99, 3L);

          if (success_41) {
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
