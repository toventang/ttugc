package com.p2082ss.ttm.player;

import android.content.Context;
import android.view.Surface;
import com.bytedance.covode.number.Covode;
import com.p2082ss.ttm.p4406a.C86220c;
import java.util.HashMap;

/* renamed from: com.ss.ttm.player.k */
public abstract class AbstractC86251k {
    static {
        Covode.recordClassIndex(101428);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo136808a(int i, float f);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo136809a(int i, int i2);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo136810a(int i, long j);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo136811a(int i, String str);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo136812a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo136813a(float f, float f2);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo136814a(int i);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo136815a(long j);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo136816a(Surface surface);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo136817a(AudioProcessor audioProcessor);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo136818a(IMediaDataSource iMediaDataSource);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo136819a(LoadControl loadControl);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo136820a(MaskInfo maskInfo);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo136821a(SubInfo subInfo);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo136822a(AbstractC86246f fVar);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo136823a(String str);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo136824a(String str, int i);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract float mo136825b(int i, float f);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract int mo136826b(int i, int i2);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract long mo136827b(int i, long j);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo136828b();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo136829b(int i);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void mo136830c();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void mo136831c(int i);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void mo136832c(int i, int i2);

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract String mo136833d(int i);

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract void mo136834d();

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract Object mo136835e(int i);

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract void mo136836e();

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract void mo136837f();

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public abstract void mo136838g();

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public abstract Context mo136839h();

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public abstract boolean mo136840i();

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public abstract int mo136841j();

    /* renamed from: a */
    public static synchronized AbstractC86251k m148322a(Context context, TTPlayerClient tTPlayerClient, HashMap<Integer, Integer> hashMap) {
        C86287w wVar;
        synchronized (AbstractC86251k.class) {
            wVar = null;
            if (C86220c.f192436a == 0) {
                C86220c.m148185a();
                C86220c.f192436a = C86220c.f192437b[0];
            }
            if (C86220c.f192436a != 1 || (wVar = C86287w.m148519a(tTPlayerClient, context)) == null) {
                C86277r.m148504a(16, "not find start service info.");
                if (hashMap == null || hashMap.get(100).intValue() != 1) {
                    if (!C86277r.m148508a(7) && C86277r.m148503a(10, 0) < 3) {
                        C86277r.m148506a(7, true);
                    }
                } else if (hashMap.get(7).intValue() == 0 && hashMap.get(10).intValue() < 3) {
                    hashMap.put(7, 1);
                }
            }
        }
        return wVar;
    }
}
