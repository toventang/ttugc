package com.bytedance.lynx.p1507a.p1508a.p1513e;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import com.bytedance.covode.number.Covode;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89214g;

/* renamed from: com.bytedance.lynx.a.a.e.a */
public final class C21142a implements Serializable {

    /* renamed from: a */
    private int f50166a;

    /* renamed from: b */
    private int f50167b;

    /* renamed from: c */
    private int f50168c;

    static {
        Covode.recordClassIndex(24758);
    }

    public C21142a() {
        this(0, 1, null);
    }

    public final int getColor() {
        return this.f50168c;
    }

    public final int getColorDark() {
        return this.f50166a;
    }

    public final int getColorLight() {
        return this.f50167b;
    }

    public final void setColor(int i) {
        this.f50168c = i;
    }

    public final void setColorDark(int i) {
        this.f50166a = i;
    }

    public final void setColorLight(int i) {
        this.f50167b = i;
    }

    public C21142a(int i) {
        this.f50168c = i;
    }

    public final int getColor(Context context) {
        Resources resources;
        Configuration configuration;
        int i;
        if (context == null || (resources = context.getResources()) == null || (configuration = resources.getConfiguration()) == null) {
            return this.f50168c;
        }
        if ((configuration.uiMode & 48) == 32) {
            i = this.f50166a;
        } else {
            i = this.f50167b;
        }
        if (i == 0) {
            return this.f50168c;
        }
        return i;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C21142a(int i, int i2, C89214g gVar) {
        this((i2 & 1) != 0 ? 0 : i);
    }
}
