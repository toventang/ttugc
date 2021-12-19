package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder;

import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.TextureView;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.p1399im.core.p1408d.C19538ai;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.experiment.C47039q;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.BaseContent;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.ShareAwemeContent;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.ShareStoryContent;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3080b.p3083c.C53660b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.p3136d.C54438a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder.p3138b.C54519a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.p3185c.C55198a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.data.api.C55257a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.p3193ui.widget.KeepSurfaceTextureView;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3263m.C56244a;
import com.p2082ss.android.ugc.aweme.story.C77260g;
import com.p2082ss.android.ugc.trill.R;
import kotlinx.coroutines.AbstractC89568bz;
import kotlinx.coroutines.C89546bf;
import kotlinx.coroutines.C89624i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.s */
public class C54565s extends AbstractC54482a<ShareAwemeContent> {

    /* renamed from: A */
    Animation f125062A = AnimationUtils.loadAnimation(this.itemView.getContext(), R.anim.c6);

    /* renamed from: B */
    long f125063B;

    /* renamed from: C */
    private RemoteImageView f125064C;

    /* renamed from: D */
    private TextView f125065D;

    /* renamed from: E */
    private ImageView f125066E;

    /* renamed from: F */
    private TextView f125067F;

    /* renamed from: G */
    private ImageView f125068G;

    /* renamed from: H */
    private KeepSurfaceTextureView f125069H;

    /* renamed from: I */
    private TuxTextView f125070I;

    /* renamed from: J */
    private ImageView f125071J;

    /* renamed from: K */
    private C19538ai f125072K;

    /* renamed from: L */
    private C54519a f125073L;

    /* renamed from: M */
    private AbstractC89172b<Boolean, C89391z> f125074M = new C54568t(this);

    /* renamed from: a */
    int f125075a = -1;

    /* renamed from: b */
    public TextView f125076b;

    /* renamed from: x */
    ImageView f125077x;

    /* renamed from: y */
    public Aweme f125078y;

    /* renamed from: z */
    public ShareAwemeContent f125079z;

    static {
        Covode.recordClassIndex(64276);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.s$a */
    static class TextureView$SurfaceTextureListenerC54567a implements TextureView.SurfaceTextureListener {
        static {
            Covode.recordClassIndex(64278);
        }

        public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        }

        public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            return false;
        }

        public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        }

        public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }

        private TextureView$SurfaceTextureListenerC54567a() {
        }

        /* synthetic */ TextureView$SurfaceTextureListenerC54567a(byte b) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder.AbstractC54482a
    public final void bJ_() {
        super.bJ_();
        this.f125069H.setSurfaceTextureListener(new TextureView$SurfaceTextureListenerC54567a((byte) 0));
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public String mo91651i() {
        return this.itemView.getContext().getString(R.string.h5j);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder.AbstractC54482a
    /* renamed from: a */
    public void mo91007a() {
        Drawable background;
        super.mo91007a();
        this.f125064C = (RemoteImageView) this.itemView.findViewById(R.id.ad1);
        this.f125076b = (TextView) this.itemView.findViewById(R.id.adk);
        this.f124819o = C54438a.C54439a.m99780a(this.itemView.findViewById(R.id.ade));
        this.f125065D = (TextView) this.itemView.findViewById(R.id.adh);
        this.f125066E = (ImageView) this.itemView.findViewById(R.id.adl);
        this.f125067F = (TextView) this.itemView.findViewById(R.id.ado);
        this.f125068G = (ImageView) this.itemView.findViewById(R.id.byh);
        this.f125069H = (KeepSurfaceTextureView) this.itemView.findViewById(R.id.fcz);
        this.f125077x = (ImageView) this.itemView.findViewById(R.id.ez7);
        this.f125071J = (ImageView) this.itemView.findViewById(R.id.d2n);
        this.f125073L = new C54519a(this.itemView);
        View findViewById = this.itemView.findViewById(R.id.zi);
        if (!(findViewById == null || (background = findViewById.getBackground()) == null)) {
            int i = Build.VERSION.SDK_INT;
            background.setAutoMirrored(true);
        }
        this.f125070I = (TuxTextView) this.itemView.findViewById(R.id.f4q);
    }

    /* renamed from: a */
    public final void mo91650a(boolean z) {
        if (!z) {
            this.f125074M.invoke(false);
        }
    }

    public C54565s(View view) {
        super(view);
        MethodCollector.m26663i(5759);
        MethodCollector.m26664o(5759);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder.AbstractC54482a
    /* renamed from: a */
    public void mo91564a(View.OnClickListener onClickListener) {
        super.mo91564a(onClickListener);
        this.f125064C.setOnClickListener(onClickListener);
        this.f125076b.setOnClickListener(onClickListener);
        this.f124819o.mo91506a(new View$OnClickListenerC54569u(this, onClickListener));
        this.f124824t.mo92194a(this.f125064C, this.f125076b);
    }

    /* renamed from: a */
    public void mo91008a(C19538ai aiVar, C19538ai aiVar2, final ShareAwemeContent shareAwemeContent, int i) {
        TextView textView;
        super.mo91008a(aiVar, aiVar2, (BaseContent) shareAwemeContent, i);
        int awemeType = shareAwemeContent.getAwemeType();
        this.f125079z = shareAwemeContent;
        this.f124820p = shareAwemeContent;
        this.f125075a = i;
        this.f125072K = aiVar;
        this.f125078y = null;
        C89219l.m154721d(aiVar, "");
        C89219l.m154721d(shareAwemeContent, "");
        if (awemeType == 0 || awemeType == 23 || awemeType == 40) {
            ImageView imageView = this.f125066E;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            if (awemeType == 23 && (textView = this.f125065D) != null) {
                textView.setVisibility(0);
            }
        } else {
            ImageView imageView2 = this.f125066E;
            if (imageView2 != null) {
                imageView2.setVisibility(0);
            }
        }
        if (!ShareStoryContent.isStory(shareAwemeContent) || !C77260g.f173332a.mo120146a()) {
            this.f125070I.setVisibility(8);
        } else if (((ShareStoryContent) shareAwemeContent).getSourceType().intValue() == 1) {
            this.f125070I.setText(mo91651i());
            this.f125070I.setVisibility(0);
        } else {
            this.f125070I.setVisibility(8);
        }
        this.f125068G.setVisibility(0);
        C53660b.m98935a(this.itemView, aiVar, shareAwemeContent, this.f125074M);
        C55198a.m100927a(this.f125064C, shareAwemeContent.getContentThumb());
        TextView textView2 = this.f125076b;
        C89219l.m154721d(aiVar, "");
        C89219l.m154721d(shareAwemeContent, "");
        String str = aiVar.getLocalExt().get("feed_ad_fake_nickname");
        if (str == null) {
            if (shareAwemeContent.getAuthorUsername() == null) {
                str = shareAwemeContent.getContentName();
            } else {
                str = shareAwemeContent.getAuthorUsername();
            }
        }
        textView2.setText(str);
        if (this.f125067F != null) {
            String title = shareAwemeContent.getTitle();
            if (!TextUtils.isEmpty(title)) {
                this.f125067F.setText(title);
                this.f125067F.setVisibility(0);
            } else {
                this.f125067F.setVisibility(8);
            }
        }
        if (awemeType == 40) {
            this.f124819o.mo91505a(50331648, 48);
        } else {
            this.f124819o.mo91505a(50331648, 2);
        }
        this.f124819o.mo91505a(67108864, shareAwemeContent.getItemId());
        this.f124819o.mo91505a(134217728, aiVar);
        this.f125064C.setTag(50331648, 4);
        this.f125064C.setTag(100663296, shareAwemeContent);
        this.f125076b.setTag(50331648, 4);
        this.f125076b.setTag(100663296, shareAwemeContent);
        this.f124825u.mo90246a(String.valueOf(this.f124823s.getSender()), this.f124823s.getSecSender());
        this.f125071J.setVisibility(8);
        if (this.f125079z != null && !C47039q.m90298a()) {
            C39162r.m79460a("client_show", new C33744d().mo59983a("enter_from", "chat").mo59983a("author_id", this.f125079z.getUser()).mo59983a("group_id", this.f125079z.getItemId()).mo59983a("content", "video").mo59983a("display", "card").mo59983a("is_auto_play", "0").f79943a);
        }
        this.f125069H.setVisibility(8);
        if (TextUtils.isEmpty(shareAwemeContent.getItemId())) {
            C56244a.m102185a("ShareAwemeReceiveAuto", "fetchPlayerData getItemId is emptytrue");
            mo91650a(true);
            return;
        }
        View view = this.itemView;
        C19538ai aiVar3 = this.f125072K;
        ShareAwemeContent shareAwemeContent2 = this.f125079z;
        C545661 r5 = new C55257a.AbstractC55258a() {
            /* class com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder.C54565s.C545661 */

            /* renamed from: a */
            final /* synthetic */ boolean f125080a = true;

            static {
                Covode.recordClassIndex(64277);
            }

            @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.common.data.api.C55257a.AbstractC55258a
            /* renamed from: a */
            public final void mo91652a() {
                C56244a.m102185a("ShareAwemeReceiveAuto", "query failed -1  isPreload " + "");
                C54565s.this.mo91650a(this.f125080a);
            }

            @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.common.data.api.C55257a.AbstractC55258a
            /* renamed from: a */
            public final void mo91653a(Object obj) {
                if (!(obj instanceof Aweme)) {
                    C56244a.m102185a("ShareAwemeReceiveAuto", "queryNotAweme " + this.f125080a);
                    C54565s.this.mo91650a(this.f125080a);
                    return;
                }
                C54565s.this.f125078y = (Aweme) obj;
                if (TextUtils.isEmpty(C54565s.this.f125078y.getAid()) || !TextUtils.equals(shareAwemeContent.getItemId(), C54565s.this.f125078y.getAid())) {
                    C56244a.m102185a("ShareAwemeReceiveAuto", "aid not match " + this.f125080a);
                    C54565s.this.mo91650a(this.f125080a);
                }
                if (!TextUtils.equals(shareAwemeContent.getItemId(), C54565s.this.f125079z.getItemId())) {
                    C56244a.m102185a("ShareAwemeReceiveAuto", "[autoplay] error itemId not match, isPreload: " + this.f125080a);
                } else if (C54565s.this.f125078y.getAuthor() != null && C54565s.this.f125078y.getAuthor().isAdFake() && !TextUtils.equals(C54565s.this.f125078y.getAuthor().getNickname(), C54565s.this.f125076b.toString())) {
                    shareAwemeContent.setAuthorUsername(C54565s.this.f125078y.getAuthor().getNickname());
                    C54565s.this.f125076b.setText(C54565s.this.f125078y.getAuthor().getNickname());
                }
            }
        };
        C89219l.m154721d(view, "");
        C89219l.m154721d(aiVar3, "");
        C89219l.m154721d(shareAwemeContent2, "");
        C89219l.m154721d(r5, "");
        if (C53660b.m98945a(aiVar3)) {
            return;
        }
        if (!ShareStoryContent.Companion.isStory(shareAwemeContent2) || C77260g.f173332a.mo120146a()) {
            AbstractC89568bz unused = C89624i.m155555a(C53660b.f123123d, C89546bf.f203267b, null, new C53660b.C53668f(shareAwemeContent2, r5, view, aiVar3, null), 2);
        }
    }
}
