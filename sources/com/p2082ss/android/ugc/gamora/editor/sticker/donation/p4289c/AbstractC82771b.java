package com.p2082ss.android.ugc.gamora.editor.sticker.donation.p4289c;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;

/* renamed from: com.ss.android.ugc.gamora.editor.sticker.donation.c.b */
public abstract class AbstractC82771b {

    /* renamed from: a */
    private String f185016a = String.valueOf(SystemClock.elapsedRealtime());

    static {
        Covode.recordClassIndex(96621);
    }

    public abstract String getDesc();

    public abstract String getDetailUrl();

    public abstract String getDonateLink();

    public abstract UrlModel getIcon();

    public abstract String getName();

    public abstract Integer getNgoId();

    public String getAddTime() {
        return this.f185016a;
    }

    public void setAddTime(String str) {
        this.f185016a = str;
    }
}
