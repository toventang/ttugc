package com.bytedance.android.livesdk.definition;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1204m;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.android.live.base.AbstractC2953a;
import com.bytedance.android.live.broadcast.model.C3270n;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.core.p218f.C3888a;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.design.p230a.C4054a;
import com.bytedance.android.live.design.widget.LiveRadioButton;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.live.p250i.p251a.AbstractC4357d;
import com.bytedance.android.live.p379n.AbstractC5777j;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.AbstractC11293v;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p452ao.AbstractC6804a;
import com.bytedance.android.livesdk.p452ao.C6805b;
import com.bytedance.android.livesdk.p452ao.C6806c;
import com.bytedance.android.livesdk.p456as.AbstractC6872f;
import com.bytedance.android.livesdk.p561j.C9052br;
import com.bytedance.android.livesdk.p561j.C9058bx;
import com.bytedance.android.livesdk.p561j.C9076co;
import com.bytedance.android.livesdk.p561j.C9096dh;
import com.bytedance.android.livesdk.p561j.C9125g;
import com.bytedance.android.livesdk.p561j.C9126h;
import com.bytedance.android.livesdk.p561j.C9127i;
import com.bytedance.android.livesdk.p561j.C9140v;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.android.livesdk.utils.C11226ao;
import com.bytedance.android.livesdk.utils.C11227ap;
import com.bytedance.android.livesdkapi.depend.model.live.C11729j;
import com.bytedance.android.livesdkapi.depend.model.live.EnumC11728i;
import com.bytedance.android.livesdkapi.depend.p680d.AbstractC11663q;
import com.bytedance.android.livesdkapi.session.C11870f;
import com.bytedance.android.livesdkapi.session.EnterRoomLinkSession;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.services.apm.api.C22708a;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.common.util.NetworkUtils;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p4600h.C89376n;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.definition.c */
public final class C8317c extends AbstractC11293v implements AbstractC8330f {

    /* renamed from: c */
    public static final C8318a f20586c = new C8318a((byte) 0);

    /* renamed from: a */
    public boolean f20587a;

    /* renamed from: b */
    public C8320c f20588b;

    /* renamed from: d */
    private boolean f20589d = true;

    /* renamed from: e */
    private RecyclerView f20590e;

    /* renamed from: f */
    private ImageView f20591f;

    /* renamed from: g */
    private HashMap f20592g;

    static {
        Covode.recordClassIndex(9155);
    }

    @Override // com.bytedance.android.livesdk.AbstractC11293v
    /* renamed from: a */
    public final void mo8165a() {
        HashMap hashMap = this.f20592g;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.android.livesdk.AbstractC11293v
    /* renamed from: a_ */
    public final View mo8166a_(int i) {
        if (this.f20592g == null) {
            this.f20592g = new HashMap();
        }
        View view = (View) this.f20592g.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f20592g.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, com.bytedance.android.livesdk.AbstractC11293v, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo8165a();
    }

    /* renamed from: com.bytedance.android.livesdk.definition.c$a */
    public static final class C8318a {
        static {
            Covode.recordClassIndex(9156);
        }

        private C8318a() {
        }

        public /* synthetic */ C8318a(byte b) {
            this();
        }

        /* renamed from: a */
        public static void m16475a(Context context, boolean z) {
            C8317c cVar = new C8317c();
            Bundle bundle = new Bundle();
            bundle.putBoolean("key_is_preview", z);
            if (context instanceof ActivityC0945e) {
                cVar.setArguments(bundle);
                AbstractC0952i supportFragmentManager = ((ActivityC0945e) context).getSupportFragmentManager();
                C89219l.m154716b(supportFragmentManager, "");
                cVar.show(supportFragmentManager, "LiveDefinitionSelectionDialog");
            }
        }
    }

    @Override // com.bytedance.android.livesdk.definition.AbstractC8330f
    /* renamed from: d */
    public final void mo9929d() {
        dismiss();
    }

    /* renamed from: com.bytedance.android.livesdk.definition.c$c */
    public static final class C8320c extends RecyclerView.AbstractC1350a<C8319b> {

        /* renamed from: a */
        public int f20597a;

        /* renamed from: b */
        public Handler f20598b = new Handler(Looper.getMainLooper());

        /* renamed from: c */
        public boolean f20599c;

        /* renamed from: d */
        public final List<C8328d> f20600d;

        /* renamed from: e */
        public final DataChannel f20601e;

        /* renamed from: f */
        public final AbstractC8330f f20602f;

        /* renamed from: g */
        private final RecyclerView f20603g;

        /* renamed from: h */
        private final boolean f20604h;

        /* renamed from: i */
        private final boolean f20605i;

        static {
            Covode.recordClassIndex(9158);
        }

        /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
        public final /* synthetic */ C8319b onCreateViewHolder(ViewGroup viewGroup, int i) {
            return m16476a(this, viewGroup, i);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
        public final int getItemCount() {
            return this.f20600d.size();
        }

        /* renamed from: com.bytedance.android.livesdk.definition.c$c$b */
        static final class View$OnClickListenerC8323b implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C8320c f20612a;

            /* renamed from: b */
            final /* synthetic */ C8319b f20613b;

            static {
                Covode.recordClassIndex(9161);
            }

            View$OnClickListenerC8323b(C8320c cVar, C8319b bVar) {
                this.f20612a = cVar;
                this.f20613b = bVar;
            }

            public final void onClick(View view) {
                this.f20612a.mo14654a(this.f20613b);
            }
        }

        /* renamed from: com.bytedance.android.livesdk.definition.c$c$c */
        static final class View$OnClickListenerC8324c implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C8320c f20614a;

            /* renamed from: b */
            final /* synthetic */ C8319b f20615b;

            static {
                Covode.recordClassIndex(9162);
            }

            View$OnClickListenerC8324c(C8320c cVar, C8319b bVar) {
                this.f20614a = cVar;
                this.f20615b = bVar;
            }

            public final void onClick(View view) {
                this.f20614a.mo14654a(this.f20615b);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.bytedance.android.livesdk.definition.c$c$a */
        public static final class C8321a implements AbstractC11663q {

            /* renamed from: a */
            final /* synthetic */ C8320c f20606a;

            /* renamed from: b */
            final /* synthetic */ int f20607b;

            /* renamed from: c */
            final /* synthetic */ String f20608c;

            /* renamed from: d */
            final /* synthetic */ int f20609d;

            static {
                Covode.recordClassIndex(9159);
            }

            C8321a(C8320c cVar, int i, String str, int i2) {
                this.f20606a = cVar;
                this.f20607b = i;
                this.f20608c = str;
                this.f20609d = i2;
            }

            @Override // com.bytedance.android.livesdkapi.depend.p680d.AbstractC11663q
            /* renamed from: a */
            public final void mo14394a(final boolean z) {
                this.f20606a.f20598b.post(new Runnable(this) {
                    /* class com.bytedance.android.livesdk.definition.C8317c.C8320c.C8321a.RunnableC83221 */

                    /* renamed from: a */
                    final /* synthetic */ C8321a f20610a;

                    static {
                        Covode.recordClassIndex(9160);
                    }

                    {
                        this.f20610a = r1;
                    }

                    public final void run() {
                        if (z) {
                            C3270n.C3271a aVar = new C3270n.C3271a();
                            aVar.f9365b = this.f20610a.f20606a.f20600d.get(this.f20610a.f20607b).mo14662b();
                            aVar.f9364a = this.f20610a.f20606a.f20600d.get(this.f20610a.f20607b).mo14661a();
                            DataChannel dataChannel = this.f20610a.f20606a.f20601e;
                            if (dataChannel != null) {
                                dataChannel.mo28315b(C9127i.class, aVar);
                            }
                            if (NetworkUtils.isWifi(C3966y.m9669e())) {
                                LinkedHashMap linkedHashMap = new LinkedHashMap();
                                String str = aVar.f9364a;
                                C89219l.m154716b(str, "");
                                linkedHashMap.put(StringSet.name, str);
                                String str2 = aVar.f9365b;
                                C89219l.m154716b(str2, "");
                                linkedHashMap.put("sdk_key", str2);
                                C6805b<Map<String, String>> bVar = AbstractC6804a.f17020cP;
                                C89219l.m154716b(bVar, "");
                                C6806c.m14603a(bVar, linkedHashMap);
                                AbstractC2953a a = C6193a.m13435a(AbstractC4357d.class);
                                C89219l.m154716b(a, "");
                                AbstractC5777j b = ((AbstractC4357d) a).getLivePlayControllerManager().mo11553b(this.f20610a.f20608c);
                                if (b != null) {
                                    b.mo11545e(false);
                                }
                                C8320c cVar = this.f20610a.f20606a;
                                String str3 = aVar.f9364a;
                                C89219l.m154716b(str3, "");
                                C11226ao.m19883a(C3966y.m9669e(), cVar.mo14652a(R.string.ejv, str3), 0);
                            } else {
                                C8320c cVar2 = this.f20610a.f20606a;
                                String str4 = aVar.f9364a;
                                C89219l.m154716b(str4, "");
                                C11226ao.m19883a(C3966y.m9669e(), cVar2.mo14652a(R.string.dy8, str4), 0);
                            }
                            C8320c cVar3 = this.f20610a.f20606a;
                            String str5 = aVar.f9365b;
                            C89219l.m154716b(str5, "");
                            cVar3.mo14655a(str5, false);
                            this.f20610a.f20606a.mo14653a(this.f20610a.f20607b);
                            this.f20610a.f20606a.mo14656b(this.f20610a.f20609d);
                            this.f20610a.f20606a.f20597a = this.f20610a.f20607b;
                            this.f20610a.f20606a.f20602f.mo9929d();
                        }
                        this.f20610a.f20606a.f20599c = false;
                    }
                });
            }
        }

        /* renamed from: a */
        public final void mo14653a(int i) {
            RecyclerView.ViewHolder viewHolder;
            C3854a.m9453a(4, "LiveDefinitionSelectionDialog", "selectItemUI. position=".concat(String.valueOf(i)));
            this.f20600d.get(i).f20621c = true;
            RecyclerView recyclerView = this.f20603g;
            if (recyclerView != null) {
                viewHolder = recyclerView.mo4451f(i);
            } else {
                viewHolder = null;
            }
            C8319b bVar = (C8319b) viewHolder;
            if (bVar != null) {
                ConstraintLayout constraintLayout = bVar.f20593a;
                if (constraintLayout != null) {
                    constraintLayout.setSelected(true);
                }
                LiveTextView liveTextView = bVar.f20594b;
                if (liveTextView != null) {
                    liveTextView.setSelected(true);
                }
                LiveRadioButton liveRadioButton = bVar.f20595c;
                if (liveRadioButton != null) {
                    liveRadioButton.setChecked(true);
                }
            }
        }

        /* renamed from: b */
        public final void mo14656b(int i) {
            RecyclerView.ViewHolder viewHolder;
            C3854a.m9453a(4, "LiveDefinitionSelectionDialog", "unSelectItem. position=".concat(String.valueOf(i)));
            this.f20600d.get(i).f20621c = false;
            RecyclerView recyclerView = this.f20603g;
            if (recyclerView != null) {
                viewHolder = recyclerView.mo4451f(i);
            } else {
                viewHolder = null;
            }
            C8319b bVar = (C8319b) viewHolder;
            if (bVar != null) {
                ConstraintLayout constraintLayout = bVar.f20593a;
                if (constraintLayout != null) {
                    constraintLayout.setSelected(false);
                }
                LiveTextView liveTextView = bVar.f20594b;
                if (liveTextView != null) {
                    liveTextView.setSelected(false);
                }
                LiveRadioButton liveRadioButton = bVar.f20595c;
                if (liveRadioButton != null) {
                    liveRadioButton.setChecked(false);
                }
            }
        }

        /* renamed from: a */
        public final void mo14654a(C8319b bVar) {
            int adapterPosition;
            int i;
            if (this.f20599c || (adapterPosition = bVar.getAdapterPosition()) == (i = this.f20597a)) {
                return;
            }
            if (this.f20605i) {
                this.f20599c = true;
                C3854a.m9453a(4, "LiveDefinitionSelectionDialog", "handleAnchorItemSelect. oldPosition=" + i + ". ; newPosition=" + adapterPosition + ",  newResolution=" + this.f20600d.get(adapterPosition).mo14662b() + '.');
                C3270n.C3271a aVar = new C3270n.C3271a();
                aVar.f9365b = this.f20600d.get(adapterPosition).mo14662b();
                aVar.f9364a = this.f20600d.get(adapterPosition).mo14661a();
                DataChannelGlobal.f42558d.mo28325b(C9140v.class, aVar);
                HashMap hashMap = new HashMap();
                String str = aVar.f9364a;
                C89219l.m154716b(str, "");
                hashMap.put(StringSet.name, str);
                String str2 = aVar.f9365b;
                C89219l.m154716b(str2, "");
                hashMap.put("sdk_key", str2);
                C6805b<Map<String, String>> bVar2 = AbstractC6804a.f17021cQ;
                C89219l.m154716b(bVar2, "");
                C6806c.m14603a(bVar2, hashMap);
                String str3 = aVar.f9365b;
                C89219l.m154716b(str3, "");
                mo14655a(str3, true);
                mo14653a(adapterPosition);
                mo14656b(i);
                this.f20597a = adapterPosition;
                this.f20602f.mo9929d();
                this.f20599c = false;
                return;
            }
            this.f20599c = true;
            String b = this.f20600d.get(adapterPosition).mo14662b();
            C11870f fVar = C11870f.C11871a.f28404a;
            C89219l.m154716b(fVar, "");
            EnterRoomLinkSession a = fVar.mo19010a();
            C89219l.m154716b(a, "");
            String str4 = a.f28391b.f28233c.f28288E;
            if (str4 == null) {
                str4 = "";
            }
            AbstractC2953a a2 = C6193a.m13435a(AbstractC4357d.class);
            C89219l.m154716b(a2, "");
            AbstractC5777j b2 = ((AbstractC4357d) a2).getLivePlayControllerManager().mo11553b(str4);
            if (b2 != null) {
                b2.mo12910a(b, new C8321a(this, adapterPosition, str4, i));
            }
        }

        /* renamed from: a */
        public final String mo14652a(int i, String str) {
            Context context;
            String string;
            RecyclerView recyclerView = this.f20603g;
            if (recyclerView != null) {
                context = recyclerView.getContext();
            } else {
                context = null;
            }
            Activity a = C3888a.m9505a(context);
            if (a == null || (string = a.getString(i, new Object[]{str})) == null) {
                return "";
            }
            return string;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
        public final /* synthetic */ void onBindViewHolder(C8319b bVar, int i) {
            C8319b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            C8328d dVar = this.f20600d.get(i);
            C89219l.m154721d(dVar, "");
            LiveRadioButton liveRadioButton = bVar2.f20595c;
            if (liveRadioButton != null) {
                liveRadioButton.setClickable(false);
            }
            LiveTextView liveTextView = bVar2.f20594b;
            if (liveTextView != null) {
                liveTextView.setText(dVar.mo14661a());
            }
            LiveRadioButton liveRadioButton2 = bVar2.f20595c;
            if (liveRadioButton2 != null) {
                liveRadioButton2.setChecked(dVar.f20621c);
            }
            ConstraintLayout constraintLayout = bVar2.f20593a;
            if (constraintLayout != null) {
                constraintLayout.setSelected(dVar.f20621c);
            }
            LiveTextView liveTextView2 = bVar2.f20594b;
            if (liveTextView2 != null) {
                liveTextView2.setSelected(dVar.f20621c);
            }
            LiveTextView liveTextView3 = bVar2.f20594b;
            if (liveTextView3 != null) {
                liveTextView3.setOnClickListener(new View$OnClickListenerC8323b(this, bVar2));
            }
            if (this.f20604h) {
                bVar2.itemView.setOnClickListener(new View$OnClickListenerC8324c(this, bVar2));
            }
        }

        /* renamed from: a */
        public final void mo14655a(String str, boolean z) {
            Object obj;
            String str2;
            String str3;
            String str4;
            Map map;
            Map map2;
            String str5;
            EnumC11728i iVar;
            DataChannel dataChannel = this.f20601e;
            if (dataChannel != null) {
                obj = dataChannel.mo28318b(C9096dh.class);
            } else {
                obj = null;
            }
            String valueOf = String.valueOf(obj);
            String str6 = "";
            if (valueOf == null) {
                valueOf = str6;
            }
            DataChannel dataChannel2 = this.f20601e;
            if (dataChannel2 == null || (iVar = (EnumC11728i) dataChannel2.mo28318b(C9058bx.class)) == null) {
                str2 = str6;
            } else {
                str2 = C11729j.m20684a(iVar);
            }
            boolean z2 = this.f20604h;
            String str7 = "0";
            if (z2) {
                str3 = str7;
            } else if (!z2) {
                str3 = "1";
            } else {
                throw new C89376n();
            }
            DataChannel dataChannel3 = this.f20601e;
            if (!(dataChannel3 == null || (map2 = (Map) dataChannel3.mo28318b(C9125g.class)) == null || (str5 = (String) map2.get("sdk_key")) == null)) {
                str6 = str5;
            }
            try {
                DataChannel dataChannel4 = this.f20601e;
                if (dataChannel4 == null || (map = (Map) dataChannel4.mo28318b(C9125g.class)) == null || (str4 = (String) map.get("start_time")) == null) {
                    str4 = String.valueOf(System.currentTimeMillis());
                }
                str7 = String.valueOf((System.currentTimeMillis() - Long.parseLong(str4)) / 1000);
            } catch (Exception e) {
                C3854a.m9453a(4, "LiveDefinitionSelectionDialog", "reportSelectSuccess. catch exception=".concat(String.valueOf(e)));
            }
            if (z) {
                C8315a.m16467a();
            } else {
                C8315a.m16469a(valueOf, str2, str3, str7, str6, "normal", str);
            }
        }

        /* renamed from: a */
        private static RecyclerView.ViewHolder m16476a(C8320c cVar, ViewGroup viewGroup, int i) {
            boolean a;
            MethodCollector.m26663i(2370);
            C89219l.m154721d(viewGroup, "");
            View a2 = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.b5f, viewGroup, false);
            C89219l.m154716b(a2, "");
            C8319b bVar = new C8319b(a2, cVar.f20604h);
            try {
                if (bVar.itemView.getParent() != null) {
                    try {
                        a = SettingsManager.m29616a().mo25400a("catch_onCreateViewHolder_crash", true);
                    } catch (Exception unused) {
                    }
                    if (a) {
                        StringBuffer stringBuffer = new StringBuffer();
                        stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(bVar.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i);
                        C22708a.m42800a(stringBuffer.toString());
                        ViewGroup viewGroup2 = (ViewGroup) bVar.itemView.getParent();
                        if (viewGroup2 != null) {
                            viewGroup2.removeView(bVar.itemView);
                        }
                    }
                }
            } catch (Exception e) {
                C63423ai.m115002a(e);
                C51423a.m95786a(e);
            }
            C80493gg.f180088a = bVar.getClass().getName();
            MethodCollector.m26664o(2370);
            return bVar;
        }

        public C8320c(RecyclerView recyclerView, List<C8328d> list, boolean z, boolean z2, DataChannel dataChannel, AbstractC8330f fVar) {
            C89219l.m154721d(list, "");
            C89219l.m154721d(fVar, "");
            this.f20603g = recyclerView;
            this.f20600d = list;
            this.f20604h = z;
            this.f20605i = z2;
            this.f20601e = dataChannel;
            this.f20602f = fVar;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (this.f20600d.get(i).f20621c) {
                    this.f20597a = i;
                    return;
                }
            }
        }
    }

    @Override // com.bytedance.android.livesdk.AbstractC11293v
    /* renamed from: b */
    public final AbstractC11293v.C11295b mo8355b() {
        boolean z;
        int i;
        int i2;
        int a;
        Boolean bool;
        DataChannel dataChannel = this.f27010p;
        if (dataChannel == null || (bool = (Boolean) dataChannel.mo28318b(C9076co.class)) == null) {
            z = true;
        } else {
            z = bool.booleanValue();
        }
        this.f20589d = z;
        if (z) {
            i = R.style.a2y;
            if (z) {
                i2 = 80;
            } else {
                if (z) {
                    throw new C89376n();
                }
                i2 = 5;
            }
        } else {
            i = R.style.a2z;
            i2 = 5;
        }
        int i3 = -1;
        if (z) {
            a = -1;
        } else if (!z) {
            a = (int) C11227ap.m19885a(getContext(), 427.0f);
        } else {
            throw new C89376n();
        }
        boolean z2 = this.f20589d;
        if (z2) {
            i3 = -2;
        } else if (z2) {
            throw new C89376n();
        }
        AbstractC11293v.C11295b bVar = new AbstractC11293v.C11295b(R.layout.b5e);
        bVar.f27015b = i;
        bVar.f27025l = 48;
        bVar.f27020g = i2;
        bVar.f27021h = a;
        bVar.f27022i = i3;
        return bVar;
    }

    /* renamed from: com.bytedance.android.livesdk.definition.c$f */
    static final class View$OnClickListenerC8327f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C8317c f20618a;

        static {
            Covode.recordClassIndex(9165);
        }

        View$OnClickListenerC8327f(C8317c cVar) {
            this.f20618a = cVar;
        }

        public final void onClick(View view) {
            this.f20618a.dismiss();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.definition.c$d */
    static final class C8325d extends AbstractC89220m implements AbstractC89172b<C89391z, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C8317c f20616a;

        static {
            Covode.recordClassIndex(9163);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8325d(C8317c cVar) {
            super(1);
            this.f20616a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C89391z zVar) {
            C89219l.m154721d(zVar, "");
            this.f20616a.dismiss();
            return C89391z.f203057a;
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater cloneInContext = super.onGetLayoutInflater(bundle).cloneInContext(C4054a.m9853a(getActivity()));
        C89219l.m154716b(cloneInContext, "");
        return cloneInContext;
    }

    /* renamed from: com.bytedance.android.livesdk.definition.c$e */
    static final class C8326e extends AbstractC89220m implements AbstractC89172b<String, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C8317c f20617a;

        static {
            Covode.recordClassIndex(9164);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8326e(C8317c cVar) {
            super(1);
            this.f20617a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(String str) {
            C8320c cVar;
            String str2 = str;
            C89219l.m154721d(str2, "");
            C3854a.m9453a(4, "LiveDefinitionSelectionDialog", "onResolutionDegrade. newResolution=".concat(String.valueOf(str2)));
            if (!this.f20617a.f20587a && (cVar = this.f20617a.f20588b) != null) {
                C89219l.m154721d(str2, "");
                int i = 0;
                if (str2.length() != 0) {
                    int size = cVar.f20600d.size();
                    int i2 = 0;
                    while (true) {
                        if (i2 >= size) {
                            break;
                        } else if (C89219l.m154714a((Object) str2, (Object) cVar.f20600d.get(i2).mo14662b())) {
                            i = i2;
                            break;
                        } else {
                            i2++;
                        }
                    }
                    if (i != cVar.f20597a) {
                        cVar.mo14656b(cVar.f20597a);
                        cVar.mo14653a(i);
                        cVar.f20597a = i;
                    }
                }
            }
            return C89391z.f203057a;
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, com.bytedance.android.livesdk.AbstractC11293v, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        boolean z;
        String str;
        String str2;
        String str3;
        String g;
        EnumC11728i iVar;
        Long l;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            z = arguments.getBoolean("key_is_preview");
        } else {
            z = false;
        }
        this.f20587a = z;
        DataChannel dataChannel = this.f27010p;
        String str4 = "";
        if (dataChannel == null || (l = (Long) dataChannel.mo28318b(C9096dh.class)) == null || (str = String.valueOf(l.longValue())) == null) {
            str = str4;
        }
        DataChannel dataChannel2 = this.f27010p;
        if (dataChannel2 == null || (iVar = (EnumC11728i) dataChannel2.mo28318b(C9058bx.class)) == null) {
            str2 = str4;
        } else {
            str2 = C11729j.m20684a(iVar);
        }
        boolean z2 = this.f20589d;
        if (z2) {
            str3 = "0";
        } else if (!z2) {
            str3 = "1";
        } else {
            throw new C89376n();
        }
        if (this.f20587a) {
            C6501b a = C6501b.C6502a.m13948a("livesdk_live_anchor_definition_selection_page_show");
            AbstractC6872f b = C11115u.m19743a().mo17915b();
            C89219l.m154716b(b, str4);
            a.mo12646a("anchor_id", b.mo13161c()).mo12644a("screen_share").mo12655b();
        } else {
            C89219l.m154721d(str, str4);
            C89219l.m154721d(str2, str4);
            C89219l.m154721d(str3, str4);
            C11870f fVar = C11870f.C11871a.f28404a;
            C89219l.m154716b(fVar, str4);
            EnterRoomLinkSession a2 = fVar.mo19010a();
            C89219l.m154716b(a2, str4);
            String str5 = a2.f28391b.f28233c.f28288E;
            if (str5 == null) {
                str5 = str4;
            }
            AbstractC2953a a3 = C6193a.m13435a(AbstractC4357d.class);
            C89219l.m154716b(a3, str4);
            AbstractC5777j b2 = ((AbstractC4357d) a3).getLivePlayControllerManager().mo11553b(str5);
            if (!(b2 == null || (g = b2.mo11547g()) == null)) {
                str4 = g;
            }
            C6501b.C6502a.m13948a("livesdk_live_definition_selection_page_show").mo12651a("anchor_id", C8315a.m16470b()).mo12651a("room_id", str).mo12651a("room_orientation", str3).mo12651a("current_definition", str4).mo12644a(str2).mo12655b();
        }
        DataChannel dataChannel3 = this.f27010p;
        if (dataChannel3 != null) {
            dataChannel3.mo28309a((AbstractC1204m) this, C9052br.class, (AbstractC89172b) new C8325d(this));
        }
        DataChannel dataChannel4 = this.f27010p;
        if (dataChannel4 != null) {
            dataChannel4.mo28309a((AbstractC1204m) this, C9126h.class, (AbstractC89172b) new C8326e(this));
        }
    }

    /* renamed from: com.bytedance.android.livesdk.definition.c$b */
    public static final class C8319b extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public ConstraintLayout f20593a;

        /* renamed from: b */
        public LiveTextView f20594b;

        /* renamed from: c */
        public LiveRadioButton f20595c;

        /* renamed from: d */
        private final boolean f20596d;

        static {
            Covode.recordClassIndex(9157);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C8319b(View view, boolean z) {
            super(view);
            C89219l.m154721d(view, "");
            this.f20596d = z;
            this.f20593a = (ConstraintLayout) view.findViewById(R.id.a5u);
            this.f20594b = (LiveTextView) view.findViewById(R.id.euw);
            this.f20595c = (LiveRadioButton) view.findViewById(R.id.ddq);
        }
    }

    @Override // com.bytedance.android.livesdk.AbstractC11293v, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        List<C8328d> a;
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        this.f20590e = (RecyclerView) view.findViewById(R.id.eoj);
        ImageView imageView = (ImageView) view.findViewById(R.id.eoh);
        this.f20591f = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(new View$OnClickListenerC8327f(this));
        }
        C3854a.m9453a(4, "LiveDefinitionSelectionDialog", "isPreviewPager:" + this.f20587a);
        RecyclerView recyclerView = this.f20590e;
        if (recyclerView != null) {
            view.getContext();
            recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        }
        boolean z = this.f20587a;
        if (z) {
            a = C8329e.m16486a(this);
        } else if (!z) {
            a = C8329e.m16485a();
        } else {
            throw new C89376n();
        }
        C8320c cVar = new C8320c(this.f20590e, a, this.f20589d, this.f20587a, this.f27010p, this);
        this.f20588b = cVar;
        RecyclerView recyclerView2 = this.f20590e;
        if (recyclerView2 != null) {
            recyclerView2.setAdapter(cVar);
        }
    }
}
