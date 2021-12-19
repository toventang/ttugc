package com.bytedance.sdk.p1625a;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.p1625a.p1626a.p1627a.C22289b;
import com.bytedance.sdk.p1625a.p1626a.p1627a.C22291d;
import com.bytedance.sdk.p1625a.p1645h.p1646a.AbstractC22414i;

/* renamed from: com.bytedance.sdk.a.e */
public abstract class AbstractC22358e<T extends C22291d<K>, K extends AbstractC22414i> extends AbstractC22346c<T> {
    static {
        Covode.recordClassIndex(26174);
    }

    /* renamed from: a */
    public abstract void mo36686e(T t);

    /* renamed from: a */
    public abstract void mo36681a(T t, int i);

    @Override // com.bytedance.sdk.p1625a.AbstractC22346c
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ String mo36685d(C22289b bVar) {
        C22291d dVar = (C22291d) bVar;
        if (dVar == null || dVar.f52723j == null) {
            return null;
        }
        return dVar.f52723j.f53006k;
    }

    @Override // com.bytedance.sdk.p1625a.AbstractC22346c
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ boolean mo36683b(C22289b bVar) {
        C22291d dVar = (C22291d) bVar;
        if (!(dVar == null || dVar.f52723j == null)) {
            T t = dVar.f52723j;
            if (t.f53003h <= 1100 || t.f53003h >= 1199) {
                return false;
            }
            return true;
        }
        return false;
    }

    @Override // com.bytedance.sdk.p1625a.AbstractC22346c
    /* renamed from: c */
    public final /* synthetic */ boolean mo36684c(C22289b bVar) {
        C22291d dVar = (C22291d) bVar;
        if (!(dVar == null || dVar.f52723j == null)) {
            T t = dVar.f52723j;
            if ((t.f53003h == 1101 || t.f53003h == 1102 || t.f53003h == 1103) && !TextUtils.isEmpty(t.f53006k)) {
                return true;
            }
        }
        return false;
    }
}
