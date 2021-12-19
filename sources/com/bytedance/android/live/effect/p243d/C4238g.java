package com.bytedance.android.live.effect.p243d;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.AbstractC0976n;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1204m;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.android.live.core.widget.StateLayout;
import com.bytedance.android.live.effect.C4142a;
import com.bytedance.android.live.effect.C4307m;
import com.bytedance.android.live.effect.api.C4147a;
import com.bytedance.android.live.effect.api.p240a.AbstractC4156i;
import com.bytedance.android.live.effect.model.C4315e;
import com.bytedance.android.live.effect.p241b.C4180c;
import com.bytedance.android.live.effect.p241b.C4187e;
import com.bytedance.android.live.effect.p244e.C4260e;
import com.bytedance.android.live.effect.p245f.C4278b;
import com.bytedance.android.livesdk.p561j.C9110dv;
import com.bytedance.android.livesdk.utils.C11279p;
import com.bytedance.android.livesdk.widget.AdjustPercentBar;
import com.bytedance.android.livesdkapi.depend.model.C11672a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p4600h.C89378p;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.effect.d.g */
public final class C4238g {

    /* renamed from: a */
    C4260e f11732a;

    /* renamed from: b */
    String f11733b;

    /* renamed from: c */
    C11672a f11734c;

    /* renamed from: d */
    final Map<String, C11672a> f11735d = new LinkedHashMap();

    /* renamed from: e */
    final List<String> f11736e = new ArrayList();

    /* renamed from: f */
    final List<C4315e<C11672a>> f11737f = new ArrayList();

    /* renamed from: g */
    String f11738g = "";

    /* renamed from: h */
    String f11739h = "";

    /* renamed from: i */
    final AbstractC4156i f11740i = C4180c.C4181a.m10258a();

    /* renamed from: j */
    final Fragment f11741j;

    /* renamed from: k */
    final C4222b f11742k;

    /* renamed from: l */
    public final AdjustPercentBar f11743l;

    /* renamed from: m */
    final StateLayout f11744m;

    /* renamed from: n */
    private final DataChannel f11745n;

    /* renamed from: o */
    private final ViewPager f11746o;

    static {
        Covode.recordClassIndex(4808);
    }

    /* renamed from: com.bytedance.android.live.effect.d.g$a */
    static final class C4241a extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C4238g f11749a;

        static {
            Covode.recordClassIndex(4811);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4241a(C4238g gVar) {
            super(0);
            this.f11749a = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            C11279p.m20006a(this.f11749a.f11743l);
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo9941b() {
        C11672a aVar = this.f11734c;
        if (aVar != null) {
            AbstractC4156i iVar = this.f11740i;
            String str = C4147a.f11586d;
            C89219l.m154716b(str, "");
            iVar.mo9864b(str, aVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo9939a() {
        int i;
        C89378p pVar;
        Integer num;
        if (!TextUtils.isEmpty(this.f11738g)) {
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) DataChannelGlobal.f42558d.mo28324b(C9110dv.class);
            if (concurrentHashMap == null || (pVar = (C89378p) concurrentHashMap.get(this.f11738g)) == null || (num = (Integer) pVar.getFirst()) == null) {
                i = -1;
            } else {
                i = num.intValue();
            }
            ConcurrentHashMap concurrentHashMap2 = (ConcurrentHashMap) DataChannelGlobal.f42558d.mo28324b(C9110dv.class);
            if (concurrentHashMap2 != null) {
                String str = this.f11738g;
                if (str == null) {
                    C89219l.m154715b();
                }
                Integer valueOf = Integer.valueOf(i);
                String str2 = this.f11739h;
                if (str2 == null) {
                    str2 = "";
                }
                concurrentHashMap2.put(str, new C89378p(valueOf, str2));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo9940a(C11672a aVar) {
        if (aVar == null || aVar.mo18439a() == null) {
            C11279p.m20006a(this.f11743l);
            return;
        }
        C11279p.m20017b(this.f11743l);
        m10344d(aVar);
        this.f11740i.mo9846a(C4147a.f11586d, aVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0022, code lost:
        if (r0 == null) goto L_0x0024;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final float m10343c(com.bytedance.android.livesdkapi.depend.model.C11672a r4) {
        /*
            r3 = this;
            com.bytedance.android.live.effect.api.a.i r2 = r3.f11740i
            java.lang.String r1 = r4.f27895c
            com.bytedance.android.livesdkapi.depend.model.a$b r0 = r4.mo18439a()
            if (r0 == 0) goto L_0x000e
            java.lang.String r0 = r0.f27921c
            if (r0 != 0) goto L_0x0010
        L_0x000e:
            java.lang.String r0 = ""
        L_0x0010:
            java.lang.Float r0 = r2.mo9859a(r1, r0)
            if (r0 != 0) goto L_0x0033
            com.bytedance.android.livesdkapi.depend.model.a$b r0 = r4.mo18439a()
            if (r0 == 0) goto L_0x0038
            int r0 = r0.f27920b
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            if (r0 != 0) goto L_0x0027
        L_0x0024:
            p4600h.p4611f.p4613b.C89219l.m154715b()
        L_0x0027:
            int r0 = r0.intValue()
            float r0 = com.bytedance.android.live.effect.p241b.C4187e.m10264a(r4, r0)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
        L_0x0033:
            float r0 = r0.floatValue()
            return r0
        L_0x0038:
            r0 = 0
            goto L_0x0024
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.effect.p243d.C4238g.m10343c(com.bytedance.android.livesdkapi.depend.model.a):float");
    }

    /* renamed from: d */
    private final void m10344d(C11672a aVar) {
        int i;
        int i2;
        this.f11743l.setPercent(C4187e.m10267a(aVar, m10343c(aVar)));
        C11672a.C11674b a = aVar.mo18439a();
        if (a == null || !a.f27924f) {
            AdjustPercentBar adjustPercentBar = this.f11743l;
            C11672a.C11674b a2 = aVar.mo18439a();
            if (a2 != null) {
                i = a2.f27920b;
            } else {
                i = 0;
            }
            adjustPercentBar.mo18119a(100, 0, i, true);
            return;
        }
        AdjustPercentBar adjustPercentBar2 = this.f11743l;
        C11672a.C11674b a3 = aVar.mo18439a();
        if (a3 != null) {
            i2 = a3.f27920b;
        } else {
            i2 = 0;
        }
        adjustPercentBar2.mo18119a(50, -50, i2, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo9942b(C11672a aVar) {
        Boolean bool;
        this.f11734c = aVar;
        if (aVar != null) {
            bool = Boolean.valueOf(aVar.mo18443b());
        } else {
            bool = null;
        }
        if (C11279p.m20019b(bool)) {
            this.f11735d.put(this.f11733b, aVar);
        }
    }

    public C4238g(DataChannel dataChannel, Fragment fragment, ViewPager viewPager, C4222b bVar, AdjustPercentBar adjustPercentBar, StateLayout stateLayout) {
        C89219l.m154721d(fragment, "");
        C89219l.m154721d(viewPager, "");
        C89219l.m154721d(adjustPercentBar, "");
        C89219l.m154721d(stateLayout, "");
        this.f11745n = dataChannel;
        this.f11741j = fragment;
        this.f11746o = viewPager;
        this.f11742k = bVar;
        this.f11743l = adjustPercentBar;
        this.f11744m = stateLayout;
        if (dataChannel != null) {
            dataChannel.mo28309a((AbstractC1204m) fragment, C4307m.class, (AbstractC89172b) new AbstractC89172b<C11672a, C89391z>(this) {
                /* class com.bytedance.android.live.effect.p243d.C4238g.C42391 */

                /* renamed from: a */
                final /* synthetic */ C4238g f11747a;

                static {
                    Covode.recordClassIndex(4809);
                }

                {
                    this.f11747a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C11672a aVar) {
                    ConcurrentHashMap concurrentHashMap;
                    C11672a aVar2 = aVar;
                    C89219l.m154721d(aVar2, "");
                    C4238g gVar = this.f11747a;
                    String str = null;
                    C11672a aVar3 = null;
                    Boolean bool = null;
                    if (C4278b.m10378a(aVar2)) {
                        if (!TextUtils.isEmpty(gVar.f11739h)) {
                            gVar.mo9939a();
                        }
                        gVar.f11738g = aVar2.f27897e;
                        gVar.f11739h = "";
                        if (gVar.f11732a == null) {
                            String str2 = aVar2.f27886B;
                            if (str2 == null) {
                                str2 = "";
                            }
                            String str3 = aVar2.f27895c;
                            C89219l.m154721d(str2, "");
                            C89219l.m154721d(str3, "");
                            C4260e eVar = new C4260e();
                            Bundle bundle = new Bundle();
                            bundle.putString("live_effect_panel_name", str2);
                            bundle.putString("live_effect_panel_info", str3);
                            eVar.setArguments(bundle);
                            C4241a aVar4 = new C4241a(gVar);
                            C89219l.m154721d(aVar4, "");
                            eVar.f11783f = aVar4;
                            gVar.f11732a = eVar;
                        }
                        AbstractC0976n a = gVar.f11741j.getChildFragmentManager().mo3552a();
                        C4260e eVar2 = gVar.f11732a;
                        if (eVar2 == null) {
                            C89219l.m154715b();
                        }
                        String str4 = aVar2.f27886B;
                        if (str4 == null) {
                            str4 = "";
                        }
                        String str5 = aVar2.f27895c;
                        C89219l.m154721d(str4, "");
                        C89219l.m154721d(str5, "");
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("live_effect_panel_name", str4);
                        bundle2.putString("live_effect_panel_info", str5);
                        eVar2.setArguments(bundle2);
                        a.mo3469b(R.id.ea9, eVar2).mo3476d();
                        gVar.mo9942b(aVar2);
                        C4260e eVar3 = gVar.f11732a;
                        if (eVar3 != null) {
                            aVar3 = eVar3.f11778a;
                        }
                        gVar.mo9942b(aVar3);
                        C11672a aVar5 = gVar.f11734c;
                        if (aVar5 == null) {
                            C11279p.m20006a(gVar.f11743l);
                        } else if (aVar5.f27887C) {
                            C11279p.m20006a(gVar.f11743l);
                        } else {
                            C11279p.m20017b(gVar.f11743l);
                            gVar.mo9940a(aVar5);
                        }
                    } else if (aVar2.f27887C) {
                        ConcurrentHashMap concurrentHashMap2 = (ConcurrentHashMap) DataChannelGlobal.f42558d.mo28324b(C9110dv.class);
                        if (concurrentHashMap2 != null) {
                            for (Map.Entry entry : concurrentHashMap2.entrySet()) {
                                if (C89219l.m154714a(((C89378p) entry.getValue()).getSecond(), (Object) gVar.f11739h) && (concurrentHashMap = (ConcurrentHashMap) DataChannelGlobal.f42558d.mo28324b(C9110dv.class)) != null) {
                                    concurrentHashMap.remove(entry.getKey());
                                }
                            }
                        }
                        gVar.f11739h = "";
                        C11279p.m20006a(gVar.f11743l);
                        C11672a aVar6 = gVar.f11734c;
                        if (aVar6 != null) {
                            bool = Boolean.valueOf(aVar6.f27888D);
                        }
                        if (C11279p.m20012a(bool)) {
                            gVar.mo9941b();
                        }
                        gVar.mo9942b(aVar2);
                    } else {
                        if (aVar2.f27888D) {
                            C11672a aVar7 = gVar.f11734c;
                            if (C11279p.m20012a(aVar7 != null ? Boolean.valueOf(aVar7.f27888D) : null)) {
                                String str6 = aVar2.f27886B;
                                C11672a aVar8 = gVar.f11734c;
                                if (aVar8 != null) {
                                    str = aVar8.f27886B;
                                }
                                if (C89219l.m154714a((Object) str6, (Object) str)) {
                                    gVar.f11739h = aVar2.f27897e;
                                    gVar.mo9939a();
                                    gVar.mo9941b();
                                    gVar.mo9942b(aVar2);
                                    gVar.mo9940a(aVar2);
                                }
                            }
                        }
                        gVar.f11739h = aVar2.f27897e;
                        gVar.mo9939a();
                        gVar.mo9942b(aVar2);
                        gVar.mo9940a(aVar2);
                    }
                    return C89391z.f203057a;
                }
            }).mo28313b((AbstractC1204m) fragment, C4142a.class, (AbstractC89172b) new AbstractC89172b<List<? extends C4315e<C11672a>>, C89391z>(this) {
                /* class com.bytedance.android.live.effect.p243d.C4238g.C42402 */

                /* renamed from: a */
                final /* synthetic */ C4238g f11748a;

                static {
                    Covode.recordClassIndex(4810);
                }

                {
                    this.f11748a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Multi-variable search result rejected for r0v15, resolved type: com.bytedance.android.live.effect.d.b */
                /* JADX WARN: Multi-variable type inference failed */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(List<? extends C4315e<C11672a>> list) {
                    C11672a aVar;
                    List<T> list2;
                    List<? extends C4315e<C11672a>> list3 = list;
                    C89219l.m154721d(list3, "");
                    C4238g gVar = this.f11748a;
                    gVar.f11744m.mo9406a("CONTENT");
                    ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) list3, 10));
                    Iterator<T> it = list3.iterator();
                    while (it.hasNext()) {
                        arrayList.add(it.next().f11861a);
                    }
                    ArrayList arrayList2 = arrayList;
                    if (!C89219l.m154714a(gVar.f11736e, arrayList2)) {
                        C4315e eVar = (C4315e) C89070n.m154583g((List) list3);
                        String str = null;
                        if (eVar == null || (list2 = eVar.f11862b) == null || (aVar = (C11672a) C89070n.m154583g((List) list2)) == null) {
                            aVar = null;
                        } else {
                            gVar.mo9940a(aVar);
                        }
                        C4315e eVar2 = (C4315e) C89070n.m154583g((List) list3);
                        if (eVar2 != null) {
                            str = eVar2.f11861a;
                        }
                        gVar.f11733b = str;
                        gVar.mo9942b(aVar);
                        C4222b bVar = gVar.f11742k;
                        if (bVar != 0) {
                            bVar.mo9927a((List<C4315e<C11672a>>) list3);
                        }
                        gVar.f11736e.addAll(arrayList2);
                    }
                    gVar.f11737f.clear();
                    gVar.f11737f.addAll(list3);
                    return C89391z.f203057a;
                }
            });
        }
    }
}
