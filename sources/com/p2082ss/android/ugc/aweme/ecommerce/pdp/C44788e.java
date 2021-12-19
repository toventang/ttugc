package com.p2082ss.android.ugc.aweme.ecommerce.pdp;

import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.DialogInterface$OnCancelListenerC0944d;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1171ab;
import androidx.lifecycle.C1175ad;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.base.p1291a.C18411b;
import com.bytedance.jedi.arch.AbstractC20362a;
import com.bytedance.jedi.arch.AbstractC20367ae;
import com.bytedance.jedi.arch.AbstractC20368af;
import com.bytedance.jedi.arch.AbstractC20380ar;
import com.bytedance.jedi.arch.AbstractC20477i;
import com.bytedance.jedi.arch.AbstractC20527q;
import com.bytedance.jedi.arch.AbstractC20534v;
import com.bytedance.jedi.arch.C20370ah;
import com.bytedance.jedi.arch.C20373ak;
import com.bytedance.jedi.arch.C20374al;
import com.bytedance.jedi.arch.C20375am;
import com.bytedance.jedi.arch.C20376an;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.lifecycleAwareLazy;
import com.bytedance.provider.p1587vm.ScopeViewModel;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.p1717e.C23073a;
import com.bytedance.tux.p1722h.C23163i;
import com.bytedance.widget.C23669c;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.p2082ss.android.ugc.aweme.base.arch.C34499i;
import com.p2082ss.android.ugc.aweme.ecommerce.p2818a.C43313a;
import com.p2082ss.android.ugc.aweme.ecommerce.p2818a.C43314b;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.IPdpStarter;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.PdpViewModel;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2850b.C44720k;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2851c.C44769d;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.repository.C44867d;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.repository.dto.ProductPackStruct;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.view.compat.C45002b;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.widget.PdpBodyWidget;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.widget.PdpBottomNavBarWidget;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.widget.PdpHeadNavBarWidget;
import com.p2082ss.android.ugc.aweme.ecommerce.preloader.ImagePreloadExperiment;
import com.p2082ss.android.ugc.aweme.ecommerce.util.C45563h;
import com.p2082ss.android.ugc.aweme.utils.C80534hh;
import com.p2082ss.android.ugc.aweme.video.AbstractC80747i;
import com.p2082ss.android.ugc.aweme.video.C81079v;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.trill.R;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.C89391z;
import p4600h.p4611f.C89170a;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4612a.AbstractC89188r;
import p4600h.p4611f.p4612a.AbstractC89189s;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89277c;
import p4600h.p4620k.AbstractC89290k;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.e */
public final class C44788e extends C45002b implements AbstractC20380ar<C34499i>, AbstractC20527q {

    /* renamed from: c */
    public static final C44792c f104496c = new C44792c((byte) 0);

    /* renamed from: a */
    public C34499i f104497a = new C34499i();

    /* renamed from: b */
    public AbstractC88412b f104498b;

    /* renamed from: i */
    private final lifecycleAwareLazy f104499i;

    /* renamed from: j */
    private boolean f104500j;

    /* renamed from: k */
    private SparseArray f104501k;

    static {
        Covode.recordClassIndex(53174);
    }

    /* renamed from: a */
    public final PdpViewModel mo75926a() {
        return (PdpViewModel) this.f104499i.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.pdp.view.compat.C45002b
    /* renamed from: b */
    public final void mo75931b() {
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.pdp.view.compat.C45002b
    /* renamed from: i */
    public final View mo75938i() {
        if (this.f104501k == null) {
            this.f104501k = new SparseArray();
        }
        View view = (View) this.f104501k.get(R.id.emn);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(R.id.emn);
        this.f104501k.put(R.id.emn, findViewById);
        return findViewById;
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.pdp.view.compat.C45002b
    /* renamed from: j */
    public final void mo75939j() {
        SparseArray sparseArray = this.f104501k;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, com.p2082ss.android.ugc.aweme.ecommerce.pdp.view.compat.C45002b, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo75939j();
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.e$c */
    public static final class C44792c {
        static {
            Covode.recordClassIndex(53178);
        }

        private C44792c() {
        }

        public /* synthetic */ C44792c(byte b) {
            this();
        }
    }

    /* Return type fixed from 'androidx.lifecycle.ad$b' to match base method */
    @Override // com.bytedance.jedi.arch.AbstractC20380ar
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ C34499i mo33721d() {
        return this.f104497a;
    }

    @Override // com.bytedance.jedi.arch.AbstractC20534v
    public final AbstractC1204m getLifecycleOwner() {
        return this;
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final AbstractC20534v getLifecycleOwnerHolder() {
        return this;
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.g' to match base method */
    @Override // com.bytedance.jedi.arch.AbstractC20367ae
    public final /* bridge */ /* synthetic */ AbstractC20477i getReceiver() {
        return this;
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final AbstractC20367ae<AbstractC20477i> getReceiverHolder() {
        return this;
    }

    /* renamed from: a */
    private static String m87504a(String str, Map<String, ? extends Object> map) {
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        Object obj = map.get("author_id");
        String str13 = null;
        if (obj != null) {
            Class<?> cls = obj.getClass();
            if (C89219l.m154714a(cls, Integer.class)) {
                str2 = String.valueOf(((Integer) obj).intValue());
            } else if (C89219l.m154714a(cls, Short.class)) {
                str2 = String.valueOf((int) ((Short) obj).shortValue());
            } else if (C89219l.m154714a(cls, Long.class)) {
                str2 = String.valueOf(((Long) obj).longValue());
            } else if (C89219l.m154714a(cls, Float.class)) {
                str2 = String.valueOf(((Float) obj).floatValue());
            } else if (C89219l.m154714a(cls, Double.class)) {
                str2 = String.valueOf(((Double) obj).doubleValue());
            } else if (C89219l.m154714a(cls, Integer.TYPE)) {
                str2 = String.valueOf(((Integer) obj).intValue());
            } else if (C89219l.m154714a(cls, Short.TYPE)) {
                str2 = String.valueOf((int) ((Short) obj).shortValue());
            } else if (C89219l.m154714a(cls, Long.TYPE)) {
                str2 = String.valueOf(((Long) obj).longValue());
            } else if (C89219l.m154714a(cls, Float.TYPE)) {
                str2 = String.valueOf(((Float) obj).floatValue());
            } else {
                str2 = C89219l.m154714a(cls, Double.TYPE) ? String.valueOf(((Double) obj).doubleValue()) : obj.toString();
            }
        } else {
            str2 = null;
        }
        buildUpon.appendQueryParameter("anchor_id", str2);
        Object obj2 = map.get("source_content_id");
        if (obj2 != null) {
            Class<?> cls2 = obj2.getClass();
            if (C89219l.m154714a(cls2, Integer.class)) {
                str3 = String.valueOf(((Integer) obj2).intValue());
            } else if (C89219l.m154714a(cls2, Short.class)) {
                str3 = String.valueOf((int) ((Short) obj2).shortValue());
            } else if (C89219l.m154714a(cls2, Long.class)) {
                str3 = String.valueOf(((Long) obj2).longValue());
            } else if (C89219l.m154714a(cls2, Float.class)) {
                str3 = String.valueOf(((Float) obj2).floatValue());
            } else if (C89219l.m154714a(cls2, Double.class)) {
                str3 = String.valueOf(((Double) obj2).doubleValue());
            } else if (C89219l.m154714a(cls2, Integer.TYPE)) {
                str3 = String.valueOf(((Integer) obj2).intValue());
            } else if (C89219l.m154714a(cls2, Short.TYPE)) {
                str3 = String.valueOf((int) ((Short) obj2).shortValue());
            } else if (C89219l.m154714a(cls2, Long.TYPE)) {
                str3 = String.valueOf(((Long) obj2).longValue());
            } else if (C89219l.m154714a(cls2, Float.TYPE)) {
                str3 = String.valueOf(((Float) obj2).floatValue());
            } else if (C89219l.m154714a(cls2, Double.TYPE)) {
                str3 = String.valueOf(((Double) obj2).doubleValue());
            } else {
                str3 = obj2.toString();
            }
        } else {
            str3 = null;
        }
        buildUpon.appendQueryParameter("group_id", str3);
        Object obj3 = map.get("entrance_form");
        if (obj3 != null) {
            Class<?> cls3 = obj3.getClass();
            if (C89219l.m154714a(cls3, Integer.class)) {
                str4 = String.valueOf(((Integer) obj3).intValue());
            } else if (C89219l.m154714a(cls3, Short.class)) {
                str4 = String.valueOf((int) ((Short) obj3).shortValue());
            } else if (C89219l.m154714a(cls3, Long.class)) {
                str4 = String.valueOf(((Long) obj3).longValue());
            } else if (C89219l.m154714a(cls3, Float.class)) {
                str4 = String.valueOf(((Float) obj3).floatValue());
            } else if (C89219l.m154714a(cls3, Double.class)) {
                str4 = String.valueOf(((Double) obj3).doubleValue());
            } else if (C89219l.m154714a(cls3, Integer.TYPE)) {
                str4 = String.valueOf(((Integer) obj3).intValue());
            } else if (C89219l.m154714a(cls3, Short.TYPE)) {
                str4 = String.valueOf((int) ((Short) obj3).shortValue());
            } else if (C89219l.m154714a(cls3, Long.TYPE)) {
                str4 = String.valueOf(((Long) obj3).longValue());
            } else if (C89219l.m154714a(cls3, Float.TYPE)) {
                str4 = String.valueOf(((Float) obj3).floatValue());
            } else if (C89219l.m154714a(cls3, Double.TYPE)) {
                str4 = String.valueOf(((Double) obj3).doubleValue());
            } else {
                str4 = obj3.toString();
            }
        } else {
            str4 = null;
        }
        buildUpon.appendQueryParameter("enter_from", str4);
        Object obj4 = map.get("anchor_show_type");
        if (obj4 != null) {
            Class<?> cls4 = obj4.getClass();
            if (C89219l.m154714a(cls4, Integer.class)) {
                str5 = String.valueOf(((Integer) obj4).intValue());
            } else if (C89219l.m154714a(cls4, Short.class)) {
                str5 = String.valueOf((int) ((Short) obj4).shortValue());
            } else if (C89219l.m154714a(cls4, Long.class)) {
                str5 = String.valueOf(((Long) obj4).longValue());
            } else if (C89219l.m154714a(cls4, Float.class)) {
                str5 = String.valueOf(((Float) obj4).floatValue());
            } else if (C89219l.m154714a(cls4, Double.class)) {
                str5 = String.valueOf(((Double) obj4).doubleValue());
            } else if (C89219l.m154714a(cls4, Integer.TYPE)) {
                str5 = String.valueOf(((Integer) obj4).intValue());
            } else if (C89219l.m154714a(cls4, Short.TYPE)) {
                str5 = String.valueOf((int) ((Short) obj4).shortValue());
            } else if (C89219l.m154714a(cls4, Long.TYPE)) {
                str5 = String.valueOf(((Long) obj4).longValue());
            } else if (C89219l.m154714a(cls4, Float.TYPE)) {
                str5 = String.valueOf(((Float) obj4).floatValue());
            } else if (C89219l.m154714a(cls4, Double.TYPE)) {
                str5 = String.valueOf(((Double) obj4).doubleValue());
            } else {
                str5 = obj4.toString();
            }
        } else {
            str5 = null;
        }
        buildUpon.appendQueryParameter("anchor_show_type", str5);
        Object obj5 = map.get("product_source");
        if (obj5 != null) {
            Class<?> cls5 = obj5.getClass();
            if (C89219l.m154714a(cls5, Integer.class)) {
                str6 = String.valueOf(((Integer) obj5).intValue());
            } else if (C89219l.m154714a(cls5, Short.class)) {
                str6 = String.valueOf((int) ((Short) obj5).shortValue());
            } else if (C89219l.m154714a(cls5, Long.class)) {
                str6 = String.valueOf(((Long) obj5).longValue());
            } else if (C89219l.m154714a(cls5, Float.class)) {
                str6 = String.valueOf(((Float) obj5).floatValue());
            } else if (C89219l.m154714a(cls5, Double.class)) {
                str6 = String.valueOf(((Double) obj5).doubleValue());
            } else if (C89219l.m154714a(cls5, Integer.TYPE)) {
                str6 = String.valueOf(((Integer) obj5).intValue());
            } else if (C89219l.m154714a(cls5, Short.TYPE)) {
                str6 = String.valueOf((int) ((Short) obj5).shortValue());
            } else if (C89219l.m154714a(cls5, Long.TYPE)) {
                str6 = String.valueOf(((Long) obj5).longValue());
            } else if (C89219l.m154714a(cls5, Float.TYPE)) {
                str6 = String.valueOf(((Float) obj5).floatValue());
            } else if (C89219l.m154714a(cls5, Double.TYPE)) {
                str6 = String.valueOf(((Double) obj5).doubleValue());
            } else {
                str6 = obj5.toString();
            }
        } else {
            str6 = null;
        }
        buildUpon.appendQueryParameter("product_source", str6);
        Object obj6 = map.get("source_from");
        if (obj6 != null) {
            Class<?> cls6 = obj6.getClass();
            if (C89219l.m154714a(cls6, Integer.class)) {
                str7 = String.valueOf(((Integer) obj6).intValue());
            } else if (C89219l.m154714a(cls6, Short.class)) {
                str7 = String.valueOf((int) ((Short) obj6).shortValue());
            } else if (C89219l.m154714a(cls6, Long.class)) {
                str7 = String.valueOf(((Long) obj6).longValue());
            } else if (C89219l.m154714a(cls6, Float.class)) {
                str7 = String.valueOf(((Float) obj6).floatValue());
            } else if (C89219l.m154714a(cls6, Double.class)) {
                str7 = String.valueOf(((Double) obj6).doubleValue());
            } else if (C89219l.m154714a(cls6, Integer.TYPE)) {
                str7 = String.valueOf(((Integer) obj6).intValue());
            } else if (C89219l.m154714a(cls6, Short.TYPE)) {
                str7 = String.valueOf((int) ((Short) obj6).shortValue());
            } else if (C89219l.m154714a(cls6, Long.TYPE)) {
                str7 = String.valueOf(((Long) obj6).longValue());
            } else if (C89219l.m154714a(cls6, Float.TYPE)) {
                str7 = String.valueOf(((Float) obj6).floatValue());
            } else if (C89219l.m154714a(cls6, Double.TYPE)) {
                str7 = String.valueOf(((Double) obj6).doubleValue());
            } else {
                str7 = obj6.toString();
            }
        } else {
            str7 = null;
        }
        buildUpon.appendQueryParameter("source_from", str7);
        Object obj7 = map.get("source");
        if (obj7 != null) {
            Class<?> cls7 = obj7.getClass();
            if (C89219l.m154714a(cls7, Integer.class)) {
                str8 = String.valueOf(((Integer) obj7).intValue());
            } else if (C89219l.m154714a(cls7, Short.class)) {
                str8 = String.valueOf((int) ((Short) obj7).shortValue());
            } else if (C89219l.m154714a(cls7, Long.class)) {
                str8 = String.valueOf(((Long) obj7).longValue());
            } else if (C89219l.m154714a(cls7, Float.class)) {
                str8 = String.valueOf(((Float) obj7).floatValue());
            } else if (C89219l.m154714a(cls7, Double.class)) {
                str8 = String.valueOf(((Double) obj7).doubleValue());
            } else if (C89219l.m154714a(cls7, Integer.TYPE)) {
                str8 = String.valueOf(((Integer) obj7).intValue());
            } else if (C89219l.m154714a(cls7, Short.TYPE)) {
                str8 = String.valueOf((int) ((Short) obj7).shortValue());
            } else if (C89219l.m154714a(cls7, Long.TYPE)) {
                str8 = String.valueOf(((Long) obj7).longValue());
            } else if (C89219l.m154714a(cls7, Float.TYPE)) {
                str8 = String.valueOf(((Float) obj7).floatValue());
            } else if (C89219l.m154714a(cls7, Double.TYPE)) {
                str8 = String.valueOf(((Double) obj7).doubleValue());
            } else {
                str8 = obj7.toString();
            }
        } else {
            str8 = null;
        }
        buildUpon.appendQueryParameter("source", str8);
        Object obj8 = map.get("product_id");
        if (obj8 != null) {
            Class<?> cls8 = obj8.getClass();
            if (C89219l.m154714a(cls8, Integer.class)) {
                str9 = String.valueOf(((Integer) obj8).intValue());
            } else if (C89219l.m154714a(cls8, Short.class)) {
                str9 = String.valueOf((int) ((Short) obj8).shortValue());
            } else if (C89219l.m154714a(cls8, Long.class)) {
                str9 = String.valueOf(((Long) obj8).longValue());
            } else if (C89219l.m154714a(cls8, Float.class)) {
                str9 = String.valueOf(((Float) obj8).floatValue());
            } else if (C89219l.m154714a(cls8, Double.class)) {
                str9 = String.valueOf(((Double) obj8).doubleValue());
            } else if (C89219l.m154714a(cls8, Integer.TYPE)) {
                str9 = String.valueOf(((Integer) obj8).intValue());
            } else if (C89219l.m154714a(cls8, Short.TYPE)) {
                str9 = String.valueOf((int) ((Short) obj8).shortValue());
            } else if (C89219l.m154714a(cls8, Long.TYPE)) {
                str9 = String.valueOf(((Long) obj8).longValue());
            } else if (C89219l.m154714a(cls8, Float.TYPE)) {
                str9 = String.valueOf(((Float) obj8).floatValue());
            } else if (C89219l.m154714a(cls8, Double.TYPE)) {
                str9 = String.valueOf(((Double) obj8).doubleValue());
            } else {
                str9 = obj8.toString();
            }
        } else {
            str9 = null;
        }
        buildUpon.appendQueryParameter("product_id", str9);
        Object obj9 = map.get("is_self");
        if (obj9 != null) {
            Class<?> cls9 = obj9.getClass();
            if (C89219l.m154714a(cls9, Integer.class)) {
                str10 = String.valueOf(((Integer) obj9).intValue());
            } else if (C89219l.m154714a(cls9, Short.class)) {
                str10 = String.valueOf((int) ((Short) obj9).shortValue());
            } else if (C89219l.m154714a(cls9, Long.class)) {
                str10 = String.valueOf(((Long) obj9).longValue());
            } else if (C89219l.m154714a(cls9, Float.class)) {
                str10 = String.valueOf(((Float) obj9).floatValue());
            } else if (C89219l.m154714a(cls9, Double.class)) {
                str10 = String.valueOf(((Double) obj9).doubleValue());
            } else if (C89219l.m154714a(cls9, Integer.TYPE)) {
                str10 = String.valueOf(((Integer) obj9).intValue());
            } else if (C89219l.m154714a(cls9, Short.TYPE)) {
                str10 = String.valueOf((int) ((Short) obj9).shortValue());
            } else if (C89219l.m154714a(cls9, Long.TYPE)) {
                str10 = String.valueOf(((Long) obj9).longValue());
            } else if (C89219l.m154714a(cls9, Float.TYPE)) {
                str10 = String.valueOf(((Float) obj9).floatValue());
            } else if (C89219l.m154714a(cls9, Double.TYPE)) {
                str10 = String.valueOf(((Double) obj9).doubleValue());
            } else {
                str10 = obj9.toString();
            }
        } else {
            str10 = null;
        }
        buildUpon.appendQueryParameter("is_self", str10);
        Object obj10 = map.get("is_single_anchor");
        if (obj10 != null) {
            Class<?> cls10 = obj10.getClass();
            if (C89219l.m154714a(cls10, Integer.class)) {
                str11 = String.valueOf(((Integer) obj10).intValue());
            } else if (C89219l.m154714a(cls10, Short.class)) {
                str11 = String.valueOf((int) ((Short) obj10).shortValue());
            } else if (C89219l.m154714a(cls10, Long.class)) {
                str11 = String.valueOf(((Long) obj10).longValue());
            } else if (C89219l.m154714a(cls10, Float.class)) {
                str11 = String.valueOf(((Float) obj10).floatValue());
            } else if (C89219l.m154714a(cls10, Double.class)) {
                str11 = String.valueOf(((Double) obj10).doubleValue());
            } else if (C89219l.m154714a(cls10, Integer.TYPE)) {
                str11 = String.valueOf(((Integer) obj10).intValue());
            } else if (C89219l.m154714a(cls10, Short.TYPE)) {
                str11 = String.valueOf((int) ((Short) obj10).shortValue());
            } else if (C89219l.m154714a(cls10, Long.TYPE)) {
                str11 = String.valueOf(((Long) obj10).longValue());
            } else if (C89219l.m154714a(cls10, Float.TYPE)) {
                str11 = String.valueOf(((Float) obj10).floatValue());
            } else if (C89219l.m154714a(cls10, Double.TYPE)) {
                str11 = String.valueOf(((Double) obj10).doubleValue());
            } else {
                str11 = obj10.toString();
            }
        } else {
            str11 = null;
        }
        buildUpon.appendQueryParameter("is_single_anchor", str11);
        Object obj11 = map.get("is_ad");
        if (obj11 != null) {
            Class<?> cls11 = obj11.getClass();
            if (C89219l.m154714a(cls11, Integer.class)) {
                str12 = String.valueOf(((Integer) obj11).intValue());
            } else if (C89219l.m154714a(cls11, Short.class)) {
                str12 = String.valueOf((int) ((Short) obj11).shortValue());
            } else if (C89219l.m154714a(cls11, Long.class)) {
                str12 = String.valueOf(((Long) obj11).longValue());
            } else if (C89219l.m154714a(cls11, Float.class)) {
                str12 = String.valueOf(((Float) obj11).floatValue());
            } else if (C89219l.m154714a(cls11, Double.class)) {
                str12 = String.valueOf(((Double) obj11).doubleValue());
            } else if (C89219l.m154714a(cls11, Integer.TYPE)) {
                str12 = String.valueOf(((Integer) obj11).intValue());
            } else if (C89219l.m154714a(cls11, Short.TYPE)) {
                str12 = String.valueOf((int) ((Short) obj11).shortValue());
            } else if (C89219l.m154714a(cls11, Long.TYPE)) {
                str12 = String.valueOf(((Long) obj11).longValue());
            } else if (C89219l.m154714a(cls11, Float.TYPE)) {
                str12 = String.valueOf(((Float) obj11).floatValue());
            } else if (C89219l.m154714a(cls11, Double.TYPE)) {
                str12 = String.valueOf(((Double) obj11).doubleValue());
            } else {
                str12 = obj11.toString();
            }
        } else {
            str12 = null;
        }
        buildUpon.appendQueryParameter("is_ad", str12);
        Object obj12 = map.get("ad_id");
        if (obj12 != null) {
            Class<?> cls12 = obj12.getClass();
            if (C89219l.m154714a(cls12, Integer.class)) {
                str13 = String.valueOf(((Integer) obj12).intValue());
            } else if (C89219l.m154714a(cls12, Short.class)) {
                str13 = String.valueOf((int) ((Short) obj12).shortValue());
            } else if (C89219l.m154714a(cls12, Long.class)) {
                str13 = String.valueOf(((Long) obj12).longValue());
            } else if (C89219l.m154714a(cls12, Float.class)) {
                str13 = String.valueOf(((Float) obj12).floatValue());
            } else if (C89219l.m154714a(cls12, Double.class)) {
                str13 = String.valueOf(((Double) obj12).doubleValue());
            } else if (C89219l.m154714a(cls12, Integer.TYPE)) {
                str13 = String.valueOf(((Integer) obj12).intValue());
            } else if (C89219l.m154714a(cls12, Short.TYPE)) {
                str13 = String.valueOf((int) ((Short) obj12).shortValue());
            } else if (C89219l.m154714a(cls12, Long.TYPE)) {
                str13 = String.valueOf(((Long) obj12).longValue());
            } else if (C89219l.m154714a(cls12, Float.TYPE)) {
                str13 = String.valueOf(((Float) obj12).floatValue());
            } else if (C89219l.m154714a(cls12, Double.TYPE)) {
                str13 = String.valueOf(((Double) obj12).doubleValue());
            } else {
                str13 = obj12.toString();
            }
        }
        buildUpon.appendQueryParameter("ad_id", str13);
        String builder = buildUpon.toString();
        C89219l.m154716b(builder, "");
        return builder;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.e$i */
    public static final class RunnableC44800i implements Runnable {

        /* renamed from: a */
        public static final RunnableC44800i f104516a = new RunnableC44800i();

        static {
            Covode.recordClassIndex(53186);
        }

        RunnableC44800i() {
        }

        public final void run() {
            C81079v.m140776O().mo123908B();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.e$a */
    public static final class C44789a extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89277c f104502a;

        static {
            Covode.recordClassIndex(53175);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C44789a(AbstractC89277c cVar) {
            super(0);
            this.f104502a = cVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final String invoke() {
            String name = C89170a.m154665a(this.f104502a).getName();
            C89219l.m154709a((Object) name, "");
            return name;
        }
    }

    /* renamed from: o */
    private final void m87506o() {
        if (m87505n()) {
            C81079v.m140776O().mo123950y();
        }
    }

    /* renamed from: p */
    private final void m87507p() {
        if (m87505n()) {
            C81079v.m140776O().mo123913G();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.pdp.view.compat.C45002b
    /* renamed from: f */
    public final boolean mo75935f() {
        C44720k kVar = mo75926a().f104162s;
        if (kVar == null) {
            return false;
        }
        kVar.mo75859a("return");
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.pdp.view.compat.C45002b
    /* renamed from: g */
    public final void mo75936g() {
        C44720k kVar = mo75926a().f104162s;
        if (kVar != null) {
            kVar.mo75866a(true);
        }
        super.mo75936g();
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.pdp.view.compat.C45002b
    /* renamed from: h */
    public final void mo75937h() {
        C44720k kVar = mo75926a().f104162s;
        if (kVar != null) {
            kVar.mo75866a(false);
        }
        super.mo75937h();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        AbstractC88412b bVar = this.f104498b;
        if (bVar != null) {
            bVar.dispose();
        }
        this.f104498b = null;
    }

    /* renamed from: n */
    private final boolean m87505n() {
        IPdpStarter.PdpEnterParam pdpEnterParam = mo75926a().f104147a;
        if (pdpEnterParam == null || !pdpEnterParam.getPlayerControl()) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.pdp.view.compat.C45002b
    /* renamed from: c */
    public final void mo75933c() {
        C44720k kVar = mo75926a().f104162s;
        if (kVar != null) {
            kVar.mo75859a("return");
        }
        super.mo75933c();
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.pdp.view.compat.C45002b
    /* renamed from: e */
    public final void mo75934e() {
        C44720k kVar = mo75926a().f104162s;
        if (kVar != null) {
            kVar.mo75859a("return");
        }
        super.mo75934e();
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.pdp.view.compat.C45002b, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        if (mo75926a().f104148b && m87505n()) {
            AbstractC81915c.m141874a(new C43313a(false, getContext()));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.pdp.view.compat.C45002b, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (m87505n()) {
            AbstractC81915c.m141874a(new C43313a(true, getContext()));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.e$b */
    public static final class C44790b extends AbstractC89220m implements AbstractC89171a<PdpViewModel> {

        /* renamed from: a */
        final /* synthetic */ Fragment f104503a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89171a f104504b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89277c f104505c;

        /* renamed from: d */
        final /* synthetic */ AbstractC89183m f104506d;

        static {
            Covode.recordClassIndex(53176);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C44790b(Fragment fragment, AbstractC89171a aVar, AbstractC89277c cVar, AbstractC89183m mVar) {
            super(0);
            this.f104503a = fragment;
            this.f104504b = aVar;
            this.f104505c = cVar;
            this.f104506d = mVar;
        }

        /* JADX WARN: Type inference failed for: r2v2, types: [com.ss.android.ugc.aweme.ecommerce.pdp.PdpViewModel, java.lang.Object, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.ecommerce.pdp.PdpViewModel invoke() {
            /*
                r3 = this;
                androidx.fragment.app.Fragment r1 = r3.f104503a
                r0 = r1
                com.bytedance.jedi.arch.ar r0 = (com.bytedance.jedi.arch.AbstractC20380ar) r0
                androidx.lifecycle.ad$b r0 = r0.mo33721d()
                androidx.lifecycle.ad r2 = androidx.lifecycle.C1181ae.m3879a(r1, r0)
                h.f.a.a r0 = r3.f104504b
                java.lang.Object r1 = r0.invoke()
                java.lang.String r1 = (java.lang.String) r1
                h.k.c r0 = r3.f104505c
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)
                androidx.lifecycle.ac r2 = m87523x6e08a72d(r2, r1, r0)
                com.bytedance.jedi.arch.JediViewModel r2 = (com.bytedance.jedi.arch.JediViewModel) r2
                com.bytedance.jedi.arch.z r1 = r2.f48234j
                java.lang.Class<com.ss.android.ugc.aweme.ecommerce.pdp.PdpViewModel> r0 = com.p2082ss.android.ugc.aweme.ecommerce.pdp.PdpViewModel.class
                com.bytedance.jedi.arch.y r1 = r1.mo33696a(r0)
                if (r1 == 0) goto L_0x0033
                java.lang.String r0 = ""
                p4600h.p4611f.p4613b.C89219l.m154709a(r2, r0)
                r1.binding(r2)
            L_0x0033:
                com.ss.android.ugc.aweme.ecommerce.pdp.e$b$1 r0 = new com.ss.android.ugc.aweme.ecommerce.pdp.e$b$1
                r0.<init>(r3)
                r2.mo33686a_(r0)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommerce.pdp.C44788e.C44790b.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        /* renamed from: com_ss_android_ugc_aweme_ecommerce_pdp_PdpFragment$$special$$inlined$viewModel$2_androidx_lifecycle_VScopeLancet_get */
        public static AbstractC1174ac m87523x6e08a72d(C1175ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.mo3984a(str, cls);
            }
            AbstractC1174ac a = adVar.mo3984a(str, cls);
            C1171ab.m3870a(a, adVar);
            return a;
        }
    }

    public C44788e() {
        C44801j jVar = new C44801j(this);
        AbstractC89277c a = C89204ab.m154669a(PdpViewModel.class);
        C44789a aVar = new C44789a(a);
        this.f104499i = new lifecycleAwareLazy(this, aVar, new C44790b(this, aVar, a, jVar));
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.pdp.view.compat.C45002b
    /* renamed from: a */
    public final void mo75930a(boolean z) {
        C44720k kVar = mo75926a().f104162s;
        if (kVar != null) {
            kVar.mo75866a(false);
        }
        super.mo75930a(z);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.e$h */
    static final class C44799h<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C44788e f104515a;

        static {
            Covode.recordClassIndex(53185);
        }

        C44799h(C44788e eVar) {
            this.f104515a = eVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            AbstractC88412b bVar = this.f104515a.f104498b;
            if (bVar != null) {
                bVar.dispose();
            }
            this.f104515a.f104498b = null;
            if (th instanceof IPdpStarter.C44633b) {
                this.f104515a.mo75926a().mo75819a((ProductPackStruct) null, Integer.valueOf(((IPdpStarter.C44633b) th).getCode()));
            } else {
                this.f104515a.mo75926a().mo75819a((ProductPackStruct) null, (Integer) null);
            }
        }
    }

    /* renamed from: b */
    public final void mo75932b(boolean z) {
        if (isResumed() && this.f104500j && m87505n()) {
            if (z) {
                View view = getView();
                if (view != null) {
                    view.post(RunnableC44800i.f104516a);
                }
                C81079v.m140776O().mo123912F();
                return;
            }
            m87507p();
            m87506o();
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d
    public final void onDismiss(DialogInterface dialogInterface) {
        C89219l.m154721d(dialogInterface, "");
        super.onDismiss(dialogInterface);
        if (m87505n()) {
            AbstractC80747i O = C81079v.m140776O();
            C89219l.m154716b(O, "");
            boolean o = O.mo123892o();
            if (this.f104500j && !o) {
                m87506o();
            }
            m87507p();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.e$g */
    static final class C44798g<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C44788e f104513a;

        /* renamed from: b */
        final /* synthetic */ IPdpStarter.PdpEnterParam f104514b;

        static {
            Covode.recordClassIndex(53184);
        }

        C44798g(C44788e eVar, IPdpStarter.PdpEnterParam pdpEnterParam) {
            this.f104513a = eVar;
            this.f104514b = pdpEnterParam;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            HashMap<String, Object> trackParams;
            ProductPackStruct productPackStruct = (ProductPackStruct) obj;
            this.f104513a.mo75926a().mo75819a(productPackStruct, (Integer) null);
            AbstractC88412b bVar = this.f104513a.f104498b;
            if (bVar != null) {
                bVar.dispose();
            }
            this.f104513a.f104498b = null;
            PopUp popUp = productPackStruct.f104693u;
            if (!(popUp == null || popUp.f104235a == null || (trackParams = this.f104514b.getTrackParams()) == null)) {
                this.f104513a.mo75929a(popUp, trackParams);
            }
            if (TextUtils.isEmpty(this.f104514b.getChainKey()) && !TextUtils.isEmpty(productPackStruct.f104694v)) {
                HashMap<String, Object> visitReportParams = this.f104514b.getVisitReportParams();
                if (visitReportParams != null) {
                    String str = productPackStruct.f104694v;
                    if (str == null) {
                        C89219l.m154715b();
                    }
                    visitReportParams.put("chain_key", str);
                }
                this.f104514b.setChainKey(productPackStruct.f104694v);
            }
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, com.p2082ss.android.ugc.aweme.ecommerce.pdp.view.compat.C45002b, androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        IPdpStarter.PdpEnterParam pdpEnterParam = mo75926a().f104147a;
        if (pdpEnterParam != null) {
            if (pdpEnterParam.getCollapsible()) {
                if (pdpEnterParam.getCollapsedHeight() != null) {
                    BottomSheetBehavior<View> bottomSheetBehavior = this.f104992d;
                    if (bottomSheetBehavior != null) {
                        bottomSheetBehavior.mo43976b((int) pdpEnterParam.getCollapsedHeight().floatValue());
                    }
                } else {
                    BottomSheetBehavior<View> bottomSheetBehavior2 = this.f104992d;
                    if (bottomSheetBehavior2 != null) {
                        bottomSheetBehavior2.mo43976b((int) C45563h.m88110a());
                    }
                }
                mo75937h();
                BottomSheetBehavior<View> bottomSheetBehavior3 = this.f104992d;
                if (bottomSheetBehavior3 != null) {
                    bottomSheetBehavior3.f62895i = false;
                }
            } else if (pdpEnterParam.getCollapsedHeight() == null) {
                BottomSheetBehavior<View> bottomSheetBehavior4 = this.f104992d;
                if (bottomSheetBehavior4 != null) {
                    bottomSheetBehavior4.mo43976b((int) pdpEnterParam.getExpandHeight());
                }
                mo75936g();
                mo75926a().f104148b = true;
                mo75926a().f104149c = true;
                BottomSheetBehavior<View> bottomSheetBehavior5 = this.f104992d;
                if (bottomSheetBehavior5 != null) {
                    bottomSheetBehavior5.f62895i = true;
                }
                this.f104995g = false;
            } else {
                BottomSheetBehavior<View> bottomSheetBehavior6 = this.f104992d;
                if (bottomSheetBehavior6 != null) {
                    bottomSheetBehavior6.mo43976b((int) pdpEnterParam.getCollapsedHeight().floatValue());
                }
                mo75937h();
                BottomSheetBehavior<View> bottomSheetBehavior7 = this.f104992d;
                if (bottomSheetBehavior7 != null) {
                    bottomSheetBehavior7.f62895i = false;
                }
                this.f104995g = true;
            }
            ViewGroup m = mo76150m();
            if (m != null) {
                C23163i.m43668b(m, null, Integer.valueOf(C45563h.f106106b - ((int) pdpEnterParam.getExpandHeight())), null, null, false, 29);
            }
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Serializable serializable;
        int i;
        boolean z;
        ProductPackStruct productPackStruct;
        Long l;
        Long l2;
        HashMap<String, Object> trackParams;
        HashMap<String, Object> trackParams2;
        long j;
        long j2;
        int i2;
        super.onCreate(bundle);
        if (bundle != null) {
            dismissAllowingStateLoss();
        }
        Bundle arguments = getArguments();
        if (arguments != null) {
            serializable = arguments.getSerializable("ENTER_PARAMS");
        } else {
            serializable = null;
        }
        Objects.requireNonNull(serializable, "null cannot be cast to non-null type com.ss.android.ugc.aweme.ecommerce.pdp.IPdpStarter.PdpEnterParam");
        IPdpStarter.PdpEnterParam pdpEnterParam = (IPdpStarter.PdpEnterParam) serializable;
        mo75926a().f104162s = C44720k.C44721a.m87476a(getContext());
        mo75926a().f104147a = pdpEnterParam;
        mo75926a().mo75821a(pdpEnterParam.getFullScreen());
        mo75926a().f104166w = false;
        PdpViewModel a = mo75926a();
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            i = arguments2.getInt("PREFETCH_TYPE");
        } else {
            i = 0;
        }
        a.f104155l = i;
        PdpViewModel a2 = mo75926a();
        if (pdpEnterParam.getFullScreen() || pdpEnterParam.getExpandHeight() >= ((float) (C45563h.f106106b - C80534hh.m139609b()))) {
            z = true;
        } else {
            z = false;
        }
        a2.f104165v = z;
        Bundle arguments3 = getArguments();
        if (arguments3 != null) {
            productPackStruct = (ProductPackStruct) arguments3.getParcelable("PREFETCH_RESULT");
        } else {
            productPackStruct = null;
        }
        Bundle arguments4 = getArguments();
        if (arguments4 != null && (i2 = arguments4.getInt("ERROR_CODE", 0)) != 0) {
            mo75926a().mo75819a((ProductPackStruct) null, Integer.valueOf(i2));
        } else if (productPackStruct != null) {
            Bundle arguments5 = getArguments();
            if (arguments5 != null) {
                l = Long.valueOf(arguments5.getLong("PREFETCH_FINISH_TIME"));
            } else {
                l = null;
            }
            Bundle arguments6 = getArguments();
            if (arguments6 != null) {
                l2 = Long.valueOf(arguments6.getLong("CLICK_TIMESTAMP"));
            } else {
                l2 = null;
            }
            mo75926a().mo75819a(productPackStruct, (Integer) null);
            C44720k kVar = mo75926a().f104162s;
            long j3 = 0;
            if (kVar != null) {
                if (l != null) {
                    j2 = l.longValue();
                } else {
                    j2 = 0;
                }
                kVar.f104336s = j2;
            }
            C44720k kVar2 = mo75926a().f104162s;
            if (kVar2 != null) {
                if (l2 != null) {
                    j = l2.longValue();
                } else {
                    j = 0;
                }
                kVar2.f104335r = j;
            }
            C44720k kVar3 = mo75926a().f104162s;
            if (kVar3 != null) {
                if (l2 != null) {
                    j3 = l2.longValue();
                }
                kVar3.f104334q = j3;
            }
            PopUp popUp = productPackStruct.f104693u;
            if (!(popUp == null || popUp.f104235a == null || (trackParams2 = pdpEnterParam.getTrackParams()) == null)) {
                mo75929a(popUp, trackParams2);
            }
            if (productPackStruct.f104693u != null) {
                PopUp popUp2 = productPackStruct.f104693u;
                if (popUp2 == null) {
                    C89219l.m154715b();
                }
                if (popUp2.f104235a != null && (trackParams = pdpEnterParam.getTrackParams()) != null) {
                    PopUp popUp3 = productPackStruct.f104693u;
                    if (popUp3 == null) {
                        C89219l.m154715b();
                    }
                    mo75929a(popUp3, trackParams);
                }
            }
        } else {
            C44867d a3 = IPdpStarter.C44631a.m87369a().mo75742a(pdpEnterParam, true);
            if (a3.f104627d != null) {
                mo75926a().mo75819a(a3.f104627d, (Integer) null);
            } else {
                this.f104498b = a3.f104626c.mo143254a(new C44798g(this, pdpEnterParam), new C44799h(this));
            }
        }
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af, R> R withState(VM1 vm1, AbstractC89172b<? super S1, ? extends R> bVar) {
        C89219l.m154721d(vm1, "");
        C89219l.m154721d(bVar, "");
        return (R) AbstractC20527q.C20528a.m38714a(vm1, bVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.e$e */
    static final class C44796e extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C44788e f104511a;

        static {
            Covode.recordClassIndex(53182);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44796e(C44788e eVar) {
            super(2);
            this.f104511a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            C89219l.m154721d(iVar, "");
            if (booleanValue) {
                this.f104511a.dismissAllowingStateLoss();
            }
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.e$d */
    public static final class C44793d extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, Integer, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C44788e f104508a;

        static {
            Covode.recordClassIndex(53179);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44793d(C44788e eVar) {
            super(2);
            this.f104508a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, Integer num) {
            int intValue = num.intValue();
            C89219l.m154721d(iVar, "");
            C447941 r2 = new AbstractC89171a<C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.ecommerce.pdp.C44788e.C44793d.C447941 */

                /* renamed from: a */
                final /* synthetic */ C44793d f104509a;

                static {
                    Covode.recordClassIndex(53180);
                }

                {
                    this.f104509a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // p4600h.p4611f.p4612a.AbstractC89171a
                public final /* synthetic */ C89391z invoke() {
                    mo75941a();
                    return C89391z.f203057a;
                }

                /* renamed from: a */
                public final void mo75941a() {
                    C23073a.C23074a.m43507a((DialogInterface$OnCancelListenerC0944d) this.f104509a.f104508a).mo37499b(false).mo37504e(-16777216).mo37502c(false).f54627a.mo33415d();
                    this.f104509a.f104508a.mo75932b(false);
                }
            };
            C447952 r1 = new AbstractC89171a<C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.ecommerce.pdp.C44788e.C44793d.C447952 */

                /* renamed from: a */
                final /* synthetic */ C44793d f104510a;

                static {
                    Covode.recordClassIndex(53181);
                }

                {
                    this.f104510a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // p4600h.p4611f.p4612a.AbstractC89171a
                public final /* synthetic */ C89391z invoke() {
                    mo75942a();
                    return C89391z.f203057a;
                }

                /* renamed from: a */
                public final void mo75942a() {
                    C23073a.C23074a.m43507a((DialogInterface$OnCancelListenerC0944d) this.f104510a.f104508a).mo37499b(true).mo37493a().mo37504e(-16777216).mo37502c(false).f54627a.mo33415d();
                    this.f104510a.f104508a.mo75932b(true);
                }
            };
            if (intValue == 3) {
                this.f104508a.mo75936g();
                r1.mo75942a();
            } else if (intValue == 4) {
                this.f104508a.mo75937h();
                r2.mo75941a();
            } else if (intValue == 5) {
                this.f104508a.mo75930a(false);
                r2.mo75941a();
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.e$f */
    static final class C44797f extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C44788e f104512a;

        static {
            Covode.recordClassIndex(53183);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44797f(C44788e eVar) {
            super(2);
            this.f104512a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, Boolean bool) {
            AbstractC20477i iVar2 = iVar;
            boolean booleanValue = bool.booleanValue();
            C89219l.m154721d(iVar2, "");
            if (booleanValue) {
                ImagePreloadExperiment imagePreloadExperiment = ImagePreloadExperiment.INSTANCE;
                AbstractC1196i lifecycle = iVar2.getLifecycle();
                C89219l.m154716b(lifecycle, "");
                imagePreloadExperiment.onFirstHeaderImageReady(lifecycle, this.f104512a.mo75926a());
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.e$j */
    static final class C44801j extends AbstractC89220m implements AbstractC89183m<PdpMainState, Bundle, PdpMainState> {

        /* renamed from: a */
        final /* synthetic */ C44788e f104517a;

        static {
            Covode.recordClassIndex(53187);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44801j(C44788e eVar) {
            super(2);
            this.f104517a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ PdpMainState invoke(PdpMainState pdpMainState, Bundle bundle) {
            PdpMainState pdpMainState2 = pdpMainState;
            C89219l.m154721d(pdpMainState2, "");
            Bundle arguments = this.f104517a.getArguments();
            if (arguments == null || !arguments.getBoolean("full_screen")) {
                return pdpMainState2;
            }
            return PdpMainState.copy$default(pdpMainState2, false, null, false, 3, null, null, 1.0f, 0, null, 0, false, null, null, null, null, null, 65463, null);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.pdp.view.compat.C45002b
    /* renamed from: a */
    public final void mo75928a(View view, float f) {
        C89219l.m154721d(view, "");
        super.mo75928a(view, f);
        if (!Float.isNaN(f)) {
            mo75926a().mo33689c(new PdpViewModel.C44640ac(f));
            Iterator<T> it = mo75926a().f104154k.iterator();
            while (it.hasNext()) {
                it.next().invoke(Float.valueOf(f));
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        C23669c a = C23669c.C23671a.m44763a(this, getView());
        a.mo39100a(R.id.vc, new PdpBodyWidget(this), C44769d.f104450a);
        a.mo39100a(R.id.be2, new PdpHeadNavBarWidget(getFragmentManager()), C44769d.f104450a);
        a.mo39100a(R.id.uf, new PdpBottomNavBarWidget(this), C44769d.f104450a);
        AbstractC88412b unused = selectSubscribe(mo75926a(), C44802f.f104518a, new C20370ah(), new C44793d(this));
        AbstractC88412b unused2 = selectSubscribe(mo75926a(), C44803g.f104519a, new C20370ah(), new C44796e(this));
        AbstractC88412b unused3 = selectSubscribe(mo75926a(), C44804h.f104520a, new C20370ah(), new C44797f(this));
        AbstractC80747i O = C81079v.m140776O();
        C89219l.m154716b(O, "");
        this.f104500j = O.mo123892o();
    }

    /* renamed from: a */
    public final void mo75929a(PopUp popUp, Map<String, ? extends Object> map) {
        Object obj;
        String obj2;
        String a = m87504a(popUp.f104235a, map);
        long j = popUp.f104236b;
        Context context = getContext();
        if (context != null) {
            C89219l.m154716b(context, "");
            obj = C18411b.m34269a(context).mo29433a("ug_last_popup_time");
        } else {
            obj = null;
        }
        if (obj == null) {
            SmartRouter.buildRoute(getContext(), a).open();
            obj = Long.valueOf(System.currentTimeMillis() / 1000);
        } else {
            Class<?> cls = obj.getClass();
            if (C89219l.m154714a(cls, Integer.class)) {
                obj2 = String.valueOf(((Integer) obj).intValue());
            } else if (C89219l.m154714a(cls, Short.class)) {
                obj2 = String.valueOf((int) ((Short) obj).shortValue());
            } else if (C89219l.m154714a(cls, Long.class)) {
                obj2 = String.valueOf(((Long) obj).longValue());
            } else if (C89219l.m154714a(cls, Float.class)) {
                obj2 = String.valueOf(((Float) obj).floatValue());
            } else if (C89219l.m154714a(cls, Double.class)) {
                obj2 = String.valueOf(((Double) obj).doubleValue());
            } else if (C89219l.m154714a(cls, Integer.TYPE)) {
                obj2 = String.valueOf(((Integer) obj).intValue());
            } else if (C89219l.m154714a(cls, Short.TYPE)) {
                obj2 = String.valueOf((int) ((Short) obj).shortValue());
            } else if (C89219l.m154714a(cls, Long.TYPE)) {
                obj2 = String.valueOf(((Long) obj).longValue());
            } else if (C89219l.m154714a(cls, Float.TYPE)) {
                obj2 = String.valueOf(((Float) obj).floatValue());
            } else if (C89219l.m154714a(cls, Double.TYPE)) {
                obj2 = String.valueOf(((Double) obj).doubleValue());
            } else {
                obj2 = obj.toString();
            }
            if (Long.parseLong(obj2) + j <= System.currentTimeMillis() / 1000) {
                SmartRouter.buildRoute(getContext(), a).open();
                obj = Long.valueOf(System.currentTimeMillis() / 1000);
            }
        }
        Context context2 = getContext();
        if (context2 != null) {
            C89219l.m154716b(context2, "");
            C18411b.m34269a(context2).mo29435a("ug_last_popup_time", obj.toString());
        }
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af> AbstractC88412b subscribe(JediViewModel<S> jediViewModel, C20370ah<S> ahVar, AbstractC89183m<? super AbstractC20477i, ? super S, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        return AbstractC20527q.C20528a.m38708a(this, jediViewModel, ahVar, mVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.pdp.view.compat.C45002b
    /* renamed from: a */
    public final void mo75927a(int i, int i2, boolean z) {
        C44720k kVar;
        String str;
        String str2;
        IPdpStarter.PdpEnterParam pdpEnterParam;
        if (i2 == 5 || i2 == 3 || i2 == 4) {
            mo75926a().mo75813a(i2);
        }
        if (i2 == 3 && (pdpEnterParam = mo75926a().f104147a) != null && !pdpEnterParam.getCollapsible() && pdpEnterParam.getCollapsedHeight() != null) {
            BottomSheetBehavior<View> bottomSheetBehavior = this.f104992d;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.mo43976b((int) pdpEnterParam.getExpandHeight());
            }
            BottomSheetBehavior<View> bottomSheetBehavior2 = this.f104992d;
            if (bottomSheetBehavior2 != null) {
                bottomSheetBehavior2.f62895i = true;
            }
            this.f104995g = false;
        }
        if (i2 == 3) {
            if (i == 4) {
                C44720k kVar2 = mo75926a().f104162s;
                if (kVar2 != null) {
                    kVar2.mo75878c(true);
                }
                C44720k kVar3 = mo75926a().f104162s;
                if (kVar3 != null) {
                    kVar3.mo75867a(false, mo75926a().mo75823a());
                }
                C44720k kVar4 = mo75926a().f104162s;
                if (kVar4 != null) {
                    kVar4.mo75877c("halftofull");
                }
                ProductPackStruct productPackStruct = mo75926a().f104150d;
                if (productPackStruct == null || (str2 = productPackStruct.f104674b) == null) {
                    str2 = "";
                }
                C89219l.m154721d(str2, "");
                AbstractC81915c.m141874a(new C43314b(str2, 2));
            }
        } else if (i2 == 4) {
            if (i == 3) {
                C44720k kVar5 = mo75926a().f104162s;
                if (kVar5 != null) {
                    kVar5.mo75878c(false);
                }
                C44720k kVar6 = mo75926a().f104162s;
                if (kVar6 != null) {
                    kVar6.mo75867a(true, mo75926a().mo75823a());
                }
                C44720k kVar7 = mo75926a().f104162s;
                if (kVar7 != null) {
                    kVar7.mo75877c("fulltohalf");
                }
                ProductPackStruct productPackStruct2 = mo75926a().f104150d;
                if (productPackStruct2 == null || (str = productPackStruct2.f104674b) == null) {
                    str = "";
                }
                C89219l.m154721d(str, "");
                AbstractC81915c.m141874a(new C43314b(str, 3));
            }
        } else if (i2 == 5 && i == 4 && z && (kVar = mo75926a().f104162s) != null) {
            kVar.mo75877c("halftoquit");
        }
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af, A> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, C20370ah<C20373ak<A>> ahVar, AbstractC89183m<? super AbstractC20477i, ? super A, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        return AbstractC20527q.C20528a.m38709a(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af, A, B> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, C20370ah<C20374al<A, B>> ahVar, AbstractC89187q<? super AbstractC20477i, ? super A, ? super B, C89391z> qVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(qVar, "");
        return AbstractC20527q.C20528a.m38711a(this, jediViewModel, kVar, kVar2, ahVar, qVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af, T> AbstractC88412b asyncSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends AbstractC20362a<? extends T>> kVar, C20370ah<C20373ak<AbstractC20362a<T>>> ahVar, AbstractC89183m<? super AbstractC20477i, ? super Throwable, C89391z> mVar, AbstractC89172b<? super AbstractC20477i, C89391z> bVar, AbstractC89183m<? super AbstractC20477i, ? super T, C89391z> mVar2) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(ahVar, "");
        return AbstractC20527q.C20528a.m38710a(this, jediViewModel, kVar, ahVar, mVar, bVar, mVar2);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af, A, B, C> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, AbstractC89290k<S, ? extends C> kVar3, C20370ah<C20375am<A, B, C>> ahVar, AbstractC89188r<? super AbstractC20477i, ? super A, ? super B, ? super C, C89391z> rVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(kVar3, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(rVar, "");
        return AbstractC20527q.C20528a.m38712a(this, jediViewModel, kVar, kVar2, kVar3, ahVar, rVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af, A, B, C, D> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, AbstractC89290k<S, ? extends C> kVar3, AbstractC89290k<S, ? extends D> kVar4, C20370ah<C20376an<A, B, C, D>> ahVar, AbstractC89189s<? super AbstractC20477i, ? super A, ? super B, ? super C, ? super D, C89391z> sVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(kVar3, "");
        C89219l.m154721d(kVar4, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(sVar, "");
        return AbstractC20527q.C20528a.m38713a(this, jediViewModel, kVar, kVar2, kVar3, kVar4, ahVar, sVar);
    }
}
