package com.p2082ss.android.ugc.aweme.effect;

import com.bytedance.covode.number.Covode;
import com.google.p1998c.p1999a.C27241i;
import java.io.Serializable;
import java.util.Arrays;

/* renamed from: com.ss.android.ugc.aweme.effect.EffectModel */
public class EffectModel implements Serializable {
    public String category;
    public int color;
    public int duration;
    public String extra;
    public String hint;
    public String iconUrl;
    public int imagePath;
    public boolean isEnabled = true;
    public String key;
    public String name;
    public String resDir;
    public int type;

    static {
        Covode.recordClassIndex(54828);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.name, this.hint, Integer.valueOf(this.imagePath), this.key, Integer.valueOf(this.type), this.iconUrl, this.resDir, Integer.valueOf(this.color), Integer.valueOf(this.duration), this.category, this.extra, Boolean.valueOf(this.isEnabled)});
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            EffectModel effectModel = (EffectModel) obj;
            if (this.imagePath != effectModel.imagePath || this.type != effectModel.type || this.color != effectModel.color || this.duration != effectModel.duration || this.isEnabled != effectModel.isEnabled || !C27241i.m54222a(this.name, effectModel.name) || !C27241i.m54222a(this.hint, effectModel.hint) || !C27241i.m54222a(this.key, effectModel.key) || !C27241i.m54222a(this.iconUrl, effectModel.iconUrl) || !C27241i.m54222a(this.resDir, effectModel.resDir) || !C27241i.m54222a(this.category, effectModel.category) || !C27241i.m54222a(this.extra, effectModel.extra)) {
                return false;
            }
            return true;
        }
        return false;
    }
}
