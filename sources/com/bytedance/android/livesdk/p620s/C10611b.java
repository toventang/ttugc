package com.bytedance.android.livesdk.p620s;

import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.p032a.C0637f;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.DialogInterface$OnCancelListenerC0944d;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.android.live.base.model.HashtagResponse;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.core.widget.StateLayout;
import com.bytedance.android.live.design.p230a.C4054a;
import com.bytedance.android.live.design.widget.LiveButton;
import com.bytedance.android.live.design.widget.LiveEditText;
import com.bytedance.android.live.design.widget.LiveRadioButton;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.live.network.C5805e;
import com.bytedance.android.live.network.response.C5832d;
import com.bytedance.android.livesdk.AbstractC11293v;
import com.bytedance.android.livesdk.hashtag.HashtagApi;
import com.bytedance.android.livesdk.model.GameTag;
import com.bytedance.android.livesdk.model.Hashtag;
import com.bytedance.android.livesdk.p452ao.AbstractC6804a;
import com.bytedance.android.livesdk.p452ao.C6805b;
import com.bytedance.android.livesdk.p452ao.C6806c;
import com.bytedance.android.livesdk.p561j.C9079cr;
import com.bytedance.android.livesdk.util.rxutils.C11191f;
import com.bytedance.android.livesdk.util.rxutils.C11195i;
import com.bytedance.android.livesdk.util.rxutils.p651b.EnumC11186b;
import com.bytedance.android.livesdk.utils.C11278o;
import com.bytedance.android.livesdk.utils.C11279p;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.services.apm.api.C22708a;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.bytedance.android.livesdk.s.b */
public final class C10611b extends AbstractC11293v {

    /* renamed from: b */
    public static final C10612a f25604b = new C10612a((byte) 0);

    /* renamed from: a */
    public C10613b f25605a;

    /* renamed from: c */
    private boolean f25606c;

    /* renamed from: d */
    private HashMap f25607d;

    /* renamed from: com.bytedance.android.livesdk.s.b$b */
    public static final class C10613b extends RecyclerView.AbstractC1350a<RecyclerView.ViewHolder> {

        /* renamed from: c */
        public static final C10614a f25608c = new C10614a((byte) 0);

        /* renamed from: a */
        public GameTag f25609a;

        /* renamed from: b */
        public final List<GameTag> f25610b;

        /* renamed from: d */
        private List<GameTag> f25611d;

        /* renamed from: e */
        private String f25612e = "";

        /* renamed from: f */
        private boolean f25613f;

        /* renamed from: g */
        private final AbstractC89183m<GameTag, Integer, C89391z> f25614g;

        /* renamed from: h */
        private final LiveEditText f25615h;

        static {
            Covode.recordClassIndex(12202);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            return m19188a(viewGroup, i);
        }

        /* renamed from: com.bytedance.android.livesdk.s.b$b$a */
        public static final class C10614a {
            static {
                Covode.recordClassIndex(12203);
            }

            private C10614a() {
            }

            public /* synthetic */ C10614a(byte b) {
                this();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
        public final int getItemCount() {
            int i = 0;
            if (this.f25613f) {
                List<GameTag> list = this.f25611d;
                if (list != null) {
                    return list.size();
                }
                return 0;
            }
            List<GameTag> list2 = this.f25611d;
            if (list2 != null) {
                i = list2.size();
            }
            return i + 1;
        }

        /* renamed from: a */
        public final void mo17535a() {
            List<GameTag> list = this.f25611d;
            if (list != null) {
                int i = 0;
                for (T t : list) {
                    int i2 = i + 1;
                    if (i < 0) {
                        C89070n.m154520a();
                    }
                    T t2 = t;
                    if (t2.getSelected()) {
                        this.f25609a = t2;
                        this.f25614g.invoke(t2, Integer.valueOf(i2));
                    }
                    i = i2;
                }
            }
        }

        /* renamed from: b */
        public final void mo17538b() {
            Integer valueOf;
            List<GameTag> list = this.f25610b;
            if (list != null) {
                int i = 0;
                for (T t : list) {
                    int i2 = i + 1;
                    if (i < 0) {
                        C89070n.m154520a();
                    }
                    T t2 = t;
                    if (t2.getSelected()) {
                        t2.setSelected(false);
                        List<GameTag> list2 = this.f25611d;
                        if (!(list2 == null || (valueOf = Integer.valueOf(list2.indexOf(t2))) == null)) {
                            int intValue = valueOf.intValue();
                            if (!this.f25613f) {
                                intValue++;
                            }
                            notifyItemChanged(intValue);
                        }
                    }
                    i = i2;
                }
            }
        }

        /* renamed from: b */
        private final int m19189b(int i) {
            if (this.f25613f) {
                return i;
            }
            return i - 1;
        }

        /* renamed from: com.bytedance.android.livesdk.s.b$b$b */
        static final class View$OnClickListenerC10615b implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C10613b f25616a;

            /* renamed from: b */
            final /* synthetic */ int f25617b;

            static {
                Covode.recordClassIndex(12204);
            }

            View$OnClickListenerC10615b(C10613b bVar, int i) {
                this.f25616a = bVar;
                this.f25617b = i;
            }

            public final void onClick(View view) {
                this.f25616a.mo17538b();
                this.f25616a.mo17536a(this.f25617b);
            }
        }

        /* renamed from: com.bytedance.android.livesdk.s.b$b$c */
        static final class View$OnClickListenerC10616c implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C10613b f25618a;

            /* renamed from: b */
            final /* synthetic */ int f25619b;

            static {
                Covode.recordClassIndex(12205);
            }

            View$OnClickListenerC10616c(C10613b bVar, int i) {
                this.f25618a = bVar;
                this.f25619b = i;
            }

            public final void onClick(View view) {
                this.f25618a.mo17538b();
                this.f25618a.mo17536a(this.f25619b);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
        public final int getItemViewType(int i) {
            if (this.f25613f || i != 0) {
                return 1;
            }
            return 0;
        }

        /* renamed from: a */
        public final void mo17536a(int i) {
            List<GameTag> list;
            GameTag gameTag;
            if (i >= 0 && (list = this.f25611d) != null && (gameTag = list.get(m19189b(i))) != null) {
                gameTag.setSelected(true);
                notifyItemChanged(i);
                this.f25609a = gameTag;
                LiveEditText liveEditText = this.f25615h;
                if (liveEditText != null && liveEditText.isFocusable()) {
                    this.f25615h.clearFocus();
                }
            }
        }

        /* renamed from: a */
        private static RecyclerView.ViewHolder m19188a(ViewGroup viewGroup, int i) {
            RecyclerView.ViewHolder viewHolder;
            boolean a;
            MethodCollector.m26663i(3287);
            C89219l.m154721d(viewGroup, "");
            if (i == 0) {
                View a2 = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.b5o, viewGroup, false);
                C89219l.m154716b(a2, "");
                viewHolder = new C10618d(a2);
            } else {
                View a3 = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.b5n, viewGroup, false);
                C89219l.m154716b(a3, "");
                viewHolder = new C10617c(a3);
            }
            try {
                if (viewHolder.itemView.getParent() != null) {
                    try {
                        a = SettingsManager.m29616a().mo25400a("catch_onCreateViewHolder_crash", true);
                    } catch (Exception unused) {
                    }
                    if (a) {
                        StringBuffer stringBuffer = new StringBuffer();
                        stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(viewHolder.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i);
                        C22708a.m42800a(stringBuffer.toString());
                        ViewGroup viewGroup2 = (ViewGroup) viewHolder.itemView.getParent();
                        if (viewGroup2 != null) {
                            viewGroup2.removeView(viewHolder.itemView);
                        }
                    }
                }
            } catch (Exception e) {
                C63423ai.m115002a(e);
                C51423a.m95786a(e);
            }
            C80493gg.f180088a = viewHolder.getClass().getName();
            MethodCollector.m26664o(3287);
            return viewHolder;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            GameTag gameTag;
            int a;
            String str;
            String str2 = "";
            C89219l.m154721d(viewHolder, str2);
            boolean z = false;
            if (viewHolder instanceof C10617c) {
                C10617c cVar = (C10617c) viewHolder;
                int adapterPosition = cVar.getAdapterPosition();
                List<GameTag> list = this.f25611d;
                if (list != null) {
                    gameTag = list.get(m19189b(adapterPosition));
                } else {
                    gameTag = null;
                }
                int adapterPosition2 = cVar.getAdapterPosition();
                AbstractC89183m<GameTag, Integer, C89391z> mVar = this.f25614g;
                String str3 = this.f25612e;
                C89219l.m154721d(mVar, str2);
                C89219l.m154721d(str3, str2);
                if (!(gameTag == null || (str = gameTag.showName) == null)) {
                    str2 = str;
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str2);
                if (C11279p.m20013a((CharSequence) str3) && str2.length() > 0 && (a = C89361p.m154887a((CharSequence) str2, str3, 0, true)) >= 0) {
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(Color.parseColor("#FF4C3A")), a, str3.length() + a, 34);
                }
                cVar.f25620a.setText(spannableStringBuilder);
                if (gameTag != null) {
                    z = gameTag.getSelected();
                }
                cVar.f25621b.setChecked(z);
                if (z) {
                    if (gameTag == null) {
                        C89219l.m154715b();
                    }
                    mVar.invoke(gameTag, Integer.valueOf(adapterPosition2));
                }
                viewHolder.itemView.setOnClickListener(new View$OnClickListenerC10615b(this, adapterPosition));
                cVar.f25621b.setOnClickListener(new View$OnClickListenerC10616c(this, adapterPosition));
            } else if (viewHolder instanceof C10618d) {
                C10618d dVar = (C10618d) viewHolder;
                List<GameTag> list2 = this.f25611d;
                if (list2 == null || !C10610a.m19181a(list2)) {
                    dVar.f25622a.setText(C3966y.m9657a((int) R.string.e9x));
                } else {
                    dVar.f25622a.setText(C3966y.m9657a((int) R.string.e9v));
                }
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: h.f.a.m<? super com.bytedance.android.livesdk.model.GameTag, ? super java.lang.Integer, h.z> */
        /* JADX WARN: Multi-variable type inference failed */
        public C10613b(AbstractC89183m<? super GameTag, ? super Integer, C89391z> mVar, List<GameTag> list, LiveEditText liveEditText) {
            C89219l.m154721d(mVar, "");
            this.f25614g = mVar;
            this.f25610b = list;
            this.f25615h = liveEditText;
            this.f25611d = list;
        }

        /* renamed from: a */
        public final void mo17537a(List<GameTag> list, String str, boolean z) {
            C89219l.m154721d(str, "");
            this.f25611d = list;
            this.f25612e = str;
            this.f25613f = z;
            notifyDataSetChanged();
            mo17535a();
        }
    }

    static {
        Covode.recordClassIndex(12200);
    }

    @Override // com.bytedance.android.livesdk.AbstractC11293v
    /* renamed from: a */
    public final void mo8165a() {
        HashMap hashMap = this.f25607d;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.android.livesdk.AbstractC11293v
    /* renamed from: a_ */
    public final View mo8166a_(int i) {
        if (this.f25607d == null) {
            this.f25607d = new HashMap();
        }
        View view = (View) this.f25607d.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f25607d.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, com.bytedance.android.livesdk.AbstractC11293v, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo8165a();
    }

    /* renamed from: com.bytedance.android.livesdk.s.b$a */
    public static final class C10612a {
        static {
            Covode.recordClassIndex(12201);
        }

        private C10612a() {
        }

        public /* synthetic */ C10612a(byte b) {
            this();
        }

        /* renamed from: a */
        public static void m19187a(AbstractC0952i iVar, boolean z) {
            Fragment fragment;
            C89219l.m154721d("GameCategoryListDialog", "");
            if (iVar != null) {
                fragment = iVar.mo3551a("GameCategoryListDialog");
            } else {
                fragment = null;
            }
            if (fragment instanceof DialogInterface$OnCancelListenerC0944d) {
                ((DialogInterface$OnCancelListenerC0944d) fragment).dismiss();
            }
            if (iVar != null) {
                C10611b bVar = new C10611b();
                Bundle bundle = new Bundle();
                bundle.putBoolean("key_auto_open_from_topic", z);
                bVar.setArguments(bundle);
                bVar.show(iVar, "GameCategoryListDialog");
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.s.b$e */
    static final class C10619e<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C10611b f25623a;

        static {
            Covode.recordClassIndex(12208);
        }

        C10619e(C10611b bVar) {
            this.f25623a = bVar;
        }

        /* renamed from: a */
        private static boolean m19194a() {
            try {
                return C34719f.C34720a.f82009a.mo61395c();
            } catch (Exception unused) {
                return false;
            }
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C5832d dVar = (C5832d) obj;
            this.f25623a.getContext();
            if (!C58029j.f132253e || !C58029j.m104846b() || C58029j.m104847c()) {
                C58029j.f132253e = m19194a();
            }
            LinkedHashMap linkedHashMap = null;
            if (!C58029j.f132253e) {
                this.f25623a.mo17534a(1, null);
                return;
            }
            List<GameTag> list = ((HashtagResponse) dVar.data).gameTagList;
            C6805b<Map<String, String>> bVar = AbstractC6804a.f17018cN;
            String str = "";
            C89219l.m154716b(bVar, str);
            Hashtag hashtag = ((HashtagResponse) dVar.data).gameHashTag;
            if (hashtag != null) {
                linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("key_id", String.valueOf(hashtag.f23083id));
                String str2 = hashtag.title;
                if (str2 != null) {
                    str = str2;
                }
                linkedHashMap.put("key_title", str);
            }
            C6806c.m14603a(bVar, linkedHashMap);
            this.f25623a.mo17534a(0, list);
        }
    }

    @Override // com.bytedance.android.livesdk.AbstractC11293v
    /* renamed from: b */
    public final AbstractC11293v.C11295b mo8355b() {
        AbstractC11293v.C11295b bVar = new AbstractC11293v.C11295b(R.layout.b5k);
        bVar.f27025l = 48;
        bVar.f27020g = 80;
        bVar.f27021h = -1;
        bVar.f27023j = 73;
        return bVar;
    }

    /* renamed from: com.bytedance.android.livesdk.s.b$j */
    static final class View$OnClickListenerC10624j implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C10611b f25628a;

        static {
            Covode.recordClassIndex(12213);
        }

        View$OnClickListenerC10624j(C10611b bVar) {
            this.f25628a = bVar;
        }

        public final void onClick(View view) {
            this.f25628a.dismiss();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.s.b$m */
    public static final class C10628m implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ C10611b f25632a;

        static {
            Covode.recordClassIndex(12217);
        }

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C10628m(C10611b bVar) {
            this.f25632a = bVar;
        }

        /* renamed from: a */
        private final void m19196a(boolean z) {
            if (z) {
                LinearLayout linearLayout = (LinearLayout) this.f25632a.mo8166a_(R.id.ceg);
                if (linearLayout != null) {
                    linearLayout.setVisibility(0);
                    return;
                }
                return;
            }
            LinearLayout linearLayout2 = (LinearLayout) this.f25632a.mo8166a_(R.id.ceg);
            if (linearLayout2 != null) {
                linearLayout2.setVisibility(8);
            }
        }

        public final void afterTextChanged(Editable editable) {
            String str;
            List<GameTag> list;
            boolean z;
            C3854a.m9453a(4, "GameCategoryListDialog", "afterTextChanged.");
            Drawable a = C0637f.m2348a(this.f25632a.getResources(), 2131234307, null);
            Drawable a2 = C0637f.m2348a(this.f25632a.getResources(), 2131234304, null);
            if (editable == null || (str = editable.toString()) == null) {
                str = "";
            }
            Objects.requireNonNull(str, "null cannot be cast to non-null type kotlin.CharSequence");
            String obj = C89361p.m154910b((CharSequence) str).toString();
            C10613b bVar = this.f25632a.f25605a;
            if (bVar != null) {
                list = bVar.f25610b;
            } else {
                list = null;
            }
            boolean z2 = true;
            if (list != null) {
                C89219l.m154721d(list, "");
                C89219l.m154721d(obj, "");
                List<GameTag> b = m19197b(m19195a(list, obj), obj);
                boolean a3 = C10610a.m19181a(b);
                if (a3) {
                    m19196a(true);
                } else {
                    m19196a(false);
                }
                if (obj.length() <= 0 || a3) {
                    z = false;
                } else {
                    z = true;
                }
                C10613b bVar2 = this.f25632a.f25605a;
                if (bVar2 != null) {
                    bVar2.mo17537a(b, obj, z);
                }
            }
            if (editable != null && !C89361p.m154870a(editable)) {
                z2 = false;
            }
            if (!z2) {
                ((LiveEditText) this.f25632a.mo8166a_(R.id.ax5)).setCompoundDrawablesRelativeWithIntrinsicBounds(a, (Drawable) null, a2, (Drawable) null);
            } else {
                ((LiveEditText) this.f25632a.mo8166a_(R.id.ax5)).setCompoundDrawablesRelativeWithIntrinsicBounds(a, (Drawable) null, (Drawable) null, (Drawable) null);
            }
        }

        /* renamed from: b */
        private static List<GameTag> m19197b(List<GameTag> list, String str) {
            ArrayList arrayList = new ArrayList();
            for (T t : list) {
                T t2 = t;
                if (C10610a.m19181a(list)) {
                    if (!t2.isNonGameOrOtherGameItem()) {
                    }
                } else if ((!C89361p.m154870a((CharSequence) str)) && t2.isNonGameOrOtherGameItem()) {
                }
                arrayList.add(t);
            }
            return arrayList;
        }

        /* renamed from: a */
        private static List<GameTag> m19195a(List<GameTag> list, String str) {
            ArrayList arrayList = new ArrayList();
            for (T t : list) {
                T t2 = t;
                Pattern compile = Pattern.compile("(?i)".concat(String.valueOf(str)));
                String str2 = t2.showName;
                String str3 = "";
                if (str2 == null) {
                    str2 = str3;
                }
                Matcher matcher = compile.matcher(str2);
                String str4 = t2.fullName;
                if (str4 == null) {
                    str4 = str3;
                }
                Matcher matcher2 = compile.matcher(str4);
                String str5 = t2.shortName;
                if (str5 != null) {
                    str3 = str5;
                }
                Matcher matcher3 = compile.matcher(str3);
                if (matcher.find() || matcher2.find() || matcher3.find() || t2.isNonGameOrOtherGameItem()) {
                    arrayList.add(t);
                }
            }
            return arrayList;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.s.b$d */
    public static final class C10618d extends RecyclerView.ViewHolder {

        /* renamed from: a */
        final LiveTextView f25622a;

        static {
            Covode.recordClassIndex(12207);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10618d(View view) {
            super(view);
            C89219l.m154721d(view, "");
            View findViewById = view.findViewById(R.id.f4v);
            C89219l.m154716b(findViewById, "");
            this.f25622a = (LiveTextView) findViewById;
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, com.bytedance.android.livesdk.AbstractC11293v, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        boolean z;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            z = arguments.getBoolean("key_auto_open_from_topic");
        } else {
            z = false;
        }
        this.f25606c = z;
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater cloneInContext = super.onGetLayoutInflater(bundle).cloneInContext(C4054a.m9853a(getActivity()));
        C89219l.m154716b(cloneInContext, "");
        return cloneInContext;
    }

    /* renamed from: com.bytedance.android.livesdk.s.b$c */
    public static final class C10617c extends RecyclerView.ViewHolder {

        /* renamed from: a */
        final LiveTextView f25620a;

        /* renamed from: b */
        public final LiveRadioButton f25621b;

        static {
            Covode.recordClassIndex(12206);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10617c(View view) {
            super(view);
            C89219l.m154721d(view, "");
            View findViewById = view.findViewById(R.id.ewh);
            C89219l.m154716b(findViewById, "");
            this.f25620a = (LiveTextView) findViewById;
            View findViewById2 = view.findViewById(R.id.ewi);
            C89219l.m154716b(findViewById2, "");
            this.f25621b = (LiveRadioButton) findViewById2;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.s.b$f */
    static final class C10620f<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C10611b f25624a;

        static {
            Covode.recordClassIndex(12209);
        }

        C10620f(C10611b bVar) {
            this.f25624a = bVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            this.f25624a.mo17534a(1, null);
            C3854a.m9453a(4, "GameCategoryListDialog", "fetchGameList. onError. error=" + ((Throwable) obj).getMessage());
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, com.bytedance.android.livesdk.AbstractC11293v
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        C6805b<Map<String, String>> bVar = AbstractC6804a.f17017cM;
        C89219l.m154716b(bVar, "");
        GameTag a = GameTag.C9511a.m17802a(bVar.mo13066a());
        if (!this.f25606c) {
            return;
        }
        if (a == null || a.isNonGameItem()) {
            GameTag a2 = C10610a.m19178a();
            Map<String, String> a3 = GameTag.C9511a.m17803a(a2);
            C6805b<Map<String, String>> bVar2 = AbstractC6804a.f17017cM;
            C89219l.m154716b(bVar2, "");
            C6806c.m14603a(bVar2, a3);
            DataChannel dataChannel = this.f27010p;
            if (dataChannel != null) {
                dataChannel.mo28315b(C9079cr.class, a2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.s.b$g */
    public static final class View$OnFocusChangeListenerC10621g implements View.OnFocusChangeListener {

        /* renamed from: a */
        final /* synthetic */ C10611b f25625a;

        static {
            Covode.recordClassIndex(12210);
        }

        View$OnFocusChangeListenerC10621g(C10611b bVar) {
            this.f25625a = bVar;
        }

        public final void onFocusChange(View view, boolean z) {
            C3854a.m9453a(4, "GameCategoryListDialog", "et_search onFocusChanged. hasFocus=".concat(String.valueOf(z)));
            if (!z) {
                LiveEditText liveEditText = (LiveEditText) this.f25625a.mo8166a_(R.id.ax5);
                C89219l.m154716b(liveEditText, "");
                C11278o.m19996b(liveEditText.getContext(), (EditText) this.f25625a.mo8166a_(R.id.ax5));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.s.b$i */
    public static final class View$OnTouchListenerC10623i implements View.OnTouchListener {

        /* renamed from: a */
        final /* synthetic */ C10611b f25627a;

        static {
            Covode.recordClassIndex(12212);
        }

        View$OnTouchListenerC10623i(C10611b bVar) {
            this.f25627a = bVar;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            if (view == null || motionEvent == null) {
                return false;
            }
            if (motionEvent.getAction() != 2 && motionEvent.getAction() != 1) {
                return false;
            }
            LiveEditText liveEditText = (LiveEditText) this.f25627a.mo8166a_(R.id.ax5);
            C89219l.m154716b(liveEditText, "");
            if (!liveEditText.isFocusable()) {
                return false;
            }
            ((LiveEditText) this.f25627a.mo8166a_(R.id.ax5)).clearFocus();
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.s.b$k */
    public static final class C10625k extends AbstractC89220m implements AbstractC89183m<GameTag, Integer, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C10611b f25629a;

        static {
            Covode.recordClassIndex(12214);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10625k(C10611b bVar) {
            super(2);
            this.f25629a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(GameTag gameTag, Integer num) {
            int intValue = num.intValue();
            C89219l.m154721d(gameTag, "");
            C3854a.m9453a(4, "GameCategoryListDialog", "select item callback. gameItem=".concat(String.valueOf(gameTag)));
            LiveButton liveButton = (LiveButton) this.f25629a.mo8166a_(R.id.xp);
            if (liveButton != null) {
                liveButton.setEnabled(true);
            }
            LiveButton liveButton2 = (LiveButton) this.f25629a.mo8166a_(R.id.xp);
            if (liveButton2 != null) {
                liveButton2.setOnClickListener(new View.OnClickListener(this) {
                    /* class com.bytedance.android.livesdk.p620s.C10611b.C10625k.View$OnClickListenerC106261 */

                    /* renamed from: a */
                    final /* synthetic */ C10625k f25630a;

                    static {
                        Covode.recordClassIndex(12215);
                    }

                    {
                        this.f25630a = r1;
                    }

                    public final void onClick(View view) {
                        GameTag gameTag;
                        C10613b bVar = this.f25630a.f25629a.f25605a;
                        if (bVar != null && (gameTag = bVar.f25609a) != null) {
                            Map<String, String> a = GameTag.C9511a.m17803a(gameTag);
                            C6805b<Map<String, String>> bVar2 = AbstractC6804a.f17017cM;
                            C89219l.m154716b(bVar2, "");
                            C6806c.m14603a(bVar2, a);
                            DataChannel dataChannel = this.f25630a.f25629a.f27010p;
                            if (dataChannel != null) {
                                dataChannel.mo28315b(C9079cr.class, gameTag);
                            }
                            this.f25630a.f25629a.dismiss();
                        }
                    }
                });
            }
            RecyclerView recyclerView = (RecyclerView) this.f25629a.mo8166a_(R.id.doa);
            if (recyclerView != null) {
                recyclerView.mo4413b(intValue);
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.android.livesdk.AbstractC11293v, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        LiveEditText liveEditText = (LiveEditText) mo8166a_(R.id.ax5);
        if (liveEditText != null) {
            liveEditText.setEnabled(false);
        }
        StateLayout stateLayout = (StateLayout) mo8166a_(R.id.b9m);
        if (stateLayout != null) {
            stateLayout.mo9406a("LOADING");
        }
        ((HashtagApi) C5805e.m12718a().mo11572a(HashtagApi.class)).fetchHashtagList().mo143271a(new C11191f()).mo143271a(C11195i.m19838a(this, EnumC11186b.DESTROY)).mo143254a(new C10619e(this), new C10620f(this));
        ImageView imageView = (ImageView) mo8166a_(R.id.bu5);
        if (imageView != null) {
            imageView.setOnClickListener(new View$OnClickListenerC10624j(this));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.s.b$h */
    public static final class View$OnTouchListenerC10622h implements View.OnTouchListener {

        /* renamed from: a */
        final /* synthetic */ C10611b f25626a;

        static {
            Covode.recordClassIndex(12211);
        }

        View$OnTouchListenerC10622h(C10611b bVar) {
            this.f25626a = bVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0080, code lost:
            if (r7 > ((float) (r1 + r0.getHeight()))) goto L_0x0021;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean onTouch(android.view.View r11, android.view.MotionEvent r12) {
            /*
            // Method dump skipped, instructions count: 131
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.p620s.C10611b.View$OnTouchListenerC10622h.onTouch(android.view.View, android.view.MotionEvent):boolean");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.s.b$l */
    public static final class View$OnTouchListenerC10627l implements View.OnTouchListener {

        /* renamed from: a */
        final /* synthetic */ C10611b f25631a;

        static {
            Covode.recordClassIndex(12216);
        }

        View$OnTouchListenerC10627l(C10611b bVar) {
            this.f25631a = bVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x00bb, code lost:
            if (r2 >= ((float) (r1 - r0.getPaddingEnd()))) goto L_0x0060;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:7:0x005e, code lost:
            if (r5 <= ((float) (r2 - (r1 - r0.getPaddingEnd())))) goto L_0x0060;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean onTouch(android.view.View r9, android.view.MotionEvent r10) {
            /*
            // Method dump skipped, instructions count: 190
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.p620s.C10611b.View$OnTouchListenerC10627l.onTouch(android.view.View, android.view.MotionEvent):boolean");
        }
    }

    /* renamed from: a */
    public final void mo17534a(int i, List<GameTag> list) {
        ((StateLayout) mo8166a_(R.id.b9m)).mo9406a("CONTENT");
        if (i == 0) {
            LinearLayout linearLayout = (LinearLayout) mo8166a_(R.id.cd_);
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
            }
            LiveEditText liveEditText = (LiveEditText) mo8166a_(R.id.ax5);
            if (liveEditText != null) {
                liveEditText.setEnabled(true);
            }
            LiveEditText liveEditText2 = (LiveEditText) mo8166a_(R.id.ax5);
            if (liveEditText2 != null) {
                liveEditText2.setOnFocusChangeListener(new View$OnFocusChangeListenerC10621g(this));
            }
        } else if (i == 1) {
            LinearLayout linearLayout2 = (LinearLayout) mo8166a_(R.id.cd_);
            if (linearLayout2 != null) {
                linearLayout2.setVisibility(0);
            }
            LiveEditText liveEditText3 = (LiveEditText) mo8166a_(R.id.ax5);
            if (liveEditText3 != null) {
                liveEditText3.setEnabled(false);
            }
        }
        if (list == null) {
            list = new ArrayList<>();
        }
        this.f25605a = new C10613b(new C10625k(this), C10610a.m19179a(this.f25606c, C89070n.m154585g((Collection) list)), (LiveEditText) mo8166a_(R.id.ax5));
        RecyclerView recyclerView = (RecyclerView) mo8166a_(R.id.doa);
        if (recyclerView != null) {
            getContext();
            recyclerView.setLayoutManager(new LinearLayoutManager());
        }
        RecyclerView recyclerView2 = (RecyclerView) mo8166a_(R.id.doa);
        if (recyclerView2 != null) {
            recyclerView2.setAdapter(this.f25605a);
        }
        C10613b bVar = this.f25605a;
        if (bVar != null) {
            bVar.mo17535a();
        }
        LiveEditText liveEditText4 = (LiveEditText) mo8166a_(R.id.ax5);
        if (liveEditText4 != null) {
            liveEditText4.addTextChangedListener(new C10628m(this));
        }
        LiveEditText liveEditText5 = (LiveEditText) mo8166a_(R.id.ax5);
        if (liveEditText5 != null) {
            liveEditText5.setOnTouchListener(new View$OnTouchListenerC10627l(this));
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) mo8166a_(R.id.a5v);
        if (constraintLayout != null) {
            constraintLayout.setOnTouchListener(new View$OnTouchListenerC10622h(this));
        }
        RecyclerView recyclerView3 = (RecyclerView) mo8166a_(R.id.doa);
        if (recyclerView3 != null) {
            recyclerView3.setOnTouchListener(new View$OnTouchListenerC10623i(this));
        }
    }
}
