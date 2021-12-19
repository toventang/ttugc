package com.google.android.gms.internal.measurement;

import com.bytedance.android.livesdk.livesetting.wallet.LiveRechargeAgeThresholdSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.google.android.gms.internal.measurement.AbstractC25972ga;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.fy */
public final class C25969fy<T extends AbstractC25972ga<T>> {

    /* renamed from: d */
    static final C25969fy f61158d = new C25969fy((byte) 0);

    /* renamed from: a */
    final C26042il<T, Object> f61159a;

    /* renamed from: b */
    public boolean f61160b;

    /* renamed from: c */
    boolean f61161c;

    /* renamed from: a */
    public final void mo42589a(C25969fy<T> fyVar) {
        for (int i = 0; i < fyVar.f61159a.mo42711b(); i++) {
            m50533c(fyVar.f61159a.mo42712b(i));
        }
        for (Map.Entry<T, Object> entry : fyVar.f61159a.mo42713c()) {
            m50533c(entry);
        }
    }

    public final int hashCode() {
        return this.f61159a.hashCode();
    }

    static {
        Covode.recordClassIndex(31384);
    }

    private C25969fy() {
        this.f61159a = C26042il.m50829a(16);
    }

    /* renamed from: a */
    public final void mo42588a() {
        if (!this.f61160b) {
            this.f61159a.mo42710a();
            this.f61160b = true;
        }
    }

    /* renamed from: b */
    public final Iterator<Map.Entry<T, Object>> mo42590b() {
        if (this.f61161c) {
            return new C25999gw(this.f61159a.entrySet().iterator());
        }
        return this.f61159a.entrySet().iterator();
    }

    /* renamed from: c */
    public final boolean mo42591c() {
        for (int i = 0; i < this.f61159a.mo42711b(); i++) {
            if (!m50532b(this.f61159a.mo42712b(i))) {
                return false;
            }
        }
        for (Map.Entry<T, Object> entry : this.f61159a.mo42713c()) {
            if (!m50532b(entry)) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object clone() {
        C25969fy fyVar = new C25969fy();
        for (int i = 0; i < this.f61159a.mo42711b(); i++) {
            Map.Entry<T, Object> b = this.f61159a.mo42712b(i);
            fyVar.m50531b(b.getKey(), b.getValue());
        }
        for (Map.Entry<T, Object> entry : this.f61159a.mo42713c()) {
            fyVar.m50531b(entry.getKey(), entry.getValue());
        }
        fyVar.f61161c = this.f61161c;
        return fyVar;
    }

    private C25969fy(byte b) {
        this(C26042il.m50829a(0));
        mo42588a();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25969fy)) {
            return false;
        }
        return this.f61159a.equals(((C25969fy) obj).f61159a);
    }

    private C25969fy(C26042il<T, Object> ilVar) {
        this.f61159a = ilVar;
        mo42588a();
    }

    /* renamed from: a */
    private final Object m50526a(T t) {
        Object obj = this.f61159a.get(t);
        if (!(obj instanceof C25998gv)) {
            return obj;
        }
        throw new NoSuchMethodError();
    }

    /* renamed from: a */
    static int m50525a(Map.Entry<T, Object> entry) {
        int m;
        int m2;
        T key = entry.getKey();
        Object value = entry.getValue();
        if (key.mo42599c() != EnumC26082ju.MESSAGE || key.mo42600d() || key.mo42601e()) {
            return m50523a((AbstractC25972ga<?>) key, value);
        }
        if (value instanceof C25998gv) {
            m = (AbstractC25958fq.m50394m(8) << 1) + AbstractC25958fq.m50386g(2, entry.getKey().mo42597a());
            m2 = AbstractC25958fq.m50364a(3, (C26002gz) value);
        } else {
            m = (AbstractC25958fq.m50394m(8) << 1) + AbstractC25958fq.m50386g(2, entry.getKey().mo42597a());
            m2 = AbstractC25958fq.m50394m(24) + AbstractC25958fq.m50371b((AbstractC26020hq) value);
        }
        return m + m2;
    }

    /* renamed from: b */
    private static <T extends AbstractC25972ga<T>> boolean m50532b(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        if (key.mo42599c() == EnumC26082ju.MESSAGE) {
            if (key.mo42600d()) {
                for (AbstractC26020hq hqVar : (List) entry.getValue()) {
                    if (!hqVar.mo42614G_()) {
                        return false;
                    }
                }
            } else {
                Object value = entry.getValue();
                if (value instanceof AbstractC26020hq) {
                    if (!((AbstractC26020hq) value).mo42614G_()) {
                        return false;
                    }
                } else if (value instanceof C25998gv) {
                    return true;
                } else {
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
            }
        }
        return true;
    }

    /* renamed from: c */
    private final void m50533c(Map.Entry<T, Object> entry) {
        AbstractC26020hq w;
        T key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof C25998gv) {
            throw new NoSuchMethodError();
        } else if (key.mo42600d()) {
            Object a = m50526a((AbstractC25972ga) key);
            if (a == null) {
                a = new ArrayList();
            }
            for (Object obj : (List) value) {
                ((List) a).add(m50527a(obj));
            }
            this.f61159a.put(key, a);
        } else if (key.mo42599c() == EnumC26082ju.MESSAGE) {
            Object a2 = m50526a((AbstractC25972ga) key);
            if (a2 == null) {
                this.f61159a.put(key, m50527a(value));
                return;
            }
            if (a2 instanceof AbstractC26029hz) {
                w = key.mo42603g();
            } else {
                ((AbstractC26020hq) a2).mo42622n();
                w = key.mo42602f().mo42629w();
            }
            this.f61159a.put(key, w);
        } else {
            this.f61159a.put(key, m50527a(value));
        }
    }

    /* renamed from: a */
    private static Object m50527a(Object obj) {
        if (obj instanceof AbstractC26029hz) {
            return ((AbstractC26029hz) obj).mo42704a();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    /* renamed from: a */
    public static int m50523a(AbstractC25972ga<?> gaVar, Object obj) {
        EnumC26076jo b = gaVar.mo42598b();
        int a = gaVar.mo42597a();
        if (!gaVar.mo42600d()) {
            return m50524a(b, a, obj);
        }
        int i = 0;
        if (gaVar.mo42601e()) {
            for (Object obj2 : (List) obj) {
                i += m50530b(b, obj2);
            }
            return AbstractC25958fq.m50394m(a << 3) + i + AbstractC25958fq.m50394m(i);
        }
        for (Object obj3 : (List) obj) {
            i += m50524a(b, a, obj3);
        }
        return i;
    }

    /* renamed from: b */
    private final void m50531b(T t, Object obj) {
        if (!t.mo42600d()) {
            m50529a(t.mo42598b(), obj);
        } else if (obj instanceof List) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((Collection) obj);
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj2 = arrayList.get(i);
                i++;
                m50529a(t.mo42598b(), obj2);
            }
            obj = arrayList;
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        if (obj instanceof C25998gv) {
            this.f61161c = true;
        }
        this.f61159a.put(t, obj);
    }

    /* renamed from: b */
    private static int m50530b(EnumC26076jo joVar, Object obj) {
        switch (C25973gb.f61165b[joVar.ordinal()]) {
            case 1:
                ((Double) obj).doubleValue();
                return 8;
            case 2:
                ((Float) obj).floatValue();
                return 4;
            case 3:
                return AbstractC25958fq.m50378d(((Long) obj).longValue());
            case 4:
                return AbstractC25958fq.m50378d(((Long) obj).longValue());
            case ABRConfig.ABR_STARTUP_MODEL_KEY:
                return AbstractC25958fq.m50393l(((Integer) obj).intValue());
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                ((Long) obj).longValue();
                return 8;
            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                ((Integer) obj).intValue();
                return 4;
            case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                ((Boolean) obj).booleanValue();
                return 1;
            case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                return ((AbstractC26020hq) obj).mo42621m();
            case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                if (obj instanceof C25998gv) {
                    return AbstractC25958fq.m50365a((C26002gz) obj);
                }
                return AbstractC25958fq.m50371b((AbstractC26020hq) obj);
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                if (obj instanceof AbstractC25943fb) {
                    return AbstractC25958fq.m50370b((AbstractC25943fb) obj);
                }
                return AbstractC25958fq.m50372b((String) obj);
            case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
                if (obj instanceof AbstractC25943fb) {
                    return AbstractC25958fq.m50370b((AbstractC25943fb) obj);
                }
                return AbstractC25958fq.m50373b((byte[]) obj);
            case ABRConfig.ABR_STARTUP_MAX_BITRATE:
                return AbstractC25958fq.m50394m(((Integer) obj).intValue());
            case ABRConfig.ABR_SELECT_SCENE:
                ((Integer) obj).intValue();
                return 4;
            case 15:
                ((Long) obj).longValue();
                return 8;
            case 16:
                return AbstractC25958fq.m50394m(AbstractC25958fq.m50395n(((Integer) obj).intValue()));
            case 17:
                return AbstractC25958fq.m50378d(AbstractC25958fq.m50381e(((Long) obj).longValue()));
            case LiveRechargeAgeThresholdSetting.DEFAULT:
                if (obj instanceof AbstractC25988gl) {
                    return AbstractC25958fq.m50393l(((AbstractC25988gl) obj).zza());
                }
                return AbstractC25958fq.m50393l(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m50529a(com.google.android.gms.internal.measurement.EnumC26076jo r2, java.lang.Object r3) {
        /*
            com.google.android.gms.internal.measurement.C25989gm.m50599a(r3)
            int[] r1 = com.google.android.gms.internal.measurement.C25973gb.f61164a
            com.google.android.gms.internal.measurement.ju r0 = r2.zza()
            int r0 = r0.ordinal()
            r1 = r1[r0]
            r0 = 1
            r0 = 0
            switch(r1) {
                case 1: goto L_0x0046;
                case 2: goto L_0x0043;
                case 3: goto L_0x0040;
                case 4: goto L_0x003d;
                case 5: goto L_0x003a;
                case 6: goto L_0x0037;
                case 7: goto L_0x002e;
                case 8: goto L_0x0025;
                case 9: goto L_0x001c;
                default: goto L_0x0014;
            }
        L_0x0014:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Wrong object type used with protocol message reflection."
            r1.<init>(r0)
            throw r1
        L_0x001c:
            boolean r0 = r3 instanceof com.google.android.gms.internal.measurement.AbstractC26020hq
            if (r0 != 0) goto L_0x004a
            boolean r0 = r3 instanceof com.google.android.gms.internal.measurement.C25998gv
            if (r0 == 0) goto L_0x0014
            goto L_0x004a
        L_0x0025:
            boolean r0 = r3 instanceof java.lang.Integer
            if (r0 != 0) goto L_0x004a
            boolean r0 = r3 instanceof com.google.android.gms.internal.measurement.AbstractC25988gl
            if (r0 == 0) goto L_0x0014
            goto L_0x004a
        L_0x002e:
            boolean r0 = r3 instanceof com.google.android.gms.internal.measurement.AbstractC25943fb
            if (r0 != 0) goto L_0x004a
            boolean r0 = r3 instanceof byte[]
            if (r0 == 0) goto L_0x0014
            goto L_0x004a
        L_0x0037:
            boolean r0 = r3 instanceof java.lang.String
            goto L_0x0048
        L_0x003a:
            boolean r0 = r3 instanceof java.lang.Boolean
            goto L_0x0048
        L_0x003d:
            boolean r0 = r3 instanceof java.lang.Double
            goto L_0x0048
        L_0x0040:
            boolean r0 = r3 instanceof java.lang.Float
            goto L_0x0048
        L_0x0043:
            boolean r0 = r3 instanceof java.lang.Long
            goto L_0x0048
        L_0x0046:
            boolean r0 = r3 instanceof java.lang.Integer
        L_0x0048:
            if (r0 == 0) goto L_0x0014
        L_0x004a:
            return
            switch-data {1->0x0046, 2->0x0043, 3->0x0040, 4->0x003d, 5->0x003a, 6->0x0037, 7->0x002e, 8->0x0025, 9->0x001c, }
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C25969fy.m50529a(com.google.android.gms.internal.measurement.jo, java.lang.Object):void");
    }

    /* renamed from: a */
    static int m50524a(EnumC26076jo joVar, int i, Object obj) {
        int m = AbstractC25958fq.m50394m(i << 3);
        if (joVar == EnumC26076jo.GROUP) {
            m <<= 1;
        }
        return m + m50530b(joVar, obj);
    }

    /* renamed from: a */
    static void m50528a(AbstractC25958fq fqVar, EnumC26076jo joVar, int i, Object obj) {
        if (joVar == EnumC26076jo.GROUP) {
            fqVar.mo42501a(i, 3);
            ((AbstractC26020hq) obj).mo42616a(fqVar);
            fqVar.mo42501a(i, 4);
            return;
        }
        fqVar.mo42501a(i, joVar.zzb());
        switch (C25973gb.f61165b[joVar.ordinal()]) {
            case 1:
                fqVar.mo42496a(((Double) obj).doubleValue());
                return;
            case 2:
                fqVar.mo42497a(((Float) obj).floatValue());
                return;
            case 3:
                fqVar.mo42508a(((Long) obj).longValue());
                return;
            case 4:
                fqVar.mo42508a(((Long) obj).longValue());
                return;
            case ABRConfig.ABR_STARTUP_MODEL_KEY:
                fqVar.mo42498a(((Integer) obj).intValue());
                return;
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                fqVar.mo42524c(((Long) obj).longValue());
                return;
            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                fqVar.mo42525d(((Integer) obj).intValue());
                return;
            case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                fqVar.mo42513a(((Boolean) obj).booleanValue());
                return;
            case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                ((AbstractC26020hq) obj).mo42616a(fqVar);
                return;
            case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                fqVar.mo42510a((AbstractC26020hq) obj);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                if (obj instanceof AbstractC25943fb) {
                    fqVar.mo42509a((AbstractC25943fb) obj);
                    return;
                } else {
                    fqVar.mo42511a((String) obj);
                    return;
                }
            case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
                if (obj instanceof AbstractC25943fb) {
                    fqVar.mo42509a((AbstractC25943fb) obj);
                    return;
                }
                byte[] bArr = (byte[]) obj;
                fqVar.mo42514a(bArr, bArr.length);
                return;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE:
                fqVar.mo42516b(((Integer) obj).intValue());
                return;
            case ABRConfig.ABR_SELECT_SCENE:
                fqVar.mo42525d(((Integer) obj).intValue());
                return;
            case 15:
                fqVar.mo42524c(((Long) obj).longValue());
                return;
            case 16:
                fqVar.mo42521c(((Integer) obj).intValue());
                return;
            case 17:
                fqVar.mo42520b(((Long) obj).longValue());
                return;
            case LiveRechargeAgeThresholdSetting.DEFAULT:
                if (obj instanceof AbstractC25988gl) {
                    fqVar.mo42498a(((AbstractC25988gl) obj).zza());
                    return;
                } else {
                    fqVar.mo42498a(((Integer) obj).intValue());
                    return;
                }
            default:
                return;
        }
    }
}
