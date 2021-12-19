package com.bytedance.android.live.publicscreen.impl.game;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p218f.C3941k;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.publicscreen.impl.model.C6015e;
import com.bytedance.android.live.publicscreen.impl.model.chat.C5993b;
import com.bytedance.android.live.publicscreen.p386a.p390d.AbstractC5873h;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.services.apm.api.C22708a;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.publicscreen.impl.game.e */
public final class C5972e extends RecyclerView.AbstractC1350a<AbstractC5968a<? extends AbstractC5873h>> {

    /* renamed from: b */
    public static final C5973a f15000b = new C5973a((byte) 0);

    /* renamed from: a */
    public final Context f15001a;

    /* renamed from: c */
    private final List<AbstractC5873h> f15002c;

    static {
        Covode.recordClassIndex(6582);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ AbstractC5968a<? extends AbstractC5873h> onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m13087a(viewGroup, i);
    }

    /* renamed from: com.bytedance.android.live.publicscreen.impl.game.e$a */
    public static final class C5973a {
        static {
            Covode.recordClassIndex(6583);
        }

        private C5973a() {
        }

        public /* synthetic */ C5973a(byte b) {
            this();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemCount() {
        return this.f15002c.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemViewType(int i) {
        AbstractC5873h hVar = this.f15002c.get(i);
        if (hVar instanceof C5993b) {
            return 0;
        }
        if (hVar instanceof C6015e) {
            return 1;
        }
        return 3;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<? extends com.bytedance.android.live.publicscreen.a.d.h> */
    /* JADX WARN: Multi-variable type inference failed */
    public C5972e(Context context, List<? extends AbstractC5873h> list) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(list, "");
        this.f15001a = context;
        this.f15002c = list;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ void onBindViewHolder(AbstractC5968a<? extends AbstractC5873h> aVar, int i) {
        ImageModel imageModel;
        AbstractC5968a<? extends AbstractC5873h> aVar2 = aVar;
        C89219l.m154721d(aVar2, "");
        AbstractC5873h hVar = this.f15002c.get(i);
        if (hVar instanceof C5993b) {
            C5969b bVar = (C5969b) aVar2;
            C5993b bVar2 = (C5993b) hVar;
            C89219l.m154721d(bVar2, "");
            bVar.f14997b.setText(bVar2.mo11871v());
            HSImageView hSImageView = bVar.f14998c;
            User b = bVar2.mo10375b();
            if (b != null) {
                imageModel = b.getAvatarThumb();
            } else {
                imageModel = null;
            }
            C3941k.m9601a(hSImageView, imageModel);
            TextView textView = bVar.f14996a;
            CharSequence z = bVar2.mo11710z();
            C89219l.m154721d(textView, "");
            if (z != null) {
                textView.setVisibility(0);
                textView.setText(z);
                return;
            }
            textView.setVisibility(8);
        } else if (hVar instanceof C6015e) {
            C6015e eVar = (C6015e) hVar;
            C89219l.m154721d(eVar, "");
            C5974f.m13088a(((C5971d) aVar2).f14999a, eVar);
        } else {
            C89219l.m154721d(hVar, "");
        }
    }

    /* renamed from: a */
    private static RecyclerView.ViewHolder m13087a(ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder viewHolder;
        MethodCollector.m26663i(5161);
        C89219l.m154721d(viewGroup, "");
        boolean z = true;
        if (i == 0) {
            viewHolder = new C5969b(viewGroup);
        } else if (i != 1) {
            viewHolder = new C5970c(viewGroup);
        } else {
            viewHolder = new C5971d(viewGroup);
        }
        try {
            if (viewHolder.itemView.getParent() != null) {
                try {
                    z = SettingsManager.m29616a().mo25400a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
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
        MethodCollector.m26664o(5161);
        return viewHolder;
    }
}
