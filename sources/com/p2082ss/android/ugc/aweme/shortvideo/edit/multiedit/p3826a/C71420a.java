package com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.p3826a;

import android.graphics.Bitmap;
import android.os.Message;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.services.apm.api.C22708a;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.C70066ac;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.C70582z;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.model.C70091f;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.p3829d.C71436a;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import java.util.HashMap;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.a.a */
public final class C71420a extends C70582z {

    /* renamed from: i */
    public final HashMap<String, Bitmap> f160032i = new HashMap<>();

    /* renamed from: j */
    public final HashMap<String, ImageView> f160033j = new HashMap<>();

    /* renamed from: k */
    public final C71436a f160034k = new C71436a();

    static {
        Covode.recordClassIndex(83954);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a, com.p2082ss.android.ugc.aweme.shortvideo.cut.C70582z
    public final int getItemViewType(int i) {
        return 10002;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a, com.p2082ss.android.ugc.aweme.shortvideo.cut.C70582z
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m126132a(this, viewGroup, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a, com.p2082ss.android.ugc.aweme.shortvideo.cut.C70582z
    public final int getItemCount() {
        if (this.f157924a == null) {
            return 0;
        }
        return this.f157924a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a, com.p2082ss.android.ugc.aweme.shortvideo.cut.C70582z
    public final long getItemId(int i) {
        return (long) ((C70066ac) this.f157924a.get(i)).f156679a;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.AbstractC70081l, com.p2082ss.android.ugc.aweme.shortvideo.cut.C70582z
    /* renamed from: a */
    public final void mo110557a(RecyclerView.ViewHolder viewHolder) {
        C89219l.m154721d(viewHolder, "");
        if (viewHolder instanceof C71421a) {
            ((C70582z.C70585c) viewHolder).mo111349a();
            this.f157929f.mo110476a(new C70091f(0, viewHolder.getAdapterPosition(), -1));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.C70582z
    /* renamed from: b */
    public final void mo111346b(VideoSegment videoSegment) {
        if (videoSegment != null) {
            List list = this.f157924a;
            C89219l.m154716b(list, "");
            int size = list.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                } else if (C89219l.m154714a((Object) ((C70066ac) this.f157924a.get(i)).f156680b.mo110571a(false), (Object) videoSegment.mo110571a(false))) {
                    this.f157924a.remove(i);
                    break;
                } else {
                    i++;
                }
            }
            notifyDataSetChanged();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.a.a$a */
    public final class C71421a extends C70582z.C70585c {

        /* renamed from: d */
        final /* synthetic */ C71420a f160035d;

        static {
            Covode.recordClassIndex(83955);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C71421a(C71420a aVar, ViewGroup viewGroup) {
            super(viewGroup);
            C89219l.m154721d(viewGroup, "");
            this.f160035d = aVar;
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.a.a$a$a */
        static final class C71422a implements C71436a.AbstractC71439a {

            /* renamed from: a */
            final /* synthetic */ C71421a f160036a;

            /* renamed from: b */
            final /* synthetic */ String f160037b;

            static {
                Covode.recordClassIndex(83956);
            }

            C71422a(C71421a aVar, String str) {
                this.f160036a = aVar;
                this.f160037b = str;
            }

            @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.p3829d.C71436a.AbstractC71439a
            /* renamed from: a */
            public final void mo113032a(String str, Bitmap bitmap) {
                if (bitmap != null && this.f160036a.f160035d.f160033j.get(this.f160037b) != null) {
                    ImageView imageView = this.f160036a.f160035d.f160033j.get(str);
                    if (imageView == null) {
                        C89219l.m154715b();
                    }
                    imageView.setImageBitmap(bitmap);
                    this.f160036a.f160035d.f160032i.put(this.f160037b, bitmap);
                }
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.C70582z.C70585c
        /* renamed from: a */
        public final void mo111351a(C70582z.C70585c cVar, String str) {
            C89219l.m154721d(cVar, "");
            C89219l.m154721d(str, "");
            SimpleDraweeView simpleDraweeView = cVar.f157933a;
            C89219l.m154716b(simpleDraweeView, "");
            simpleDraweeView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            HashMap<String, ImageView> hashMap = this.f160035d.f160033j;
            SimpleDraweeView simpleDraweeView2 = cVar.f157933a;
            C89219l.m154716b(simpleDraweeView2, "");
            hashMap.put(str, simpleDraweeView2);
            if (this.f160035d.f160032i.get(str) == null) {
                C71436a aVar = this.f160035d.f160034k;
                C71422a aVar2 = new C71422a(this, str);
                if (!TextUtils.isEmpty(str)) {
                    aVar.f160057c = aVar2;
                    Message message = new Message();
                    message.what = 1;
                    message.obj = str;
                    aVar.f160056b.sendMessage(message);
                    return;
                }
                return;
            }
            cVar.f157933a.setImageBitmap(this.f160035d.f160032i.get(str.toString()));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.AbstractC70081l, com.p2082ss.android.ugc.aweme.shortvideo.cut.C70582z
    /* renamed from: a */
    public final void mo110558a(RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
        C89219l.m154721d(viewHolder, "");
        C89219l.m154721d(viewHolder2, "");
        int adapterPosition = viewHolder.getAdapterPosition();
        int adapterPosition2 = viewHolder2.getAdapterPosition();
        if (adapterPosition < this.f157924a.size() && adapterPosition2 < this.f157924a.size()) {
            this.f157924a.add(adapterPosition2, this.f157924a.remove(adapterPosition));
            notifyItemMoved(adapterPosition, adapterPosition2);
            this.f157929f.mo110476a(new C70091f(1, adapterPosition, adapterPosition2));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.AbstractC70081l, com.p2082ss.android.ugc.aweme.shortvideo.cut.C70582z
    /* renamed from: a */
    public final void mo110559a(RecyclerView.ViewHolder viewHolder, boolean z) {
        C89219l.m154721d(viewHolder, "");
        if (viewHolder instanceof C71421a) {
            ((C70582z.C70585c) viewHolder).mo111352b();
            C70091f fVar = new C70091f(2, -1, viewHolder.getAdapterPosition());
            fVar.f156757a = z;
            this.f157929f.mo110476a(fVar);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C71420a(VideoEditViewModel videoEditViewModel, CutMultiVideoViewModel cutMultiVideoViewModel, List<? extends VideoSegment> list) {
        super(videoEditViewModel, cutMultiVideoViewModel, list);
        C89219l.m154721d(videoEditViewModel, "");
        C89219l.m154721d(cutMultiVideoViewModel, "");
        C89219l.m154721d(list, "");
    }

    /* renamed from: a */
    private static RecyclerView.ViewHolder m126132a(C71420a aVar, ViewGroup viewGroup, int i) {
        boolean a;
        MethodCollector.m26663i(11859);
        C89219l.m154721d(viewGroup, "");
        C71421a aVar2 = new C71421a(aVar, viewGroup);
        try {
            if (aVar2.itemView.getParent() != null) {
                try {
                    a = SettingsManager.m29616a().mo25400a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (a) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(aVar2.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i);
                    C22708a.m42800a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) aVar2.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(aVar2.itemView);
                    }
                }
            }
        } catch (Exception e) {
            C63423ai.m115002a(e);
            C51423a.m95786a(e);
        }
        C80493gg.f180088a = aVar2.getClass().getName();
        MethodCollector.m26664o(11859);
        return aVar2;
    }
}
