package com.p2082ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.antiaddiction.p3369a;

import com.bytedance.covode.number.Covode;
import java.util.Calendar;

/* renamed from: com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.antiaddiction.a.a */
public abstract class AbstractC57863a {

    /* renamed from: b */
    protected static int f131927b = 12;

    /* renamed from: a */
    protected int f131928a;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Long mo95168a();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void mo95171c(long j);

    public AbstractC57863a() {
        this((byte) 0);
    }

    static {
        Covode.recordClassIndex(67873);
    }

    /* renamed from: a */
    public final void mo95169a(long j) {
        mo95171c(j);
    }

    private AbstractC57863a(byte b) {
        this.f131928a = 5;
    }

    /* renamed from: b */
    public final boolean mo95170b(long j) {
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(j);
        int i = instance.get(11);
        if (i >= 0 && i < this.f131928a) {
            instance.add(5, -1);
        }
        instance.set(11, this.f131928a);
        instance.set(12, 0);
        instance.set(13, 0);
        if (mo95168a().longValue() < instance.getTimeInMillis()) {
            return true;
        }
        return false;
    }
}
