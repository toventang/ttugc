package com.p2082ss.android.ugc.aweme.effect;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.asve.editor.AbstractC31071f;
import com.p2082ss.android.ugc.aweme.effect.C46331bo;
import com.p2082ss.android.ugc.aweme.effect.p2891c.p2893b.C46344a;
import com.p2082ss.android.ugc.aweme.effect.p2891c.p2893b.C46346b;
import com.p2082ss.android.ugc.aweme.effect.p2895e.AbstractC46354a;
import com.p2082ss.android.ugc.aweme.port.internal.AbstractC63278f;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.themechange.base.AVDmtHorizontalImageTextLayout;
import com.p2082ss.android.ugc.aweme.themechange.base.AVDmtTextView;
import com.p2082ss.android.ugc.trill.R;
import dmt.p4542av.video.C88300w;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.effect.y */
public final class C46392y extends Fragment {

    /* renamed from: a */
    boolean f108110a = true;

    /* renamed from: b */
    private C46331bo f108111b;

    /* renamed from: c */
    private HashMap f108112c;

    static {
        Covode.recordClassIndex(54969);
    }

    /* renamed from: a */
    public final View mo78878a(int i) {
        if (this.f108112c == null) {
            this.f108112c = new HashMap();
        }
        View view = (View) this.f108112c.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f108112c.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.f108112c;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* renamed from: a */
    public final int mo78877a() {
        LiveData<AbstractC31071f> e;
        AbstractC31071f value;
        ActivityC0945e activity = getActivity();
        if (activity == null) {
            return 0;
        }
        C89219l.m154716b(activity, "");
        AbstractC1174ac a = C1181ae.m3881a(activity, (C1175ad.AbstractC1177b) null).mo3983a(EditEffectVideoModel.class);
        C89219l.m154716b(a, "");
        AbstractC46354a a2 = ((EditEffectVideoModel) a).mo78623a();
        if (a2 == null || (e = a2.mo78854e()) == null || (value = e.getValue()) == null) {
            return 0;
        }
        return value.mo56246G();
    }

    /* renamed from: b */
    public final VideoPublishEditModel mo78880b() {
        ActivityC0945e activity = getActivity();
        if (activity == null) {
            return null;
        }
        C89219l.m154716b(activity, "");
        AbstractC1174ac a = C1181ae.m3881a(activity, (C1175ad.AbstractC1177b) null).mo3983a(EditEffectVideoModel.class);
        C89219l.m154716b(a, "");
        AbstractC46354a a2 = ((EditEffectVideoModel) a).mo78623a();
        if (a2 != null) {
            return a2.mo78851b();
        }
        return null;
    }

    /* renamed from: com.ss.android.ugc.aweme.effect.y$c */
    static final class C46395c<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C46392y f108117a;

        /* renamed from: b */
        final /* synthetic */ C46331bo f108118b;

        static {
            Covode.recordClassIndex(54972);
        }

        C46395c(C46392y yVar, C46331bo boVar) {
            this.f108117a = yVar;
            this.f108118b = boVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            if (bool != null) {
                C46331bo boVar = this.f108118b;
                if (boVar.f107994c == 1) {
                    boVar.notifyItemChanged(1);
                }
                if (!bool.booleanValue()) {
                    C46331bo boVar2 = this.f108118b;
                    if (boVar2.f107994c == 1) {
                        boVar2.f107994c = 0;
                        boVar2.notifyItemRangeChanged(0, 2);
                    }
                }
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        ActivityC0945e activity = getActivity();
        if (activity != null) {
            AbstractC1174ac a = C1181ae.m3881a(activity, (C1175ad.AbstractC1177b) null).mo3983a(EditEffectVideoModel.class);
            C89219l.m154716b(a, "");
            EditEffectVideoModel editEffectVideoModel = (EditEffectVideoModel) a;
            if (!editEffectVideoModel.mo78625b()) {
                AbstractC63278f f = C63244g.m114602a().mo73278f();
                C89219l.m154716b(activity, "");
                editEffectVideoModel.mo78624a(f.mo73331a(activity));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.effect.y$b */
    static final class C46394b<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C46392y f108115a;

        /* renamed from: b */
        final /* synthetic */ C46331bo f108116b;

        static {
            Covode.recordClassIndex(54971);
        }

        C46394b(C46392y yVar, C46331bo boVar) {
            this.f108115a = yVar;
            this.f108116b = boVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            C88300w wVar = (C88300w) obj;
            if (wVar != null) {
                String str = wVar.f200384a;
                switch (str.hashCode()) {
                    case 49:
                        if (str.equals("1")) {
                            this.f108116b.mo78815a(1);
                            return;
                        }
                        break;
                    case 50:
                        if (str.equals("2")) {
                            this.f108116b.mo78815a(2);
                            return;
                        }
                        break;
                    case 51:
                        if (str.equals("3")) {
                            this.f108116b.mo78815a(3);
                            return;
                        }
                        break;
                }
                C46331bo boVar = this.f108116b;
                if (boVar.f107994c != 0) {
                    boVar.f107994c = 0;
                    boVar.notifyDataSetChanged();
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.effect.y$a */
    static final class C46393a<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C46392y f108113a;

        /* renamed from: b */
        final /* synthetic */ C46331bo f108114b;

        static {
            Covode.recordClassIndex(54970);
        }

        C46393a(C46392y yVar, C46331bo boVar) {
            this.f108113a = yVar;
            this.f108114b = boVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            int i;
            String string;
            C46346b bVar = (C46346b) obj;
            if (bVar != null) {
                AVDmtTextView aVDmtTextView = (AVDmtTextView) this.f108113a.mo78878a(R.id.erk);
                C89219l.m154716b(aVDmtTextView, "");
                int i2 = bVar.f108032a;
                if (i2 == 0) {
                    C46392y yVar = this.f108113a;
                    if (!C46344a.m89396a((long) bVar.f108033b)) {
                        i = R.string.bl_;
                    } else if (yVar.f108110a) {
                        yVar.f108110a = false;
                        i = R.string.blb;
                    } else {
                        i = R.string.bla;
                    }
                    string = yVar.getString(i);
                    C89219l.m154716b(string, "");
                } else if (i2 == 1) {
                    String a = C1764a.m5929a(Locale.getDefault(), "%.1f", Arrays.copyOf(new Object[]{Float.valueOf(bVar.f108033b)}, 1));
                    C89219l.m154716b(a, "");
                    string = this.f108113a.getString(R.string.bkk, a);
                } else {
                    throw new IllegalArgumentException("unexpected TimeEffectHintOp, op = " + bVar.f108032a);
                }
                aVDmtTextView.setText(string);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.effect.y$d */
    static final class C46396d implements C46331bo.AbstractC46332a {

        /* renamed from: a */
        final /* synthetic */ C46392y f108119a;

        static {
            Covode.recordClassIndex(54973);
        }

        C46396d(C46392y yVar) {
            this.f108119a = yVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:24:0x0079  */
        @Override // com.p2082ss.android.ugc.aweme.effect.C46331bo.AbstractC46332a
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean mo78816a(int r11, boolean r12) {
            /*
            // Method dump skipped, instructions count: 132
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.effect.C46392y.C46396d.mo78816a(int, boolean):boolean");
        }
    }

    /* renamed from: a */
    public final void mo78879a(boolean z, boolean z2) {
        C46331bo boVar = this.f108111b;
        if (boVar != null) {
            boVar.f107992a = C46360i.m89450b();
            boVar.f107992a.get(1).isEnabled = z;
            boVar.f107992a.get(2).isEnabled = z2;
            boVar.f107992a.get(3).isEnabled = z2;
            boVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        AVDmtHorizontalImageTextLayout aVDmtHorizontalImageTextLayout = (AVDmtHorizontalImageTextLayout) mo78878a(R.id.erg);
        C89219l.m154716b(aVDmtHorizontalImageTextLayout, "");
        aVDmtHorizontalImageTextLayout.setVisibility(8);
        view.getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
        linearLayoutManager.mo4356b(0);
        RecyclerView recyclerView = (RecyclerView) mo78878a(R.id.dh0);
        C89219l.m154716b(recyclerView, "");
        recyclerView.setLayoutManager(linearLayoutManager);
        C46331bo boVar = new C46331bo();
        this.f108111b = boVar;
        boolean a = C46344a.m89396a((long) mo78877a());
        boVar.f107992a = C46360i.m89450b();
        if (a) {
            boVar.f107992a.get(2).isEnabled = false;
            boVar.f107992a.get(3).isEnabled = false;
        }
        boVar.f107993b = new C46396d(this);
        RecyclerView recyclerView2 = (RecyclerView) mo78878a(R.id.dh0);
        C89219l.m154716b(recyclerView2, "");
        recyclerView2.setAdapter(boVar);
        ActivityC0945e activity = getActivity();
        if (activity != null) {
            AbstractC1174ac a2 = C1181ae.m3881a(activity, (C1175ad.AbstractC1177b) null).mo3983a(EditEffectVideoModel.class);
            C89219l.m154716b(a2, "");
            EditEffectVideoModel editEffectVideoModel = (EditEffectVideoModel) a2;
            editEffectVideoModel.mo78629f().observe(this, new C46393a(this, boVar));
            editEffectVideoModel.mo78629f().setValue(C46346b.C46347a.m89402b((float) mo78877a()));
            editEffectVideoModel.mo78623a().mo78861l().observe(this, new C46394b(this, boVar));
            editEffectVideoModel.mo78623a().mo78855f().observe(this, new C46395c(this, boVar));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        return C1764a.m5927a(layoutInflater, R.layout.a0y, viewGroup, false);
    }
}
