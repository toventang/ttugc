package com.bytedance.android.livesdk.model.message;

import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.model.message.bb */
public class C9664bb {
    @AbstractC27891c(mo46611a = "high_light_color")

    /* renamed from: a */
    public String f23518a;
    @AbstractC27891c(mo46611a = "contents")

    /* renamed from: b */
    public List<C9663ba> f23519b;

    static {
        Covode.recordClassIndex(11206);
    }

    /* renamed from: a */
    public final CharSequence mo16594a() {
        List<C9663ba> list = this.f23519b;
        if (list == null || list.size() <= 0) {
            return "";
        }
        int i = -1;
        boolean z = false;
        String str = this.f23518a;
        if (str != null) {
            try {
                i = Color.parseColor(str);
                z = true;
            } catch (IllegalArgumentException unused) {
            }
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(i);
        for (C9663ba baVar : this.f23519b) {
            if (baVar != null && !TextUtils.isEmpty(baVar.f23516a)) {
                spannableStringBuilder.append((CharSequence) baVar.f23516a);
                if (z && baVar.f23517b) {
                    spannableStringBuilder.setSpan(foregroundColorSpan, spannableStringBuilder.length() - baVar.f23516a.length(), spannableStringBuilder.length(), 33);
                }
            }
        }
        return spannableStringBuilder;
    }
}
