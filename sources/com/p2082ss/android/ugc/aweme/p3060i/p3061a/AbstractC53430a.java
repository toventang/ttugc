package com.p2082ss.android.ugc.aweme.p3060i.p3061a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.C33594aj;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/* renamed from: com.ss.android.ugc.aweme.i.a.a */
public abstract class AbstractC53430a {

    /* renamed from: b */
    protected static int f122644b = 12;

    /* renamed from: a */
    protected int f122645a;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract C33594aj<Long> mo60117a();

    public AbstractC53430a() {
        this(5);
    }

    static {
        Covode.recordClassIndex(62999);
    }

    public AbstractC53430a(int i) {
        this.f122645a = i;
    }

    /* renamed from: a */
    public final void mo89999a(long j) {
        mo60117a().mo59940b(Long.valueOf(j));
    }

    /* renamed from: b */
    public final boolean mo90000b(long j) {
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(j);
        int i = instance.get(11);
        if (i >= 0 && i < this.f122645a) {
            instance.add(5, -1);
        }
        instance.set(11, this.f122645a);
        instance.set(12, 0);
        instance.set(13, 0);
        long timeInMillis = instance.getTimeInMillis();
        new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(instance.getTime());
        if (mo60117a().mo59941c().longValue() < timeInMillis) {
            return true;
        }
        return false;
    }
}
