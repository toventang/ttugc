package com.p2082ss.android.ugc.aweme.shortvideo.model;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.TimeSpeedModelExtension;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.model.GreenScreenMaterialKt */
public final class GreenScreenMaterialKt {
    static {
        Covode.recordClassIndex(84589);
    }

    public static final String getAuthorName(TimeSpeedModelExtension timeSpeedModelExtension) {
        C89219l.m154721d(timeSpeedModelExtension, "");
        GreenScreenMaterial greenScreenMaterial = (GreenScreenMaterial) timeSpeedModelExtension.getFromRecordExtras("extra_key_green_screen_material");
        if (greenScreenMaterial != null) {
            return greenScreenMaterial.getAuthorName();
        }
        return null;
    }

    public static final String getEffectId(TimeSpeedModelExtension timeSpeedModelExtension) {
        C89219l.m154721d(timeSpeedModelExtension, "");
        GreenScreenMaterial greenScreenMaterial = (GreenScreenMaterial) timeSpeedModelExtension.getFromRecordExtras("extra_key_green_screen_material");
        if (greenScreenMaterial != null) {
            return greenScreenMaterial.getStickerId();
        }
        return null;
    }

    public static final Long getEndTime(TimeSpeedModelExtension timeSpeedModelExtension) {
        C89219l.m154721d(timeSpeedModelExtension, "");
        GreenScreenMaterial greenScreenMaterial = (GreenScreenMaterial) timeSpeedModelExtension.getFromRecordExtras("extra_key_green_screen_material");
        if (greenScreenMaterial != null) {
            return Long.valueOf(greenScreenMaterial.getEndTime());
        }
        return null;
    }

    public static final String getLocalPath(TimeSpeedModelExtension timeSpeedModelExtension) {
        C89219l.m154721d(timeSpeedModelExtension, "");
        GreenScreenMaterial greenScreenMaterial = (GreenScreenMaterial) timeSpeedModelExtension.getFromRecordExtras("extra_key_green_screen_material");
        if (greenScreenMaterial != null) {
            return greenScreenMaterial.getLocalPath();
        }
        return null;
    }

    public static final String getMediasource(TimeSpeedModelExtension timeSpeedModelExtension) {
        C89219l.m154721d(timeSpeedModelExtension, "");
        GreenScreenMaterial greenScreenMaterial = (GreenScreenMaterial) timeSpeedModelExtension.getFromRecordExtras("extra_key_green_screen_material");
        if (greenScreenMaterial != null) {
            return greenScreenMaterial.getMediasource();
        }
        return null;
    }

    public static final String getResId(TimeSpeedModelExtension timeSpeedModelExtension) {
        C89219l.m154721d(timeSpeedModelExtension, "");
        GreenScreenMaterial greenScreenMaterial = (GreenScreenMaterial) timeSpeedModelExtension.getFromRecordExtras("extra_key_green_screen_material");
        if (greenScreenMaterial != null) {
            return greenScreenMaterial.getResId();
        }
        return null;
    }

    public static final Long getStartTime(TimeSpeedModelExtension timeSpeedModelExtension) {
        C89219l.m154721d(timeSpeedModelExtension, "");
        GreenScreenMaterial greenScreenMaterial = (GreenScreenMaterial) timeSpeedModelExtension.getFromRecordExtras("extra_key_green_screen_material");
        if (greenScreenMaterial != null) {
            return Long.valueOf(greenScreenMaterial.getStartTime());
        }
        return null;
    }

    public static final Integer getType(TimeSpeedModelExtension timeSpeedModelExtension) {
        C89219l.m154721d(timeSpeedModelExtension, "");
        GreenScreenMaterial greenScreenMaterial = (GreenScreenMaterial) timeSpeedModelExtension.getFromRecordExtras("extra_key_green_screen_material");
        if (greenScreenMaterial != null) {
            return Integer.valueOf(greenScreenMaterial.getType());
        }
        return null;
    }

    public static final Bundle asBundle(GreenScreenMaterial greenScreenMaterial, Bundle bundle) {
        C89219l.m154721d(greenScreenMaterial, "");
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putParcelable("extra_key_green_screen_material", greenScreenMaterial);
        return bundle;
    }

    public static /* synthetic */ Bundle asBundle$default(GreenScreenMaterial greenScreenMaterial, Bundle bundle, int i, Object obj) {
        if ((i & 1) != 0) {
            bundle = null;
        }
        return asBundle(greenScreenMaterial, bundle);
    }
}
