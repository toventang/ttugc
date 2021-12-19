package com.p2082ss.android.ugc.aweme.shortvideo.edit.audioeffect;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.app.ActivityC0218d;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.services.apm.api.C22708a;
import com.p2082ss.android.ugc.asve.editor.AbstractC31071f;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.effectplatform.AbstractC46415f;
import com.p2082ss.android.ugc.aweme.effectplatform.C46435t;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.infoSticker.AbstractC56659a;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.audioeffect.C70837c;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.audioeffect.C70851e;
import com.p2082ss.android.ugc.aweme.shortvideo.model.AVETParameter;
import com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a;
import com.p2082ss.android.ugc.aweme.themechange.base.AVDmtImageTextView;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import com.p2082ss.android.ugc.effectmanager.common.model.UrlModel;
import com.p2082ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.p2082ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.p2082ss.android.ugc.effectmanager.effect.model.CategoryPageModel;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import com.p2082ss.android.ugc.trill.R;
import dmt.p4542av.video.C88288n;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import p077b.C1731i;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.d */
public final class C70845d extends RecyclerView.AbstractC1350a<RecyclerView.ViewHolder> implements C70851e.AbstractC70854b {

    /* renamed from: a */
    public boolean f158605a;

    /* renamed from: b */
    public CategoryPageModel f158606b;

    /* renamed from: c */
    public AbstractC70878m f158607c;

    /* renamed from: d */
    public final ActivityC0218d f158608d;

    /* renamed from: e */
    final VideoPublishEditModel f158609e;

    /* renamed from: f */
    private int f158610f;

    /* renamed from: g */
    private List<? extends Effect> f158611g;

    /* renamed from: h */
    private RecyclerView f158612h;

    /* renamed from: i */
    private C70851e.AbstractC70854b f158613i = new C70851e.AbstractC70854b(this) {
        /* class com.p2082ss.android.ugc.aweme.shortvideo.edit.audioeffect.C70845d.C708461 */

        /* renamed from: a */
        final /* synthetic */ C70845d f158617a;

        static {
            Covode.recordClassIndex(83337);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        {
            this.f158617a = r1;
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.audioeffect.C70851e.AbstractC70854b
        /* renamed from: a */
        public final void mo112016a(View view, int i) {
            CategoryPageModel categoryPageModel;
            CategoryEffectModel categoryEffects;
            List<Effect> effects;
            Effect effect;
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            AVETParameter avetParameter;
            AVETParameter avetParameter2;
            AVETParameter avetParameter3;
            AVETParameter avetParameter4;
            C89219l.m154721d(view, "");
            if (-1 != i) {
                this.f158617a.f158605a = true;
                if (i == 0) {
                    this.f158617a.mo112014a(i);
                    return;
                }
                C70845d dVar = this.f158617a;
                if (i > 0 && (categoryPageModel = dVar.f158606b) != null && (categoryEffects = categoryPageModel.getCategoryEffects()) != null && (effects = categoryEffects.getEffects()) != null && (effect = effects.get(i - 1)) != null) {
                    C84425b a = new C84425b().mo129406a("enter_from", "video_edit_page").mo129406a("effect_name", effect.getName()).mo129406a("effect_id", effect.getEffectId());
                    VideoPublishEditModel videoPublishEditModel = dVar.f158609e;
                    if (videoPublishEditModel == null || (avetParameter4 = videoPublishEditModel.getAvetParameter()) == null || (str = avetParameter4.getShootWay()) == null) {
                        str = "";
                    }
                    C84425b a2 = a.mo129406a("shoot_way", str);
                    VideoPublishEditModel videoPublishEditModel2 = dVar.f158609e;
                    if (videoPublishEditModel2 == null || (str2 = videoPublishEditModel2.creationId) == null) {
                        str2 = "";
                    }
                    C84425b a3 = a2.mo129406a("creation_id", str2);
                    VideoPublishEditModel videoPublishEditModel3 = dVar.f158609e;
                    if (videoPublishEditModel3 == null || (avetParameter3 = videoPublishEditModel3.getAvetParameter()) == null || (str3 = avetParameter3.getContentSource()) == null) {
                        str3 = "";
                    }
                    C84425b a4 = a3.mo129406a("content_source", str3);
                    VideoPublishEditModel videoPublishEditModel4 = dVar.f158609e;
                    if (videoPublishEditModel4 == null || (avetParameter2 = videoPublishEditModel4.getAvetParameter()) == null || (str4 = avetParameter2.getStoryShootEntrance()) == null) {
                        str4 = "";
                    }
                    C84425b a5 = a4.mo129406a("shoot_entrance", str4);
                    VideoPublishEditModel videoPublishEditModel5 = dVar.f158609e;
                    if (videoPublishEditModel5 == null || (avetParameter = videoPublishEditModel5.getAvetParameter()) == null || (str5 = avetParameter.getContentType()) == null) {
                        str5 = "";
                    }
                    C39162r.m79460a("select_voice_effect", a5.mo129406a("content_type", str5).mo129404a("local_time_ms", System.currentTimeMillis()).f188764a);
                    String unzipPath = effect.getUnzipPath();
                    if (unzipPath == null) {
                        unzipPath = "";
                    }
                    C70837c.C70838a.m125105a();
                    if (C70837c.m125103a(effect)) {
                        dVar.mo112018a(effect, C70845d.m125113a(effect), C70825a.m125087b(effect), unzipPath);
                        dVar.mo112019b(i);
                        AbstractC70878m mVar = dVar.f158607c;
                        if (mVar != null) {
                            mVar.mo87716a(effect);
                            return;
                        }
                        return;
                    }
                    dVar.mo112015a(i, 2);
                    C70837c.C70838a.m125105a();
                    C70848b bVar = new C70848b(dVar, effect, i);
                    C89219l.m154721d(effect, "");
                    AbstractC46415f b = C70837c.C70838a.m125106b();
                    if (b != null) {
                        b.mo78887a(effect, C46435t.m89598a(new C70837c.C70843f(bVar), "effect"));
                    }
                }
            }
        }
    };

    /* renamed from: j */
    private final AbstractC31071f f158614j;

    /* renamed from: k */
    private final AudioEffectParam f158615k;

    /* renamed from: l */
    private final AbstractC72510a f158616l;

    static {
        Covode.recordClassIndex(83336);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m125112a(this, viewGroup, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemCount() {
        int i;
        CategoryEffectModel categoryEffects;
        List<Effect> effects;
        CategoryPageModel categoryPageModel = this.f158606b;
        if (categoryPageModel == null || (categoryEffects = categoryPageModel.getCategoryEffects()) == null || (effects = categoryEffects.getEffects()) == null) {
            i = 0;
        } else {
            i = effects.size();
        }
        return i + 1;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.d$b */
    public static final class C70848b implements C70837c.AbstractC70841d {

        /* renamed from: a */
        final /* synthetic */ C70845d f158619a;

        /* renamed from: b */
        final /* synthetic */ Effect f158620b;

        /* renamed from: c */
        final /* synthetic */ int f158621c;

        static {
            Covode.recordClassIndex(83339);
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.d$b$a */
        static final class CallableC70849a<V> implements Callable {

            /* renamed from: a */
            final /* synthetic */ C70848b f158622a;

            static {
                Covode.recordClassIndex(83340);
            }

            CallableC70849a(C70848b bVar) {
                this.f158622a = bVar;
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                new C79459a(this.f158622a.f158619a.f158608d).mo123050a(R.string.z7).mo123053a();
                this.f158622a.f158619a.mo112015a(this.f158622a.f158621c, 3);
                return C89391z.f203057a;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.d$b$b */
        static final class CallableC70850b<V> implements Callable {

            /* renamed from: a */
            final /* synthetic */ C70848b f158623a;

            /* renamed from: b */
            final /* synthetic */ Effect f158624b;

            static {
                Covode.recordClassIndex(83341);
            }

            CallableC70850b(C70848b bVar, Effect effect) {
                this.f158623a = bVar;
                this.f158624b = effect;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                CategoryPageModel categoryPageModel;
                CategoryEffectModel categoryEffects;
                if (!(this.f158624b == null || (categoryPageModel = this.f158623a.f158619a.f158606b) == null || (categoryEffects = categoryPageModel.getCategoryEffects()) == null)) {
                    List<? extends Effect> g = C89070n.m154585g((Collection) categoryEffects.getEffects());
                    g.set(this.f158623a.f158621c - 1, this.f158624b);
                    categoryEffects.setEffects(g);
                }
                this.f158623a.f158619a.mo112015a(this.f158623a.f158621c, 1);
                this.f158623a.f158619a.mo112019b(this.f158623a.f158621c);
                AbstractC70878m mVar = this.f158623a.f158619a.f158607c;
                if (mVar == null) {
                    return null;
                }
                mVar.mo87716a(this.f158623a.f158620b);
                return C89391z.f203057a;
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.audioeffect.C70837c.AbstractC70841d
        /* renamed from: a */
        public final void mo112012a(Effect effect) {
            String str;
            String str2;
            String str3 = null;
            if (effect != null) {
                str = effect.getEffectId();
            } else {
                str = null;
            }
            if (TextUtils.equals(str, this.f158620b.getEffectId())) {
                C1731i.m5640b(new CallableC70850b(this, effect), C1731i.f5564c);
                C70845d dVar = this.f158619a;
                String a = C70845d.m125113a(effect);
                if (effect != null) {
                    str2 = C70825a.m125087b(effect);
                    str3 = effect.getUnzipPath();
                } else {
                    str2 = null;
                }
                dVar.mo112018a(effect, a, str2, str3);
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.audioeffect.C70837c.AbstractC70841d
        /* renamed from: a */
        public final void mo112013a(Effect effect, ExceptionResult exceptionResult) {
            String str;
            C89219l.m154721d(exceptionResult, "");
            if (effect != null) {
                str = effect.getEffectId();
            } else {
                str = null;
            }
            if (TextUtils.equals(str, this.f158620b.getEffectId())) {
                C1731i.m5640b(new CallableC70849a(this), C1731i.f5564c);
            }
        }

        C70848b(C70845d dVar, Effect effect, int i) {
            this.f158619a = dVar;
            this.f158620b = effect;
            this.f158621c = i;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.d$a */
    public static final class C70847a implements AbstractC56659a {

        /* renamed from: a */
        final /* synthetic */ AudioEffectParam f158618a;

        static {
            Covode.recordClassIndex(83338);
        }

        C70847a(AudioEffectParam audioEffectParam) {
            this.f158618a = audioEffectParam;
        }

        @Override // com.p2082ss.android.ugc.aweme.infoSticker.AbstractC56659a
        /* renamed from: a */
        public final void mo93541a(AVChallenge aVChallenge) {
            this.f158618a.setChallenge(aVChallenge);
        }
    }

    /* renamed from: a */
    public static String m125113a(Effect effect) {
        String effectId;
        if (effect == null || (effectId = effect.getEffectId()) == null) {
            return "";
        }
        return effectId;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        C89219l.m154721d(recyclerView, "");
        super.onAttachedToRecyclerView(recyclerView);
        this.f158612h = recyclerView;
    }

    /* renamed from: a */
    public final void mo112014a(int i) {
        mo112019b(i);
        this.f158616l.mo114801a(C88288n.C88289a.m153423a());
        C70835b.m125100a(this.f158609e);
    }

    /* renamed from: b */
    public final void mo112019b(int i) {
        RecyclerView.ViewHolder viewHolder;
        int itemCount = getItemCount();
        int i2 = this.f158610f;
        RecyclerView.ViewHolder viewHolder2 = null;
        if (i2 >= 0 && itemCount > i2) {
            RecyclerView recyclerView = this.f158612h;
            if (recyclerView != null) {
                viewHolder = recyclerView.mo4451f(i2);
            } else {
                viewHolder = null;
            }
            if (viewHolder instanceof C70851e) {
                ((C70851e) viewHolder).mo112023a(false);
            } else {
                notifyItemChanged(this.f158610f);
            }
        }
        this.f158610f = i;
        if (i < getItemCount()) {
            RecyclerView recyclerView2 = this.f158612h;
            if (recyclerView2 != null) {
                viewHolder2 = recyclerView2.mo4451f(this.f158610f);
            }
            if (viewHolder2 instanceof C70851e) {
                ((C70851e) viewHolder2).mo112023a(true);
            }
        }
    }

    /* renamed from: a */
    public final void mo112015a(int i, int i2) {
        RecyclerView.ViewHolder viewHolder;
        int itemCount = getItemCount();
        if (i >= 0 && itemCount > i) {
            RecyclerView recyclerView = this.f158612h;
            if (recyclerView != null) {
                viewHolder = recyclerView.mo4451f(i);
            } else {
                viewHolder = null;
            }
            if (viewHolder instanceof C70851e) {
                ((C70851e) viewHolder).mo112022a(i2);
            } else {
                notifyItemChanged(i);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.audioeffect.C70851e.AbstractC70854b
    /* renamed from: a */
    public final void mo112016a(View view, int i) {
        C89219l.m154721d(view, "");
        C70851e.AbstractC70854b bVar = this.f158613i;
        if (bVar != null) {
            bVar.mo112016a(view, i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        Effect effect;
        List<String> urlList;
        int i2;
        Context context;
        Resources resources;
        Context context2;
        Resources resources2;
        String str;
        Context context3;
        C89219l.m154721d(viewHolder, "");
        if (viewHolder instanceof C70851e) {
            Drawable drawable = null;
            if (i > 0) {
                List<? extends Effect> list = this.f158611g;
                if (list == null) {
                    C89219l.m154715b();
                }
                effect = (Effect) list.get(i - 1);
            } else {
                effect = null;
            }
            C70851e eVar = (C70851e) viewHolder;
            boolean z = true;
            if (eVar.mo112024a()) {
                AVDmtImageTextView aVDmtImageTextView = eVar.f158627b;
                if (aVDmtImageTextView != null) {
                    AVDmtImageTextView aVDmtImageTextView2 = eVar.f158627b;
                    if (aVDmtImageTextView2 == null || (context3 = aVDmtImageTextView2.getContext()) == null) {
                        str = null;
                    } else {
                        str = context3.getString(R.string.dgz);
                    }
                    aVDmtImageTextView.setText(str);
                }
                AVDmtImageTextView aVDmtImageTextView3 = eVar.f158627b;
                if (aVDmtImageTextView3 != null) {
                    AVDmtImageTextView aVDmtImageTextView4 = eVar.f158627b;
                    if (!(aVDmtImageTextView4 == null || (context2 = aVDmtImageTextView4.getContext()) == null || (resources2 = context2.getResources()) == null)) {
                        drawable = resources2.getDrawable(2131232504);
                    }
                    aVDmtImageTextView3.mo121336a(drawable);
                }
                ImageView imageView = eVar.f158626a;
                if (imageView != null) {
                    imageView.setVisibility(8);
                }
                eVar.mo112023a(false);
                eVar.mo112022a(1);
            } else if (effect != null) {
                AVDmtImageTextView aVDmtImageTextView5 = eVar.f158627b;
                if (aVDmtImageTextView5 != null) {
                    aVDmtImageTextView5.setText(effect.getName());
                }
                UrlModel iconUrl = effect.getIconUrl();
                if (!(iconUrl == null || (urlList = iconUrl.getUrlList()) == null || urlList.isEmpty())) {
                    if (C70825a.m125085a(effect)) {
                        if (urlList == null) {
                            C89219l.m154715b();
                        }
                        Integer e = C89361p.m154863e(urlList.get(0));
                        if (e != null) {
                            i2 = e.intValue();
                        } else {
                            i2 = 0;
                        }
                        AVDmtImageTextView aVDmtImageTextView6 = eVar.f158627b;
                        if (aVDmtImageTextView6 != null) {
                            AVDmtImageTextView aVDmtImageTextView7 = eVar.f158627b;
                            if (!(aVDmtImageTextView7 == null || (context = aVDmtImageTextView7.getContext()) == null || (resources = context.getResources()) == null)) {
                                drawable = resources.getDrawable(i2);
                            }
                            aVDmtImageTextView6.mo121336a(drawable);
                        }
                    } else {
                        AVDmtImageTextView aVDmtImageTextView8 = eVar.f158627b;
                        if (aVDmtImageTextView8 != null) {
                            if (urlList == null) {
                                C89219l.m154715b();
                            }
                            aVDmtImageTextView8.mo121338a(urlList.get(0));
                        }
                    }
                }
                eVar.mo112023a(false);
                C70837c.C70838a.m125105a();
                eVar.mo112022a(C70837c.m125103a(effect) ? 1 : 0);
            }
            if (i != this.f158610f) {
                z = false;
            }
            eVar.mo112023a(z);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00a4, code lost:
        if (android.text.TextUtils.equals(r1, r0) != false) goto L_0x00a6;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo112017a(com.p2082ss.android.ugc.effectmanager.effect.model.CategoryPageModel r10, boolean r11) {
        /*
        // Method dump skipped, instructions count: 226
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.shortvideo.edit.audioeffect.C70845d.mo112017a(com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel, boolean):void");
    }

    /* renamed from: a */
    private static RecyclerView.ViewHolder m125112a(C70845d dVar, ViewGroup viewGroup, int i) {
        boolean a;
        MethodCollector.m26663i(11572);
        C89219l.m154721d(viewGroup, "");
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        C89219l.m154716b(from, "");
        C89219l.m154721d(from, "");
        C89219l.m154721d(viewGroup, "");
        View a2 = C1764a.m5927a(from, R.layout.dr, viewGroup, false);
        if (a2 != null) {
            C70851e eVar = new C70851e((FrameLayout) a2, dVar);
            try {
                if (eVar.itemView.getParent() != null) {
                    try {
                        a = SettingsManager.m29616a().mo25400a("catch_onCreateViewHolder_crash", true);
                    } catch (Exception unused) {
                    }
                    if (a) {
                        StringBuffer stringBuffer = new StringBuffer();
                        stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(eVar.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i);
                        C22708a.m42800a(stringBuffer.toString());
                        ViewGroup viewGroup2 = (ViewGroup) eVar.itemView.getParent();
                        if (viewGroup2 != null) {
                            viewGroup2.removeView(eVar.itemView);
                        }
                    }
                }
            } catch (Exception e) {
                C63423ai.m115002a(e);
                C51423a.m95786a(e);
            }
            C80493gg.f180088a = eVar.getClass().getName();
            MethodCollector.m26664o(11572);
            return eVar;
        }
        NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout");
        MethodCollector.m26664o(11572);
        throw nullPointerException;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0089  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo112018a(com.p2082ss.android.ugc.effectmanager.effect.model.Effect r15, java.lang.String r16, java.lang.String r17, java.lang.String r18) {
        /*
        // Method dump skipped, instructions count: 155
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.shortvideo.edit.audioeffect.C70845d.mo112018a(com.ss.android.ugc.effectmanager.effect.model.Effect, java.lang.String, java.lang.String, java.lang.String):void");
    }

    public C70845d(ActivityC0218d dVar, AbstractC31071f fVar, VideoPublishEditModel videoPublishEditModel, AudioEffectParam audioEffectParam, AbstractC72510a aVar) {
        C89219l.m154721d(dVar, "");
        C89219l.m154721d(aVar, "");
        this.f158608d = dVar;
        this.f158614j = fVar;
        this.f158609e = videoPublishEditModel;
        this.f158615k = audioEffectParam;
        this.f158616l = aVar;
    }
}
