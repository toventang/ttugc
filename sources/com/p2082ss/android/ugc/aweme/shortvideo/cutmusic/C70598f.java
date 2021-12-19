package com.p2082ss.android.ugc.aweme.shortvideo.cutmusic;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.analytics.p124a.View$OnAttachStateChangeListenerC2587f;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.services.apm.api.C22708a;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.shortvideo.C70625d;
import com.p2082ss.android.ugc.aweme.tools.C78099c;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cutmusic.f */
public final class C70598f extends RecyclerView {

    /* renamed from: O */
    public C70590a f158007O;

    /* renamed from: P */
    float f158008P;

    /* renamed from: Q */
    public AbstractC70599a f158009Q;

    /* renamed from: R */
    public boolean f158010R;

    /* renamed from: S */
    public boolean f158011S;

    /* renamed from: T */
    private RecyclerView.AbstractC1350a<?> f158012T;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cutmusic.f$a */
    public interface AbstractC70599a {
        static {
            Covode.recordClassIndex(83065);
        }

        /* renamed from: a */
        void mo87818a(float f);

        /* renamed from: b */
        void mo87819b(float f);
    }

    static {
        Covode.recordClassIndex(83064);
    }

    public final float getScrollDx() {
        return this.f158008P;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cutmusic.f$e */
    static final class RunnableC70603e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C70598f f158015a;

        /* renamed from: b */
        final /* synthetic */ float f158016b;

        static {
            Covode.recordClassIndex(83069);
        }

        RunnableC70603e(C70598f fVar, float f) {
            this.f158015a = fVar;
            this.f158016b = f;
        }

        public final void run() {
            this.f158015a.scrollBy((int) (((float) C70598f.m124720a(this.f158015a).getViewWidth()) * this.f158016b), 0);
        }
    }

    public final void setScrollDx(float f) {
        this.f158008P = f;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cutmusic.f$c */
    public static final class C70601c extends RecyclerView.AbstractC1350a<RecyclerView.ViewHolder> {

        /* renamed from: a */
        final /* synthetic */ C70598f f158013a;

        static {
            Covode.recordClassIndex(83067);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
        public final int getItemCount() {
            return 1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            C89219l.m154721d(viewHolder, "");
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            return m124723a(this, viewGroup, i);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C70601c(C70598f fVar) {
            this.f158013a = fVar;
        }

        /* renamed from: a */
        private static RecyclerView.ViewHolder m124723a(C70601c cVar, ViewGroup viewGroup, int i) {
            boolean a;
            MethodCollector.m26663i(5879);
            C89219l.m154721d(viewGroup, "");
            C70600b bVar = new C70600b(C70598f.m124720a(cVar.f158013a));
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
            MethodCollector.m26664o(5879);
            return bVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cutmusic.f$d */
    public static final class C70602d extends RecyclerView.AbstractC1371n {

        /* renamed from: a */
        final /* synthetic */ C70598f f158014a;

        static {
            Covode.recordClassIndex(83068);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C70602d(C70598f fVar) {
            this.f158014a = fVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n
        /* renamed from: a */
        public final void mo4753a(RecyclerView recyclerView, int i) {
            C89219l.m154721d(recyclerView, "");
            if (i == 0 && this.f158014a.f158009Q != null && this.f158014a.f158010R) {
                AbstractC70599a aVar = this.f158014a.f158009Q;
                if (aVar == null) {
                    C89219l.m154715b();
                }
                aVar.mo87818a((this.f158014a.getScrollDx() * 1.0f) / ((float) C70598f.m124720a(this.f158014a).getMeasuredWidth()));
                this.f158014a.f158010R = false;
                this.f158014a.f158011S = false;
            }
            super.mo4753a(recyclerView, i);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n
        /* renamed from: a */
        public final void mo4754a(RecyclerView recyclerView, int i, int i2) {
            C89219l.m154721d(recyclerView, "");
            super.mo4754a(recyclerView, i, i2);
            C70598f fVar = this.f158014a;
            fVar.setScrollDx(fVar.getScrollDx() + ((float) i));
            if (this.f158014a.f158009Q != null && this.f158014a.f158011S) {
                float scrollDx = (this.f158014a.getScrollDx() * 1.0f) / ((float) C70598f.m124720a(this.f158014a).getMeasuredWidth());
                AbstractC70599a aVar = this.f158014a.f158009Q;
                if (aVar == null) {
                    C89219l.m154715b();
                }
                aVar.mo87819b(scrollDx);
            }
        }
    }

    public final void setScrollListener(AbstractC70599a aVar) {
        C89219l.m154721d(aVar, "");
        this.f158009Q = aVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cutmusic.f$b */
    public static final class C70600b extends RecyclerView.ViewHolder {
        static {
            Covode.recordClassIndex(83066);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C70600b(View view) {
            super(view);
            C89219l.m154721d(view, "");
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ C70590a m124720a(C70598f fVar) {
        C70590a aVar = fVar.f158007O;
        if (aVar == null) {
            C89219l.m154710a("cutMusicView");
        }
        return aVar;
    }

    public final void setProgressMaxWidth(int i) {
        C70590a aVar = this.f158007O;
        if (aVar == null) {
            C89219l.m154710a("cutMusicView");
        }
        aVar.setProgressMaxWidth(i);
    }

    public final void setWaveColor(int i) {
        C70590a aVar = this.f158007O;
        if (aVar == null) {
            C89219l.m154710a("cutMusicView");
        }
        aVar.setColor(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C89219l.m154721d(motionEvent, "");
        if (motionEvent.getAction() == 1) {
            this.f158010R = true;
        } else if (motionEvent.getAction() == 0) {
            this.f158011S = true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setAudioWaveViewData(C70625d dVar) {
        if (dVar != null) {
            C70590a aVar = this.f158007O;
            if (aVar == null) {
                C89219l.m154710a("cutMusicView");
            }
            aVar.setAudioWaveViewData(dVar);
            RecyclerView.AbstractC1350a<?> aVar2 = this.f158012T;
            if (aVar2 == null) {
                C89219l.m154710a("adatper");
            }
            setAdapter(aVar2);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C70598f(Context context) {
        super(context, null, 0);
        C89219l.m154721d(context, "");
        setClipToPadding(false);
        this.f158007O = new C70590a(context, (char) 0);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
        linearLayoutManager.mo4356b(0);
        linearLayoutManager.mo4357b(C78099c.m136517a(context));
        setLayoutManager(linearLayoutManager);
        setOverScrollMode(2);
        this.f158012T = new C70601c(this);
        mo4405a(new C70602d(this));
        addOnAttachStateChangeListener(new View$OnAttachStateChangeListenerC2587f());
    }

    public /* synthetic */ C70598f(Context context, byte b) {
        this(context);
    }
}
