package com.p2082ss.android.ugc.aweme.story.edit.business.shared.p4037d;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.services.apm.api.C22708a;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.p2730de.C40977l;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.services.story.StoryCoverExtractConfig;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.model.VideoCutInfo;
import com.p2082ss.android.ugc.aweme.story.edit.business.shared.p4037d.C76951a;
import com.p2082ss.android.ugc.aweme.story.edit.model.C77148a;
import com.p2082ss.android.ugc.aweme.story.edit.model.StoryEditClipModel;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import com.p2082ss.android.ugc.trill.R;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.d.b */
public final class C76958b extends RecyclerView.AbstractC1350a<C76951a> {

    /* renamed from: f */
    public static final C76959a f172669f = new C76959a((byte) 0);

    /* renamed from: a */
    boolean f172670a;

    /* renamed from: b */
    public int f172671b;

    /* renamed from: c */
    public final RecyclerView f172672c;

    /* renamed from: d */
    public final List<StoryEditClipModel> f172673d;

    /* renamed from: e */
    public final AbstractC89183m<StoryEditClipModel, Integer, C89391z> f172674e;

    static {
        Covode.recordClassIndex(89954);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ C76951a onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m134566a(this, viewGroup, i);
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.d.b$a */
    public static final class C76959a {
        static {
            Covode.recordClassIndex(89955);
        }

        private C76959a() {
        }

        public /* synthetic */ C76959a(byte b) {
            this();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemCount() {
        return this.f172673d.size();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.d.b$b */
    public static final class C76960b extends AbstractC89220m implements AbstractC89172b<Integer, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C76958b f172675a;

        static {
            Covode.recordClassIndex(89956);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C76960b(C76958b bVar) {
            super(1);
            this.f172675a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Integer num) {
            int intValue = num.intValue();
            if (!C40977l.m82500a(this.f172675a.f172672c, 600) && intValue >= 0 && intValue < this.f172675a.f172673d.size() && intValue != this.f172675a.f172671b) {
                C76958b bVar = this.f172675a;
                bVar.notifyItemChanged(bVar.f172671b, false);
                this.f172675a.f172671b = intValue;
                this.f172675a.notifyItemChanged(intValue, true);
                this.f172675a.f172674e.invoke(this.f172675a.f172673d.get(intValue), Integer.valueOf(intValue));
            }
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onBindViewHolder(C76951a aVar, int i) {
        boolean z;
        C89219l.m154721d(aVar, "");
        StoryEditClipModel storyEditClipModel = this.f172673d.get(i);
        boolean z2 = true;
        int i2 = 0;
        if (i == this.f172671b) {
            z = true;
        } else {
            z = false;
        }
        boolean z3 = this.f172670a;
        C89219l.m154721d(storyEditClipModel, "");
        if (z3) {
            EditPreviewInfo previewMediaInfo = storyEditClipModel.getPreviewMediaInfo();
            if (storyEditClipModel.getSourceContentType() != 2) {
                z2 = false;
            }
            int i3 = C76951a.f172657b;
            int i4 = C76951a.f172658c;
            VideoCutInfo videoCutInfo = storyEditClipModel.getPreviewMediaInfo().getVideoList().get(0).getVideoCutInfo();
            if (videoCutInfo != null) {
                i2 = (int) videoCutInfo.getStart();
            }
            C77148a.m134753a(previewMediaInfo, z2, new StoryCoverExtractConfig(i3, i4, i2), new C76951a.C76954b(aVar));
        }
        aVar.mo120513a(z);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int, java.util.List] */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ void onBindViewHolder(C76951a aVar, int i, List list) {
        C76951a aVar2 = aVar;
        C89219l.m154721d(aVar2, "");
        C89219l.m154721d(list, "");
        if (list.isEmpty()) {
            onBindViewHolder(aVar2, i);
            return;
        }
        Object obj = list.get(0);
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Boolean");
        aVar2.mo120513a(((Boolean) obj).booleanValue());
    }

    /* renamed from: a */
    private static RecyclerView.ViewHolder m134566a(C76958b bVar, ViewGroup viewGroup, int i) {
        boolean a;
        MethodCollector.m26663i(6292);
        C89219l.m154721d(viewGroup, "");
        View a2 = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.b19, viewGroup, false);
        C89219l.m154716b(a2, "");
        C76951a aVar = new C76951a(a2, new C76960b(bVar));
        try {
            if (aVar.itemView.getParent() != null) {
                try {
                    a = SettingsManager.m29616a().mo25400a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (a) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(aVar.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i);
                    C22708a.m42800a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) aVar.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(aVar.itemView);
                    }
                }
            }
        } catch (Exception e) {
            C63423ai.m115002a(e);
            C51423a.m95786a(e);
        }
        C80493gg.f180088a = aVar.getClass().getName();
        MethodCollector.m26664o(6292);
        return aVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r9v0, resolved type: h.f.a.m<? super com.ss.android.ugc.aweme.story.edit.model.StoryEditClipModel, ? super java.lang.Integer, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    public C76958b(RecyclerView recyclerView, List<StoryEditClipModel> list, StoryEditClipModel storyEditClipModel, AbstractC89183m<? super StoryEditClipModel, ? super Integer, C89391z> mVar) {
        C89219l.m154721d(recyclerView, "");
        C89219l.m154721d(list, "");
        C89219l.m154721d(mVar, "");
        this.f172672c = recyclerView;
        this.f172673d = list;
        this.f172674e = mVar;
        recyclerView.setItemViewCacheSize(10);
        int i = 0;
        if (storyEditClipModel != null) {
            Iterator<StoryEditClipModel> it = list.iterator();
            int i2 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i2 = -1;
                    break;
                } else if (C89219l.m154714a((Object) it.next().getClipId(), (Object) storyEditClipModel.getClipId())) {
                    break;
                } else {
                    i2++;
                }
            }
            i = Math.max(0, i2);
        }
        this.f172671b = i;
    }
}
