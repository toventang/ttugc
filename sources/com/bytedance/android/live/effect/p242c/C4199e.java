package com.bytedance.android.live.effect.p242c;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.AbstractC1204m;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.android.live.broadcast.api.C3046c;
import com.bytedance.android.live.effect.C4242e;
import com.bytedance.android.live.effect.C4306l;
import com.bytedance.android.live.effect.model.FilterModel;
import com.bytedance.android.live.effect.p242c.C4195c;
import com.bytedance.android.live.effect.p242c.C4208j;
import com.bytedance.android.livesdk.livesetting.effect.LiveNewEffectPanelSetting;
import com.bytedance.android.livesdk.p452ao.AbstractC6804a;
import com.bytedance.android.livesdk.p452ao.C6805b;
import com.bytedance.android.livesdk.p561j.C9019am;
import com.bytedance.android.livesdk.p643ui.C10935a;
import com.bytedance.android.livesdk.utils.C11279p;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.C17846f;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.effect.c.e */
public final class C4199e extends C10935a {

    /* renamed from: c */
    public static final C4200a f11665c = new C4200a((byte) 0);

    /* renamed from: a */
    public final List<FilterModel> f11666a = new ArrayList();

    /* renamed from: b */
    public DataChannel f11667b;

    /* renamed from: d */
    private HashMap f11668d;

    static {
        Covode.recordClassIndex(4769);
    }

    /* renamed from: com.bytedance.android.live.effect.c.e$a */
    public static final class C4200a {
        static {
            Covode.recordClassIndex(4770);
        }

        private C4200a() {
        }

        public /* synthetic */ C4200a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.android.livesdk.p643ui.C10935a, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.f11668d;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* renamed from: com.bytedance.android.live.effect.c.e$b */
    static final class RunnableC4201b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C4199e f11669a;

        /* renamed from: b */
        final /* synthetic */ RecyclerView f11670b;

        static {
            Covode.recordClassIndex(4771);
        }

        RunnableC4201b(C4199e eVar, RecyclerView recyclerView) {
            this.f11669a = eVar;
            this.f11670b = recyclerView;
        }

        public final void run() {
            if (C4208j.C4212b.f11691a.mo9899c()) {
                int size = this.f11669a.f11666a.size();
                for (int i = 0; i < size; i++) {
                    if (this.f11669a.f11666a.get(i).isNew()) {
                        this.f11670b.mo4413b(i);
                        C4208j jVar = C4208j.C4212b.f11691a;
                        if (jVar.f11679a != null) {
                            for (FilterModel filterModel : jVar.f11679a) {
                                if (filterModel.getEffect() != null && filterModel.isNew()) {
                                    filterModel.setNew(false);
                                    jVar.mo9922a(filterModel.getEffect().getId(), filterModel.getEffect().getTagsUpdatedAt());
                                }
                            }
                            return;
                        }
                        return;
                    }
                }
            }
            RecyclerView recyclerView = this.f11670b;
            C6805b<Integer> bVar = AbstractC6804a.f16886O;
            C89219l.m154716b(bVar, "");
            Integer a = bVar.mo13066a();
            C89219l.m154716b(a, "");
            recyclerView.mo4413b(a.intValue());
        }
    }

    /* renamed from: com.bytedance.android.live.effect.c.e$d */
    static final class C4203d extends AbstractC89220m implements AbstractC89172b<List<? extends FilterModel>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C4199e f11672a;

        static {
            Covode.recordClassIndex(4773);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4203d(C4199e eVar) {
            super(1);
            this.f11672a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(List<? extends FilterModel> list) {
            List<? extends FilterModel> list2 = list;
            C89219l.m154721d(list2, "");
            this.f11672a.f11666a.clear();
            this.f11672a.f11666a.addAll(list2);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.android.live.effect.c.e$c */
    static final class C4202c implements C4195c.AbstractC4196a {

        /* renamed from: a */
        final /* synthetic */ C4199e f11671a;

        static {
            Covode.recordClassIndex(4772);
        }

        C4202c(C4199e eVar) {
            this.f11671a = eVar;
        }

        @Override // com.bytedance.android.live.effect.p242c.C4195c.AbstractC4196a
        /* renamed from: a */
        public final void mo9915a(int i) {
            if (this.f11671a.f11667b != null) {
                DataChannel dataChannel = this.f11671a.f11667b;
                if (dataChannel != null) {
                    dataChannel.mo28320c(C4306l.class, this.f11671a.f11666a.get(i));
                }
                if (C11279p.m20022c()) {
                    DataChannelGlobal.f42558d.mo28321a(C3046c.class, true);
                    if (i == 0) {
                        DataChannelGlobal.f42558d.mo28321a(C9019am.class, "");
                    } else {
                        DataChannelGlobal.f42558d.mo28321a(C9019am.class, this.f11671a.f11666a.get(i).getFilterId());
                    }
                }
            }
        }
    }

    @Override // com.bytedance.android.livesdk.p643ui.C10935a, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        List<FilterModel> list;
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        DataChannel a = C17846f.m33055a(this);
        this.f11667b = a;
        List<FilterModel> list2 = this.f11666a;
        if (a == null || (list = (List) a.mo28318b(C4242e.class)) == null) {
            list = C4208j.C4212b.f11691a.f11679a;
            C89219l.m154716b(list, "");
        }
        list2.addAll(list);
        View findViewById = view.findViewById(R.id.deq);
        C89219l.m154716b(findViewById, "");
        RecyclerView recyclerView = (RecyclerView) findViewById;
        getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        if (LiveNewEffectPanelSetting.INSTANCE.useOldPanel()) {
            recyclerView.mo4402a(new C4207i());
        }
        recyclerView.setAdapter(new C4195c(getContext(), this.f11666a, new C4202c(this)));
        recyclerView.post(new RunnableC4201b(this, recyclerView));
        DataChannel dataChannel = this.f11667b;
        if (dataChannel != null) {
            dataChannel.mo28309a((AbstractC1204m) this, C4242e.class, (AbstractC89172b) new C4203d(this));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        return C1764a.m5927a(layoutInflater, R.layout.b87, viewGroup, false);
    }
}
