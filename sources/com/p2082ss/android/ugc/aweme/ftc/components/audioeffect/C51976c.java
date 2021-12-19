package com.p2082ss.android.ugc.aweme.ftc.components.audioeffect;

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
import com.p2082ss.android.ugc.aweme.ftc.components.audioeffect.C51970b;
import com.p2082ss.android.ugc.aweme.ftc.components.audioeffect.C51981d;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.audioeffect.AbstractC70878m;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioEffectParam;
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

/* renamed from: com.ss.android.ugc.aweme.ftc.components.audioeffect.c */
public final class C51976c extends RecyclerView.AbstractC1350a<RecyclerView.ViewHolder> implements C51981d.AbstractC51984b {

    /* renamed from: a */
    public boolean f119726a;

    /* renamed from: b */
    public CategoryPageModel f119727b;

    /* renamed from: c */
    public AbstractC70878m f119728c;

    /* renamed from: d */
    public final ActivityC0218d f119729d;

    /* renamed from: e */
    final VideoPublishEditModel f119730e;

    /* renamed from: f */
    private int f119731f;

    /* renamed from: g */
    private List<? extends Effect> f119732g;

    /* renamed from: h */
    private RecyclerView f119733h;

    /* renamed from: i */
    private C51981d.AbstractC51984b f119734i = new C51981d.AbstractC51984b(this) {
        /* class com.p2082ss.android.ugc.aweme.ftc.components.audioeffect.C51976c.C519771 */

        /* renamed from: a */
        final /* synthetic */ C51976c f119738a;

        static {
            Covode.recordClassIndex(61349);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        {
            this.f119738a = r1;
        }

        @Override // com.p2082ss.android.ugc.aweme.ftc.components.audioeffect.C51981d.AbstractC51984b
        /* renamed from: a */
        public final void mo87703a(View view, int i) {
            CategoryPageModel categoryPageModel;
            CategoryEffectModel categoryEffects;
            List<Effect> effects;
            Effect effect;
            String str;
            C89219l.m154721d(view, "");
            if (-1 != i) {
                this.f119738a.f119726a = true;
                if (i == 0) {
                    this.f119738a.mo87701a(i);
                    return;
                }
                C51976c cVar = this.f119738a;
                if (i > 0 && (categoryPageModel = cVar.f119727b) != null && (categoryEffects = categoryPageModel.getCategoryEffects()) != null && (effects = categoryEffects.getEffects()) != null && (effect = effects.get(i - 1)) != null) {
                    C84425b a = new C84425b().mo129406a("effect_name", effect.getName()).mo129406a("effect_id", effect.getEffectId());
                    VideoPublishEditModel videoPublishEditModel = cVar.f119730e;
                    if (videoPublishEditModel == null || (str = videoPublishEditModel.creationId) == null) {
                        str = "";
                    }
                    C39162r.m79460a("select_voice_effect", a.mo129406a("creation_id", str).f188764a);
                    String unzipPath = effect.getUnzipPath();
                    if (unzipPath == null) {
                        unzipPath = "";
                    }
                    C51970b.C51971a.m96696a();
                    if (C51970b.m96695a(effect)) {
                        cVar.mo87705a(C51976c.m96702a(effect), C51969a.m96694b(effect), unzipPath);
                        cVar.mo87706b(i);
                        AbstractC70878m mVar = cVar.f119728c;
                        if (mVar != null) {
                            mVar.mo87716a(effect);
                            return;
                        }
                        return;
                    }
                    cVar.mo87702a(i, 2);
                    C51970b.C51971a.m96696a();
                    C51978a aVar = new C51978a(cVar, effect, i);
                    C89219l.m154721d(effect, "");
                    AbstractC46415f b = C51970b.C51971a.m96697b();
                    if (b != null) {
                        b.mo78887a(effect, C46435t.m89598a(new C51970b.C51975e(aVar), "effect"));
                    }
                }
            }
        }
    };

    /* renamed from: j */
    private final AbstractC31071f f119735j;

    /* renamed from: k */
    private final AudioEffectParam f119736k;

    /* renamed from: l */
    private final AbstractC72510a f119737l;

    static {
        Covode.recordClassIndex(61348);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m96701a(this, viewGroup, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemCount() {
        int i;
        CategoryEffectModel categoryEffects;
        List<Effect> effects;
        CategoryPageModel categoryPageModel = this.f119727b;
        if (categoryPageModel == null || (categoryEffects = categoryPageModel.getCategoryEffects()) == null || (effects = categoryEffects.getEffects()) == null) {
            i = 0;
        } else {
            i = effects.size();
        }
        return i + 1;
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.audioeffect.c$a */
    public static final class C51978a implements C51970b.AbstractC51974d {

        /* renamed from: a */
        final /* synthetic */ C51976c f119739a;

        /* renamed from: b */
        final /* synthetic */ Effect f119740b;

        /* renamed from: c */
        final /* synthetic */ int f119741c;

        static {
            Covode.recordClassIndex(61350);
        }

        /* renamed from: com.ss.android.ugc.aweme.ftc.components.audioeffect.c$a$a */
        static final class CallableC51979a<V> implements Callable {

            /* renamed from: a */
            final /* synthetic */ C51978a f119742a;

            static {
                Covode.recordClassIndex(61351);
            }

            CallableC51979a(C51978a aVar) {
                this.f119742a = aVar;
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                new C79459a(this.f119742a.f119739a.f119729d).mo123050a(R.string.z7).mo123053a();
                this.f119742a.f119739a.mo87702a(this.f119742a.f119741c, 3);
                return C89391z.f203057a;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.ftc.components.audioeffect.c$a$b */
        static final class CallableC51980b<V> implements Callable {

            /* renamed from: a */
            final /* synthetic */ C51978a f119743a;

            /* renamed from: b */
            final /* synthetic */ Effect f119744b;

            static {
                Covode.recordClassIndex(61352);
            }

            CallableC51980b(C51978a aVar, Effect effect) {
                this.f119743a = aVar;
                this.f119744b = effect;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                CategoryPageModel categoryPageModel;
                CategoryEffectModel categoryEffects;
                if (!(this.f119744b == null || (categoryPageModel = this.f119743a.f119739a.f119727b) == null || (categoryEffects = categoryPageModel.getCategoryEffects()) == null)) {
                    List<? extends Effect> g = C89070n.m154585g((Collection) categoryEffects.getEffects());
                    g.set(this.f119743a.f119741c - 1, this.f119744b);
                    categoryEffects.setEffects(g);
                }
                this.f119743a.f119739a.mo87702a(this.f119743a.f119741c, 1);
                this.f119743a.f119739a.mo87706b(this.f119743a.f119741c);
                AbstractC70878m mVar = this.f119743a.f119739a.f119728c;
                if (mVar == null) {
                    return null;
                }
                mVar.mo87716a(this.f119743a.f119740b);
                return C89391z.f203057a;
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.ftc.components.audioeffect.C51970b.AbstractC51974d
        /* renamed from: a */
        public final void mo87699a(Effect effect) {
            String str;
            String str2;
            String str3 = null;
            if (effect != null) {
                str = effect.getEffectId();
            } else {
                str = null;
            }
            if (TextUtils.equals(str, this.f119740b.getEffectId())) {
                C1731i.m5640b(new CallableC51980b(this, effect), C1731i.f5564c);
                C51976c cVar = this.f119739a;
                String a = C51976c.m96702a(effect);
                if (effect != null) {
                    str2 = C51969a.m96694b(effect);
                    str3 = effect.getUnzipPath();
                } else {
                    str2 = null;
                }
                cVar.mo87705a(a, str2, str3);
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.ftc.components.audioeffect.C51970b.AbstractC51974d
        /* renamed from: a */
        public final void mo87700a(Effect effect, ExceptionResult exceptionResult) {
            String str;
            C89219l.m154721d(exceptionResult, "");
            if (effect != null) {
                str = effect.getEffectId();
            } else {
                str = null;
            }
            if (TextUtils.equals(str, this.f119740b.getEffectId())) {
                C1731i.m5640b(new CallableC51979a(this), C1731i.f5564c);
            }
        }

        C51978a(C51976c cVar, Effect effect, int i) {
            this.f119739a = cVar;
            this.f119740b = effect;
            this.f119741c = i;
        }
    }

    /* renamed from: a */
    public static String m96702a(Effect effect) {
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
        this.f119733h = recyclerView;
    }

    /* renamed from: a */
    public final void mo87701a(int i) {
        mo87706b(i);
        this.f119737l.mo114801a(C88288n.C88289a.m153423a());
    }

    /* renamed from: b */
    public final void mo87706b(int i) {
        RecyclerView.ViewHolder viewHolder;
        int itemCount = getItemCount();
        int i2 = this.f119731f;
        RecyclerView.ViewHolder viewHolder2 = null;
        if (i2 >= 0 && itemCount > i2) {
            RecyclerView recyclerView = this.f119733h;
            if (recyclerView != null) {
                viewHolder = recyclerView.mo4451f(i2);
            } else {
                viewHolder = null;
            }
            if (viewHolder instanceof C51981d) {
                ((C51981d) viewHolder).mo87710a(false);
            } else {
                notifyItemChanged(this.f119731f);
            }
        }
        this.f119731f = i;
        if (i < getItemCount()) {
            RecyclerView recyclerView2 = this.f119733h;
            if (recyclerView2 != null) {
                viewHolder2 = recyclerView2.mo4451f(this.f119731f);
            }
            if (viewHolder2 instanceof C51981d) {
                ((C51981d) viewHolder2).mo87710a(true);
            }
        }
    }

    /* renamed from: a */
    public final void mo87702a(int i, int i2) {
        RecyclerView.ViewHolder viewHolder;
        int itemCount = getItemCount();
        if (i >= 0 && itemCount > i) {
            RecyclerView recyclerView = this.f119733h;
            if (recyclerView != null) {
                viewHolder = recyclerView.mo4451f(i);
            } else {
                viewHolder = null;
            }
            if (viewHolder instanceof C51981d) {
                ((C51981d) viewHolder).mo87709a(i2);
            } else {
                notifyItemChanged(i);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.ftc.components.audioeffect.C51981d.AbstractC51984b
    /* renamed from: a */
    public final void mo87703a(View view, int i) {
        C89219l.m154721d(view, "");
        C51981d.AbstractC51984b bVar = this.f119734i;
        if (bVar != null) {
            bVar.mo87703a(view, i);
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
        if (viewHolder instanceof C51981d) {
            Drawable drawable = null;
            if (i > 0) {
                List<? extends Effect> list = this.f119732g;
                if (list == null) {
                    C89219l.m154715b();
                }
                effect = (Effect) list.get(i - 1);
            } else {
                effect = null;
            }
            C51981d dVar = (C51981d) viewHolder;
            boolean z = true;
            if (dVar.mo87711a()) {
                AVDmtImageTextView aVDmtImageTextView = dVar.f119747b;
                if (aVDmtImageTextView != null) {
                    AVDmtImageTextView aVDmtImageTextView2 = dVar.f119747b;
                    if (aVDmtImageTextView2 == null || (context3 = aVDmtImageTextView2.getContext()) == null) {
                        str = null;
                    } else {
                        str = context3.getString(R.string.dgz);
                    }
                    aVDmtImageTextView.setText(str);
                }
                AVDmtImageTextView aVDmtImageTextView3 = dVar.f119747b;
                if (aVDmtImageTextView3 != null) {
                    AVDmtImageTextView aVDmtImageTextView4 = dVar.f119747b;
                    if (!(aVDmtImageTextView4 == null || (context2 = aVDmtImageTextView4.getContext()) == null || (resources2 = context2.getResources()) == null)) {
                        drawable = resources2.getDrawable(2131232504);
                    }
                    aVDmtImageTextView3.mo121336a(drawable);
                }
                ImageView imageView = dVar.f119746a;
                if (imageView != null) {
                    imageView.setVisibility(8);
                }
                dVar.mo87710a(false);
                dVar.mo87709a(1);
            } else if (effect != null) {
                AVDmtImageTextView aVDmtImageTextView5 = dVar.f119747b;
                if (aVDmtImageTextView5 != null) {
                    aVDmtImageTextView5.setText(effect.getName());
                }
                UrlModel iconUrl = effect.getIconUrl();
                if (!(iconUrl == null || (urlList = iconUrl.getUrlList()) == null || urlList.isEmpty())) {
                    if (C51969a.m96692a(effect)) {
                        if (urlList == null) {
                            C89219l.m154715b();
                        }
                        Integer e = C89361p.m154863e(urlList.get(0));
                        if (e != null) {
                            i2 = e.intValue();
                        } else {
                            i2 = 0;
                        }
                        AVDmtImageTextView aVDmtImageTextView6 = dVar.f119747b;
                        if (aVDmtImageTextView6 != null) {
                            AVDmtImageTextView aVDmtImageTextView7 = dVar.f119747b;
                            if (!(aVDmtImageTextView7 == null || (context = aVDmtImageTextView7.getContext()) == null || (resources = context.getResources()) == null)) {
                                drawable = resources.getDrawable(i2);
                            }
                            aVDmtImageTextView6.mo121336a(drawable);
                        }
                    } else {
                        AVDmtImageTextView aVDmtImageTextView8 = dVar.f119747b;
                        if (aVDmtImageTextView8 != null) {
                            if (urlList == null) {
                                C89219l.m154715b();
                            }
                            aVDmtImageTextView8.mo121338a(urlList.get(0));
                        }
                    }
                }
                dVar.mo87710a(false);
                C51970b.C51971a.m96696a();
                dVar.mo87709a(C51970b.m96695a(effect) ? 1 : 0);
            }
            if (i != this.f119731f) {
                z = false;
            }
            dVar.mo87710a(z);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00a4, code lost:
        if (android.text.TextUtils.equals(r1, r0) != false) goto L_0x00a6;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo87704a(com.p2082ss.android.ugc.effectmanager.effect.model.CategoryPageModel r10, boolean r11) {
        /*
        // Method dump skipped, instructions count: 226
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ftc.components.audioeffect.C51976c.mo87704a(com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel, boolean):void");
    }

    /* renamed from: a */
    private static RecyclerView.ViewHolder m96701a(C51976c cVar, ViewGroup viewGroup, int i) {
        boolean a;
        MethodCollector.m26663i(11555);
        C89219l.m154721d(viewGroup, "");
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        C89219l.m154716b(from, "");
        C89219l.m154721d(from, "");
        C89219l.m154721d(viewGroup, "");
        View a2 = C1764a.m5927a(from, R.layout.dr, viewGroup, false);
        if (a2 != null) {
            C51981d dVar = new C51981d((FrameLayout) a2, cVar);
            try {
                if (dVar.itemView.getParent() != null) {
                    try {
                        a = SettingsManager.m29616a().mo25400a("catch_onCreateViewHolder_crash", true);
                    } catch (Exception unused) {
                    }
                    if (a) {
                        StringBuffer stringBuffer = new StringBuffer();
                        stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(dVar.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i);
                        C22708a.m42800a(stringBuffer.toString());
                        ViewGroup viewGroup2 = (ViewGroup) dVar.itemView.getParent();
                        if (viewGroup2 != null) {
                            viewGroup2.removeView(dVar.itemView);
                        }
                    }
                }
            } catch (Exception e) {
                C63423ai.m115002a(e);
                C51423a.m95786a(e);
            }
            C80493gg.f180088a = dVar.getClass().getName();
            MethodCollector.m26664o(11555);
            return dVar;
        }
        NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout");
        MethodCollector.m26664o(11555);
        throw nullPointerException;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0070  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo87705a(java.lang.String r14, java.lang.String r15, java.lang.String r16) {
        /*
        // Method dump skipped, instructions count: 134
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ftc.components.audioeffect.C51976c.mo87705a(java.lang.String, java.lang.String, java.lang.String):void");
    }

    public C51976c(ActivityC0218d dVar, AbstractC31071f fVar, VideoPublishEditModel videoPublishEditModel, AudioEffectParam audioEffectParam, AbstractC72510a aVar) {
        C89219l.m154721d(dVar, "");
        C89219l.m154721d(aVar, "");
        this.f119729d = dVar;
        this.f119735j = fVar;
        this.f119730e = videoPublishEditModel;
        this.f119736k = audioEffectParam;
        this.f119737l = aVar;
    }
}
