package com.p2082ss.android.ugc.aweme.geofencing;

import android.os.Build;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.C1213t;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.geofencing.GeoFencingSettingItem;
import com.p2082ss.android.ugc.aweme.geofencing.p3046b.C52880a;
import com.p2082ss.android.ugc.aweme.geofencing.p3047c.C52891a;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63269z;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.geofencing.a */
public final class C52864a {

    /* renamed from: d */
    public static final C52865a f121616d = new C52865a((byte) 0);

    /* renamed from: a */
    public final C1213t<C89391z> f121617a = new C1213t<>();

    /* renamed from: b */
    public GeoFencingSettingItem f121618b;

    /* renamed from: c */
    public final C1213t<List<C52891a>> f121619c = new C1213t<>();

    static {
        Covode.recordClassIndex(62268);
    }

    /* renamed from: com.ss.android.ugc.aweme.geofencing.a$a */
    public static final class C52865a {
        static {
            Covode.recordClassIndex(62269);
        }

        private C52865a() {
        }

        /* renamed from: a */
        public static boolean m97724a() {
            AbstractC63269z A = C63244g.m114602a().mo73255A();
            if (!A.mo93903b() || !A.mo93907f() || Build.VERSION.SDK_INT < 21) {
                return true;
            }
            return false;
        }

        public /* synthetic */ C52865a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.geofencing.a$d */
    public static final class C52868d extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C52864a f121622a;

        /* renamed from: b */
        final /* synthetic */ List f121623b;

        static {
            Covode.recordClassIndex(62272);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C52868d(C52864a aVar, List list) {
            super(0);
            this.f121622a = aVar;
            this.f121623b = list;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f121622a.f121619c.postValue(C52880a.m97732a(this.f121623b));
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public final List<String> mo88536a() {
        List<C52891a> value = this.f121619c.getValue();
        if (value == null) {
            return C89086z.INSTANCE;
        }
        ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) value, 10));
        Iterator<T> it = value.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getCode());
        }
        return arrayList;
    }

    /* renamed from: com.ss.android.ugc.aweme.geofencing.a$b */
    static final class C52866b<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ GeoFencingSettingItem f121620a;

        static {
            Covode.recordClassIndex(62270);
        }

        C52866b(GeoFencingSettingItem geoFencingSettingItem) {
            this.f121620a = geoFencingSettingItem;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            this.f121620a.mo88508b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.geofencing.a$c */
    public static final class C52867c<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C52864a f121621a;

        static {
            Covode.recordClassIndex(62271);
        }

        public C52867c(C52864a aVar) {
            this.f121621a = aVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            this.f121621a.f121617a.setValue(C89391z.f203057a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.geofencing.a$e */
    static final class C52869e<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ AbstractC1214u f121624a;

        static {
            Covode.recordClassIndex(62273);
        }

        C52869e(AbstractC1214u uVar) {
            this.f121624a = uVar;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: androidx.lifecycle.u */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool;
            List list = (List) obj;
            AbstractC1214u uVar = this.f121624a;
            if (list != null) {
                bool = Boolean.valueOf(list.isEmpty());
            } else {
                bool = null;
            }
            uVar.onChanged(bool);
        }
    }

    /* renamed from: a */
    public final void mo88537a(AbstractC1204m mVar, AbstractC1214u<Boolean> uVar) {
        C89219l.m154721d(mVar, "");
        C89219l.m154721d(uVar, "");
        GeoFencingSettingItem geoFencingSettingItem = this.f121618b;
        if (geoFencingSettingItem != null) {
            C89219l.m154721d(mVar, "");
            C89219l.m154721d(uVar, "");
            geoFencingSettingItem.f121595a.observe(mVar, new GeoFencingSettingItem.C52863f(uVar));
        }
        this.f121619c.observe(mVar, new C52869e(uVar));
    }

    /* renamed from: a */
    public final void mo88538a(AbstractC1204m mVar, GeoFencingSettingItem geoFencingSettingItem) {
        C89219l.m154721d(mVar, "");
        C89219l.m154721d(geoFencingSettingItem, "");
        this.f121618b = geoFencingSettingItem;
        this.f121617a.removeObservers(mVar);
        this.f121617a.observe(mVar, new C52866b(geoFencingSettingItem));
        geoFencingSettingItem.f121595a.setValue(this.f121619c.getValue());
    }
}
