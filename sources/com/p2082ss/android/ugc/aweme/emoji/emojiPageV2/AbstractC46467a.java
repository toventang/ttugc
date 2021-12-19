package com.p2082ss.android.ugc.aweme.emoji.emojiPageV2;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.AbstractC1204m;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.C34577e;
import com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39060f;
import com.p2082ss.android.ugc.aweme.emoji.emojichoose.AbstractC46519p;
import com.p2082ss.android.ugc.aweme.emoji.p2897b.C46447a;
import com.p2082ss.android.ugc.aweme.emoji.p2899d.p2900a.C46459a;
import com.p2082ss.android.ugc.aweme.emoji.p2904g.C46534a;
import com.p2082ss.android.ugc.aweme.emoji.sysemoji.C46605i;
import com.p2082ss.android.ugc.aweme.emoji.utils.C46641c;
import com.p2082ss.android.ugc.aweme.emoji.utils.C46646h;
import com.p2082ss.android.ugc.trill.R;
import java.io.File;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.emoji.emojiPageV2.a */
public abstract class AbstractC46467a<T> extends AbstractC39060f<T> {

    /* renamed from: a */
    public final int f108248a = 7;

    /* renamed from: b */
    public final int f108249b = 4;

    /* renamed from: c */
    public final int f108250c = 3;

    /* renamed from: d */
    public final Context f108251d;

    /* renamed from: e */
    public AbstractC46519p f108252e;

    /* renamed from: f */
    public AbstractC46468a f108253f;

    /* renamed from: com.ss.android.ugc.aweme.emoji.emojiPageV2.a$a */
    public interface AbstractC46468a {
        static {
            Covode.recordClassIndex(55053);
        }
    }

    static {
        Covode.recordClassIndex(55052);
    }

    /* renamed from: a */
    public abstract void mo78990a(RecyclerView recyclerView);

    /* renamed from: a */
    public abstract void mo78991a(AbstractC46467a<T>.C46469b bVar, int i);

    /* renamed from: m */
    public abstract int mo78993m();

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l, androidx.recyclerview.widget.RecyclerView.AbstractC1350a, com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h
    public int getItemCount() {
        if (this.f92274v) {
            return mo60933c() + 1;
        }
        return mo60933c();
    }

    /* renamed from: l */
    public final AbstractC46519p mo78992l() {
        AbstractC46519p pVar = this.f108252e;
        if (pVar == null) {
            C89219l.m154710a("inputViewBridge");
        }
        return pVar;
    }

    public AbstractC46467a(AbstractC1204m mVar) {
        C89219l.m154721d(mVar, "");
        this.f108251d = (Context) mVar;
        this.f92274v = false;
    }

    /* renamed from: com.ss.android.ugc.aweme.emoji.emojiPageV2.a$c */
    static final class View$OnClickListenerC46470c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AbstractC46467a f108257a;

        /* renamed from: b */
        final /* synthetic */ int f108258b;

        static {
            Covode.recordClassIndex(55055);
        }

        View$OnClickListenerC46470c(AbstractC46467a aVar, int i) {
            this.f108257a = aVar;
            this.f108258b = i;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            T t = this.f108257a.mo63369e().get(this.f108258b);
            Objects.requireNonNull(t, "null cannot be cast to non-null type com.ss.android.ugc.aweme.emoji.base.BaseEmoji");
            T t2 = t;
            if (t2.f108221a == 2131231980) {
                this.f108257a.mo78992l().mo79018b();
            } else if (t2.f108221a == 2131231989) {
                this.f108257a.mo78992l().mo79019c();
            } else if (t2.f108221a == R.drawable.a7g) {
                this.f108257a.mo78992l().mo79015a();
            } else {
                String str = "";
                if (t2.mo78961a()) {
                    if (t2.f108224d instanceof C46605i) {
                        AbstractC46519p l = this.f108257a.mo78992l();
                        C46534a aVar = t2.f108224d;
                        Objects.requireNonNull(aVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.emoji.sysemoji.ImSysEmojiModel");
                        String previewEmoji = ((C46605i) aVar).getPreviewEmoji();
                        if (previewEmoji != null) {
                            str = previewEmoji;
                        }
                        l.mo79017a(str);
                        return;
                    }
                    View findViewById = view.findViewById(R.id.aua);
                    AbstractC46519p l2 = this.f108257a.mo78992l();
                    C89219l.m154716b(findViewById, str);
                    l2.mo79016a(findViewById, t2, 1);
                    if (this.f108257a.f108253f != null) {
                    }
                } else if (!TextUtils.isEmpty(t2.f108223c)) {
                    AbstractC46519p l3 = this.f108257a.mo78992l();
                    String str2 = t2.f108223c;
                    C89219l.m154716b(str2, str);
                    l3.mo79017a(str2);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.emoji.emojiPageV2.a$b */
    public class C46469b extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public final RemoteImageView f108254a;

        /* renamed from: b */
        public final TextView f108255b;

        /* renamed from: c */
        final /* synthetic */ AbstractC46467a f108256c;

        static {
            Covode.recordClassIndex(55054);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C46469b(AbstractC46467a aVar, View view) {
            super(view);
            C89219l.m154721d(view, "");
            this.f108256c = aVar;
            this.f108254a = (RemoteImageView) view.findViewById(R.id.aua);
            this.f108255b = (TextView) view.findViewById(R.id.title_tv);
        }
    }

    /* renamed from: b */
    public static void m89710b(RemoteImageView remoteImageView, C46447a aVar) {
        C89219l.m154721d(remoteImageView, "");
        C89219l.m154721d(aVar, "");
        File file = new File(C46641c.m90023a(), C46641c.m90027c(aVar.f108224d));
        if (file.exists()) {
            C46534a aVar2 = aVar.f108224d;
            C89219l.m154716b(aVar2, "");
            boolean d = C46459a.m89693d(aVar2);
            String absolutePath = file.getAbsolutePath();
            C89219l.m154716b(absolutePath, "");
            m89709a(remoteImageView, absolutePath, d);
            return;
        }
        m89708a(remoteImageView, aVar);
    }

    /* renamed from: a */
    public static void m89708a(RemoteImageView remoteImageView, C46447a aVar) {
        C89219l.m154721d(remoteImageView, "");
        C89219l.m154721d(aVar, "");
        C46534a aVar2 = aVar.f108224d;
        C89219l.m154716b(aVar2, "");
        if (C46459a.m89693d(aVar2)) {
            C46646h.m90043a(remoteImageView, aVar2.getStaticUrl(), null);
        } else {
            C34577e.m70592a(remoteImageView, aVar2.getStaticUrl());
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l
    /* renamed from: a */
    public RecyclerView.ViewHolder mo60184a(ViewGroup viewGroup, int i) {
        View a = C1764a.m5927a(LayoutInflater.from(this.f108251d), mo78993m(), viewGroup, false);
        C89219l.m154716b(a, "");
        return new C46469b(this, a);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l
    /* renamed from: a */
    public final void mo60186a(RecyclerView.ViewHolder viewHolder, int i) {
        View view;
        mo78991a((AbstractC46467a<T>.C46469b) ((C46469b) viewHolder), i);
        if (viewHolder != null && (view = viewHolder.itemView) != null) {
            view.setOnClickListener(new View$OnClickListenerC46470c(this, i));
        }
    }

    /* renamed from: a */
    public static void m89709a(RemoteImageView remoteImageView, String str, boolean z) {
        C89219l.m154721d(remoteImageView, "");
        C89219l.m154721d(str, "");
        String concat = "file://".concat(String.valueOf(str));
        if (z) {
            C46646h.m90044a(remoteImageView, concat);
        } else {
            C34577e.m70608b(remoteImageView, concat, -1, -1);
        }
    }

    /* renamed from: a */
    public static void m89707a(RemoteImageView remoteImageView, Context context, int i) {
        C89219l.m154721d(remoteImageView, "");
        C89219l.m154721d(context, "");
        C34577e.m70608b(remoteImageView, "res://" + context.getPackageName() + "/" + i, -1, -1);
    }

    /* renamed from: a */
    public final int mo78989a(int i, int i2, int i3) {
        double a = (double) C13628n.m24504a(this.f108251d);
        double d = (double) i2;
        Double.isNaN(d);
        Double.isNaN(a);
        double d2 = (double) i3;
        Double.isNaN(d2);
        double d3 = ((a - (d * 2.0d)) * 1.0d) / d2;
        double d4 = (double) i;
        Double.isNaN(d4);
        return (int) (d3 - d4);
    }
}
