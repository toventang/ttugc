package com.p2082ss.android.ugc.aweme.music.p3465b;

import android.graphics.drawable.Animatable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.drawee.p1851c.C24202c;
import com.facebook.imagepipeline.p1885j.AbstractC24457f;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39060f;
import com.p2082ss.android.ugc.aweme.component.music.MusicService;
import com.p2082ss.android.ugc.aweme.music.model.ExternalMusicInfo;
import com.p2082ss.android.ugc.aweme.views.WrapContentRemoteImageView;
import com.p2082ss.android.ugc.trill.R;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.music.b.n */
public final class C60736n extends AbstractC39060f<ExternalMusicInfo> {

    /* renamed from: a */
    public AbstractC60737a f138023a;

    /* renamed from: com.ss.android.ugc.aweme.music.b.n$a */
    public interface AbstractC60737a {
        static {
            Covode.recordClassIndex(71293);
        }

        /* renamed from: a */
        void mo98158a(int i);
    }

    static {
        Covode.recordClassIndex(71292);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.music.b.n$b */
    public class C60738b extends RecyclerView.ViewHolder {

        /* renamed from: a */
        View f138024a;

        /* renamed from: b */
        public View f138025b;

        /* renamed from: c */
        ImageView f138026c;

        /* renamed from: d */
        public WrapContentRemoteImageView f138027d;

        /* renamed from: e */
        Animation f138028e;

        static {
            Covode.recordClassIndex(71294);
        }

        /* renamed from: a */
        public final void mo98159a() {
            ImageView imageView = this.f138026c;
            if (imageView != null) {
                imageView.clearAnimation();
            }
            View view = this.f138024a;
            if (view != null) {
                view.setVisibility(8);
            }
        }

        C60738b(View view) {
            super(view);
            MethodCollector.m26663i(6143);
            this.f138027d = (WrapContentRemoteImageView) view.findViewById(R.id.c0e);
            this.f138025b = view.findViewById(R.id.fhv);
            this.f138024a = view.findViewById(R.id.eh9);
            this.f138026c = (ImageView) view.findViewById(R.id.eh8);
            this.f138028e = AnimationUtils.loadAnimation(view.getContext(), R.anim.cw);
            this.f138027d.setOnClickListener(new View$OnClickListenerC60740o(this));
            MethodCollector.m26664o(6143);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l
    /* renamed from: a */
    public final RecyclerView.ViewHolder mo60184a(ViewGroup viewGroup, int i) {
        return new C60738b(C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.al8, viewGroup, false));
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l
    /* renamed from: a */
    public final void mo60186a(RecyclerView.ViewHolder viewHolder, int i) {
        ExternalMusicInfo externalMusicInfo;
        C60738b bVar = (C60738b) viewHolder;
        List list = this.f92236l;
        if (!C13603b.m24435a((Collection) list) && i >= 0 && i < list.size() && (externalMusicInfo = (ExternalMusicInfo) list.get(i)) != null) {
            if (!(bVar.f138024a == null || bVar.f138026c == null)) {
                bVar.f138024a.setVisibility(0);
                bVar.f138026c.startAnimation(bVar.f138028e);
            }
            if (!TextUtils.isEmpty(externalMusicInfo.getPartnerName())) {
                List<String> b = MusicService.m81198m().mo69312b(externalMusicInfo.getPartnerName());
                if (!C13603b.m24435a((Collection) b) && bVar.f138027d != null) {
                    if (i == list.size() - 1) {
                        bVar.f138025b.setVisibility(8);
                    }
                    bVar.f138027d.mo125078a(b.get(0), new C24202c<AbstractC24457f>() {
                        /* class com.p2082ss.android.ugc.aweme.music.p3465b.C60736n.C60738b.C607391 */

                        static {
                            Covode.recordClassIndex(71295);
                        }

                        @Override // com.facebook.drawee.p1851c.AbstractC24203d, com.facebook.drawee.p1851c.C24202c
                        public final void onFailure(String str, Throwable th) {
                            super.onFailure(str, th);
                            C60738b.this.mo98159a();
                        }

                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.String, java.lang.Object] */
                        @Override // com.facebook.drawee.p1851c.AbstractC24203d, com.facebook.drawee.p1851c.C24202c
                        public final /* synthetic */ void onIntermediateImageSet(String str, AbstractC24457f fVar) {
                            C60738b.this.mo98159a();
                            C60738b.this.f138027d.mo125077a(fVar);
                        }

                        @Override // com.facebook.drawee.p1851c.AbstractC24203d, com.facebook.drawee.p1851c.C24202c
                        public final void onIntermediateImageFailed(String str, Throwable th) {
                            super.onIntermediateImageFailed(str, th);
                            C60738b.this.mo98159a();
                            C60738b.this.f138025b.setVisibility(8);
                            C60738b.this.f138027d.setVisibility(8);
                        }

                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.String, java.lang.Object, android.graphics.drawable.Animatable] */
                        @Override // com.facebook.drawee.p1851c.AbstractC24203d, com.facebook.drawee.p1851c.C24202c
                        public final /* synthetic */ void onFinalImageSet(String str, AbstractC24457f fVar, Animatable animatable) {
                            C60738b.this.mo98159a();
                            C60738b.this.f138027d.mo125077a(fVar);
                        }
                    });
                }
            }
        }
    }
}
