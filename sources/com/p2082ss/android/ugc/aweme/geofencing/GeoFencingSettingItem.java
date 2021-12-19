package com.p2082ss.android.ugc.aweme.geofencing;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.C1213t;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.geofencing.p3046b.C52880a;
import com.p2082ss.android.ugc.aweme.geofencing.p3046b.C52890b;
import com.p2082ss.android.ugc.aweme.geofencing.p3047c.C52891a;
import com.p2082ss.android.ugc.aweme.geofencing.p3048d.C52893a;
import com.p2082ss.android.ugc.aweme.geofencing.p3049ui.GeoFencingStatusActivity;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63269z;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.scene.C67279a;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.geofencing.GeoFencingSettingItem */
public final class GeoFencingSettingItem extends PublishSettingItem {

    /* renamed from: c */
    public static final C52858a f121594c = new C52858a((byte) 0);

    /* renamed from: a */
    public final C1213t<List<C52891a>> f121595a = new C1213t<>();

    /* renamed from: b */
    boolean f121596b;

    static {
        Covode.recordClassIndex(62259);
    }

    /* renamed from: com.ss.android.ugc.aweme.geofencing.GeoFencingSettingItem$a */
    public static final class C52858a {
        static {
            Covode.recordClassIndex(62261);
        }

        private C52858a() {
        }

        public /* synthetic */ C52858a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.geofencing.GeoFencingSettingItem$e */
    public static final class C52862e extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ GeoFencingSettingItem f121602a;

        /* renamed from: b */
        final /* synthetic */ List f121603b;

        static {
            Covode.recordClassIndex(62265);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C52862e(GeoFencingSettingItem geoFencingSettingItem, List list) {
            super(0);
            this.f121602a = geoFencingSettingItem;
            this.f121603b = list;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f121602a.f121595a.postValue(C52880a.m97732a(this.f121603b));
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public static boolean m97717a() {
        AbstractC63269z A = C63244g.m114602a().mo73255A();
        if (!A.mo93903b() || !A.mo93907f() || Build.VERSION.SDK_INT < 21) {
            return true;
        }
        return false;
    }

    public final List<String> getRegionCodeList() {
        List<C52891a> value = this.f121595a.getValue();
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

    /* renamed from: com.ss.android.ugc.aweme.geofencing.GeoFencingSettingItem$c */
    public static final class C52860c extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ GeoFencingSettingItem f121599a;

        /* renamed from: b */
        final /* synthetic */ List f121600b;

        static {
            Covode.recordClassIndex(62263);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C52860c(GeoFencingSettingItem geoFencingSettingItem, List list) {
            super(0);
            this.f121599a = geoFencingSettingItem;
            this.f121600b = list;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            List<C52891a> arrayList;
            C1213t<List<C52891a>> tVar = this.f121599a.f121595a;
            List list = this.f121600b;
            if (list != null) {
                List<C52891a> a = C52890b.m97735a();
                arrayList = new ArrayList<>();
                for (Object obj : list) {
                    ListIterator<C52891a> listIterator = a.listIterator(a.size());
                    while (true) {
                        if (!listIterator.hasPrevious()) {
                            break;
                        }
                        C52891a previous = listIterator.previous();
                        if (C89219l.m154714a((Object) previous.getTranslation(), obj)) {
                            if (previous != null) {
                                arrayList.add(previous);
                            }
                        }
                    }
                }
            } else {
                arrayList = C89086z.INSTANCE;
            }
            tVar.postValue(arrayList);
            return C89391z.f203057a;
        }
    }

    /* renamed from: b */
    public final void mo88508b() {
        List<C52891a> value = this.f121595a.getValue();
        if (value != null) {
            String str = "";
            C89219l.m154716b(value, str);
            int size = value.size();
            if (size != 0) {
                if (size != 1) {
                    String string = getContext().getString(R.string.ca2, ((C52891a) C89070n.m154579f((List) value)).getTranslation(), Integer.valueOf(value.size() - 1));
                    C89219l.m154716b(string, str);
                    str = string;
                } else {
                    str = ((C52891a) C89070n.m154579f((List) value)).getTranslation();
                }
            }
            setSubtitle(str);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.geofencing.GeoFencingSettingItem$b */
    public static final class C52859b<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ GeoFencingSettingItem f121598a;

        static {
            Covode.recordClassIndex(62262);
        }

        public C52859b(GeoFencingSettingItem geoFencingSettingItem) {
            this.f121598a = geoFencingSettingItem;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            this.f121598a.mo88508b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.geofencing.GeoFencingSettingItem$d */
    public static final class C52861d<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ GeoFencingSettingItem f121601a;

        static {
            Covode.recordClassIndex(62264);
        }

        public C52861d(GeoFencingSettingItem geoFencingSettingItem) {
            this.f121601a = geoFencingSettingItem;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            this.f121601a.mo88508b();
        }
    }

    public final void setReadOnly(boolean z) {
        this.f121596b = z;
        if (z) {
            mo88513c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.geofencing.GeoFencingSettingItem$f */
    static final class C52863f<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ AbstractC1214u f121604a;

        static {
            Covode.recordClassIndex(62266);
        }

        C52863f(AbstractC1214u uVar) {
            this.f121604a = uVar;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: androidx.lifecycle.u */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool;
            List list = (List) obj;
            AbstractC1214u uVar = this.f121604a;
            if (list != null) {
                bool = Boolean.valueOf(list.isEmpty());
            } else {
                bool = null;
            }
            uVar.onChanged(bool);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GeoFencingSettingItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C89219l.m154721d(context, "");
        C89219l.m154721d(attributeSet, "");
        if (m97717a()) {
            setVisibility(8);
            return;
        }
        setVisibility(0);
        setDrawableLeft(2131232294);
        setTitle(R.string.eq_);
        setSubtitle("");
        setOnClickListener(new View.OnClickListener(this) {
            /* class com.p2082ss.android.ugc.aweme.geofencing.GeoFencingSettingItem.View$OnClickListenerC528571 */

            /* renamed from: a */
            final /* synthetic */ GeoFencingSettingItem f121597a;

            static {
                Covode.recordClassIndex(62260);
            }

            {
                this.f121597a = r1;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                GeoFencingSettingItem geoFencingSettingItem = this.f121597a;
                Context context = geoFencingSettingItem.getContext();
                C89219l.m154716b(context, "");
                Activity a = C67279a.m119194a(context);
                List<C52891a> value = geoFencingSettingItem.f121595a.getValue();
                if (value == null) {
                    value = C89086z.INSTANCE;
                }
                boolean z = geoFencingSettingItem.f121596b;
                C89219l.m154721d(value, "");
                if (a != null) {
                    Intent intent = new Intent(a, GeoFencingStatusActivity.class);
                    intent.putExtra("extra.read_only", z);
                    C52893a.m97739a(intent, value);
                    a.startActivityForResult(intent, 1988, null);
                }
            }
        });
    }
}
