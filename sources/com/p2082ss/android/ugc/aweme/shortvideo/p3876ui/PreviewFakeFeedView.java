package com.p2082ss.android.ugc.aweme.shortvideo.p3876ui;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.C0643b;
import androidx.lifecycle.AbstractC1204m;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.lighten.p1477a.C20761r;
import com.bytedance.lighten.p1477a.C20766v;
import com.bytedance.tux.p1722h.C23155d;
import com.bytedance.tux.tag.TuxTag;
import com.p2082ss.android.ugc.aweme.account.model.AbstractC32846a;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.feed.model.InteractionTagUserInfo;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63253l;
import com.p2082ss.android.ugc.aweme.shortvideo.C69905c;
import com.p2082ss.android.ugc.aweme.shortvideo.C70005cr;
import com.p2082ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.view.AvatarWithBorderView;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.p3810c.C70982a;
import com.p2082ss.android.ugc.aweme.shortvideo.model.AVTextExtraStruct;
import com.p2082ss.android.ugc.aweme.shortvideo.p3788aa.C69753a;
import com.p2082ss.android.ugc.aweme.shortvideo.p3788aa.C69755c;
import com.p2082ss.android.ugc.aweme.tools.draft.ExpandableMentionTextView;
import com.p2082ss.android.ugc.tools.p4340c.C84402a;
import com.p2082ss.android.ugc.tools.utils.C84912r;
import com.p2082ss.android.ugc.tools.view.widget.AVTextView;
import com.p2082ss.android.ugc.tools.view.widget.CircleImageView;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89350l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.PreviewFakeFeedView */
public final class PreviewFakeFeedView extends FrameLayout {

    /* renamed from: a */
    public AvatarWithBorderView f164662a;

    /* renamed from: b */
    public CircleImageView f164663b;

    /* renamed from: c */
    public CircleImageView f164664c;

    /* renamed from: d */
    public TextView f164665d;

    /* renamed from: e */
    public TuxTag f164666e;

    /* renamed from: f */
    public AVTextView f164667f;

    /* renamed from: g */
    public ExpandableMentionTextView f164668g;

    /* renamed from: h */
    public LinearLayout f164669h;

    /* renamed from: i */
    public SmartImageView f164670i;

    /* renamed from: j */
    public TextView f164671j;

    /* renamed from: k */
    public LinearLayout f164672k;

    /* renamed from: l */
    public TextView f164673l;

    /* renamed from: m */
    public TuxTag f164674m;

    /* renamed from: n */
    public ConstraintLayout f164675n;

    /* renamed from: o */
    public LinearLayout f164676o;

    /* renamed from: p */
    public View f164677p;

    /* renamed from: q */
    private final AbstractC89244h f164678q = C89250i.m154773a((AbstractC89171a) new C73320d(this));

    static {
        Covode.recordClassIndex(86042);
    }

    /* access modifiers changed from: package-private */
    public final SafeHandler getUiHandler() {
        return (SafeHandler) this.f164678q.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.PreviewFakeFeedView$a */
    static final class RunnableC73317a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ PreviewFakeFeedView f164679a;

        static {
            Covode.recordClassIndex(86043);
        }

        RunnableC73317a(PreviewFakeFeedView previewFakeFeedView) {
            this.f164679a = previewFakeFeedView;
        }

        public final void run() {
            this.f164679a.getTvMusic().requestFocus();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.PreviewFakeFeedView$c */
    static final class RunnableC73319c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ PreviewFakeFeedView f164681a;

        static {
            Covode.recordClassIndex(86045);
        }

        RunnableC73319c(PreviewFakeFeedView previewFakeFeedView) {
            this.f164681a = previewFakeFeedView;
        }

        public final void run() {
            this.f164681a.getTvMusic().requestFocus();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.PreviewFakeFeedView$d */
    static final class C73320d extends AbstractC89220m implements AbstractC89171a<SafeHandler> {

        /* renamed from: a */
        final /* synthetic */ PreviewFakeFeedView f164682a;

        static {
            Covode.recordClassIndex(86046);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C73320d(PreviewFakeFeedView previewFakeFeedView) {
            super(0);
            this.f164682a = previewFakeFeedView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ SafeHandler invoke() {
            return new SafeHandler(this.f164682a.getLifecycleOwner());
        }
    }

    public final SmartImageView getAnchorIcon() {
        SmartImageView smartImageView = this.f164670i;
        if (smartImageView == null) {
            C89219l.m154710a("anchorIcon");
        }
        return smartImageView;
    }

    public final LinearLayout getAnchorLayout() {
        LinearLayout linearLayout = this.f164669h;
        if (linearLayout == null) {
            C89219l.m154710a("anchorLayout");
        }
        return linearLayout;
    }

    public final TextView getAnchorText() {
        TextView textView = this.f164671j;
        if (textView == null) {
            C89219l.m154710a("anchorText");
        }
        return textView;
    }

    public final ConstraintLayout getBottomTab() {
        ConstraintLayout constraintLayout = this.f164675n;
        if (constraintLayout == null) {
            C89219l.m154710a("bottomTab");
        }
        return constraintLayout;
    }

    public final View getItemView() {
        View view = this.f164677p;
        if (view == null) {
            C89219l.m154710a("itemView");
        }
        return view;
    }

    public final CircleImageView getIvOriginMusicCover() {
        CircleImageView circleImageView = this.f164664c;
        if (circleImageView == null) {
            C89219l.m154710a("ivOriginMusicCover");
        }
        return circleImageView;
    }

    public final LinearLayout getLeftBottomContent() {
        LinearLayout linearLayout = this.f164676o;
        if (linearLayout == null) {
            C89219l.m154710a("leftBottomContent");
        }
        return linearLayout;
    }

    public final AvatarWithBorderView getMAvatarView() {
        AvatarWithBorderView avatarWithBorderView = this.f164662a;
        if (avatarWithBorderView == null) {
            C89219l.m154710a("mAvatarView");
        }
        return avatarWithBorderView;
    }

    public final CircleImageView getMMusicCoverView() {
        CircleImageView circleImageView = this.f164663b;
        if (circleImageView == null) {
            C89219l.m154710a("mMusicCoverView");
        }
        return circleImageView;
    }

    public final LinearLayout getPermissionLL() {
        LinearLayout linearLayout = this.f164672k;
        if (linearLayout == null) {
            C89219l.m154710a("permissionLL");
        }
        return linearLayout;
    }

    public final TuxTag getPermissionTag() {
        TuxTag tuxTag = this.f164674m;
        if (tuxTag == null) {
            C89219l.m154710a("permissionTag");
        }
        return tuxTag;
    }

    public final TextView getPreviewTitle() {
        TextView textView = this.f164673l;
        if (textView == null) {
            C89219l.m154710a("previewTitle");
        }
        return textView;
    }

    public final ExpandableMentionTextView getTvDescription() {
        ExpandableMentionTextView expandableMentionTextView = this.f164668g;
        if (expandableMentionTextView == null) {
            C89219l.m154710a("tvDescription");
        }
        return expandableMentionTextView;
    }

    public final AVTextView getTvMusic() {
        AVTextView aVTextView = this.f164667f;
        if (aVTextView == null) {
            C89219l.m154710a("tvMusic");
        }
        return aVTextView;
    }

    public final TextView getTvName() {
        TextView textView = this.f164665d;
        if (textView == null) {
            C89219l.m154710a("tvName");
        }
        return textView;
    }

    public final TuxTag getTvSocialVideoTagged() {
        TuxTag tuxTag = this.f164666e;
        if (tuxTag == null) {
            C89219l.m154710a("tvSocialVideoTagged");
        }
        return tuxTag;
    }

    public final float getBottomMarginForCaptionSticker() {
        float height = (float) getHeight();
        LinearLayout linearLayout = this.f164676o;
        if (linearLayout == null) {
            C89219l.m154710a("leftBottomContent");
        }
        return height - ((float) linearLayout.getTop());
    }

    public final AbstractC1204m getLifecycleOwner() {
        Context context = getContext();
        while (!(context instanceof AbstractC1204m)) {
            Objects.requireNonNull(context, "null cannot be cast to non-null type android.content.ContextWrapper");
            context = ((ContextWrapper) context).getBaseContext();
        }
        return (AbstractC1204m) context;
    }

    public final void setAnchorIcon(SmartImageView smartImageView) {
        C89219l.m154721d(smartImageView, "");
        this.f164670i = smartImageView;
    }

    public final void setAnchorLayout(LinearLayout linearLayout) {
        C89219l.m154721d(linearLayout, "");
        this.f164669h = linearLayout;
    }

    public final void setAnchorText(TextView textView) {
        C89219l.m154721d(textView, "");
        this.f164671j = textView;
    }

    public final void setBottomTab(ConstraintLayout constraintLayout) {
        C89219l.m154721d(constraintLayout, "");
        this.f164675n = constraintLayout;
    }

    public final void setItemView(View view) {
        C89219l.m154721d(view, "");
        this.f164677p = view;
    }

    public final void setIvOriginMusicCover(CircleImageView circleImageView) {
        C89219l.m154721d(circleImageView, "");
        this.f164664c = circleImageView;
    }

    public final void setLeftBottomContent(LinearLayout linearLayout) {
        C89219l.m154721d(linearLayout, "");
        this.f164676o = linearLayout;
    }

    public final void setMAvatarView(AvatarWithBorderView avatarWithBorderView) {
        C89219l.m154721d(avatarWithBorderView, "");
        this.f164662a = avatarWithBorderView;
    }

    public final void setMMusicCoverView(CircleImageView circleImageView) {
        C89219l.m154721d(circleImageView, "");
        this.f164663b = circleImageView;
    }

    public final void setPermissionLL(LinearLayout linearLayout) {
        C89219l.m154721d(linearLayout, "");
        this.f164672k = linearLayout;
    }

    public final void setPermissionTag(TuxTag tuxTag) {
        C89219l.m154721d(tuxTag, "");
        this.f164674m = tuxTag;
    }

    public final void setPreviewTitle(TextView textView) {
        C89219l.m154721d(textView, "");
        this.f164673l = textView;
    }

    public final void setTvDescription(ExpandableMentionTextView expandableMentionTextView) {
        C89219l.m154721d(expandableMentionTextView, "");
        this.f164668g = expandableMentionTextView;
    }

    public final void setTvMusic(AVTextView aVTextView) {
        C89219l.m154721d(aVTextView, "");
        this.f164667f = aVTextView;
    }

    public final void setTvName(TextView textView) {
        C89219l.m154721d(textView, "");
        this.f164665d = textView;
    }

    public final void setTvSocialVideoTagged(TuxTag tuxTag) {
        C89219l.m154721d(tuxTag, "");
        this.f164666e = tuxTag;
    }

    public final void setBottomMargin(int i) {
        View view = this.f164677p;
        if (view == null) {
            C89219l.m154710a("itemView");
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        layoutParams2.bottomMargin = i;
        View view2 = this.f164677p;
        if (view2 == null) {
            C89219l.m154710a("itemView");
        }
        view2.setLayoutParams(layoutParams2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.PreviewFakeFeedView$b */
    public static final class C73318b<T> implements Comparator {

        /* renamed from: a */
        public static final C73318b f164680a = new C73318b();

        static {
            Covode.recordClassIndex(86044);
        }

        C73318b() {
        }

        @Override // java.util.Comparator
        public final /* synthetic */ int compare(Object obj, Object obj2) {
            AVTextExtraStruct aVTextExtraStruct = (AVTextExtraStruct) obj;
            AVTextExtraStruct aVTextExtraStruct2 = (AVTextExtraStruct) obj2;
            C89219l.m154721d(aVTextExtraStruct, "");
            C89219l.m154721d(aVTextExtraStruct2, "");
            return C89219l.m154703a(aVTextExtraStruct.getStart(), aVTextExtraStruct2.getStart());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PreviewFakeFeedView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        String a;
        UrlModel urlModel;
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(10230);
        View a2 = C1764a.m5927a(LayoutInflater.from(getContext()), R.layout.bw, this, false);
        C89219l.m154716b(a2, "");
        this.f164677p = a2;
        if (a2 == null) {
            C89219l.m154710a("itemView");
        }
        View findViewById = a2.findViewById(R.id.f__);
        C89219l.m154716b(findViewById, "");
        AvatarWithBorderView avatarWithBorderView = (AvatarWithBorderView) findViewById;
        this.f164662a = avatarWithBorderView;
        if (avatarWithBorderView == null) {
            C89219l.m154710a("mAvatarView");
        }
        avatarWithBorderView.setBorderColor(R.color.l);
        View view = this.f164677p;
        if (view == null) {
            C89219l.m154710a("itemView");
        }
        View findViewById2 = view.findViewById(R.id.cnl);
        C89219l.m154716b(findViewById2, "");
        this.f164663b = (CircleImageView) findViewById2;
        View view2 = this.f164677p;
        if (view2 == null) {
            C89219l.m154710a("itemView");
        }
        View findViewById3 = view2.findViewById(R.id.cxm);
        C89219l.m154716b(findViewById3, "");
        this.f164664c = (CircleImageView) findViewById3;
        View view3 = this.f164677p;
        if (view3 == null) {
            C89219l.m154710a("itemView");
        }
        View findViewById4 = view3.findViewById(R.id.ezz);
        C89219l.m154716b(findViewById4, "");
        this.f164665d = (TextView) findViewById4;
        View view4 = this.f164677p;
        if (view4 == null) {
            C89219l.m154710a("itemView");
        }
        View findViewById5 = view4.findViewById(R.id.e47);
        C89219l.m154716b(findViewById5, "");
        this.f164666e = (TuxTag) findViewById5;
        View view5 = this.f164677p;
        if (view5 == null) {
            C89219l.m154710a("itemView");
        }
        View findViewById6 = view5.findViewById(R.id.ezo);
        C89219l.m154716b(findViewById6, "");
        this.f164667f = (AVTextView) findViewById6;
        View view6 = this.f164677p;
        if (view6 == null) {
            C89219l.m154710a("itemView");
        }
        View findViewById7 = view6.findViewById(R.id.d5x);
        C89219l.m154716b(findViewById7, "");
        this.f164668g = (ExpandableMentionTextView) findViewById7;
        View view7 = this.f164677p;
        if (view7 == null) {
            C89219l.m154710a("itemView");
        }
        View findViewById8 = view7.findViewById(R.id.d5q);
        C89219l.m154716b(findViewById8, "");
        this.f164669h = (LinearLayout) findViewById8;
        View view8 = this.f164677p;
        if (view8 == null) {
            C89219l.m154710a("itemView");
        }
        View findViewById9 = view8.findViewById(R.id.j3);
        C89219l.m154716b(findViewById9, "");
        this.f164670i = (SmartImageView) findViewById9;
        View view9 = this.f164677p;
        if (view9 == null) {
            C89219l.m154710a("itemView");
        }
        View findViewById10 = view9.findViewById(R.id.iy);
        C89219l.m154716b(findViewById10, "");
        this.f164671j = (TextView) findViewById10;
        View view10 = this.f164677p;
        if (view10 == null) {
            C89219l.m154710a("itemView");
        }
        View findViewById11 = view10.findViewById(R.id.d5v);
        C89219l.m154716b(findViewById11, "");
        this.f164673l = (TextView) findViewById11;
        View view11 = this.f164677p;
        if (view11 == null) {
            C89219l.m154710a("itemView");
        }
        View findViewById12 = view11.findViewById(R.id.dar);
        C89219l.m154716b(findViewById12, "");
        this.f164674m = (TuxTag) findViewById12;
        View view12 = this.f164677p;
        if (view12 == null) {
            C89219l.m154710a("itemView");
        }
        View findViewById13 = view12.findViewById(R.id.daq);
        C89219l.m154716b(findViewById13, "");
        this.f164676o = (LinearLayout) findViewById13;
        View view13 = this.f164677p;
        if (view13 == null) {
            C89219l.m154710a("itemView");
        }
        addView(view13);
        C69905c cVar = C70005cr.m123611a().f156482a;
        AbstractC32846a e = C63244g.m114602a().mo73255A().mo93906e();
        UrlModel urlModel2 = null;
        if (e == null || e.mo58663f() == null) {
            AvatarWithBorderView avatarWithBorderView2 = this.f164662a;
            if (avatarWithBorderView2 == null) {
                C89219l.m154710a("mAvatarView");
            }
            C84402a.m145165a(avatarWithBorderView2, 2131232314);
        } else {
            AvatarWithBorderView avatarWithBorderView3 = this.f164662a;
            if (avatarWithBorderView3 == null) {
                C89219l.m154710a("mAvatarView");
            }
            UrlModel f = e.mo58663f();
            Context context2 = getContext();
            C89219l.m154716b(context2, "");
            int a3 = (int) C84912r.m145930a(context2, 49.0f);
            Context context3 = getContext();
            C89219l.m154716b(context3, "");
            C84402a.m145169a(avatarWithBorderView3, f, a3, (int) C84912r.m145930a(context3, 49.0f));
        }
        TextView textView = this.f164665d;
        if (textView == null) {
            C89219l.m154710a("tvName");
        }
        StringBuilder sb = new StringBuilder("@");
        AbstractC32846a e2 = C63244g.m114602a().mo73255A().mo93906e();
        Resources resources = getResources();
        C89219l.m154716b(resources, "");
        textView.setText(sb.append(C70982a.m125335a(e2, resources)).toString());
        CircleImageView circleImageView = this.f164664c;
        if (circleImageView == null) {
            C89219l.m154710a("ivOriginMusicCover");
        }
        if (cVar != null && (urlModel = cVar.coverThumb) != null) {
            urlModel2 = urlModel;
        } else if (e != null) {
            urlModel2 = e.mo58663f();
        }
        C84402a.m145169a(circleImageView, urlModel2, 27, 27);
        CircleImageView circleImageView2 = this.f164663b;
        if (circleImageView2 == null) {
            C89219l.m154710a("mMusicCoverView");
        }
        C84402a.m145165a(circleImageView2, 2131232312);
        AVTextView aVTextView = this.f164667f;
        if (aVTextView == null) {
            C89219l.m154710a("tvMusic");
        }
        Context context4 = getContext();
        C89219l.m154716b(context4, "");
        AbstractC32846a e3 = C63244g.m114602a().mo73255A().mo93906e();
        C89219l.m154721d(context4, "");
        C69905c cVar2 = C70005cr.m123611a().f156482a;
        if (cVar2 != null) {
            a = cVar2.musicName + " — @" + cVar2.authorName;
        } else {
            a = C70982a.m125334a(context4, e3);
        }
        aVTextView.setText(a);
        getUiHandler().post(new RunnableC73317a(this));
        MethodCollector.m26664o(10230);
    }

    /* renamed from: a */
    public final void mo115849a(VideoPublishEditModel videoPublishEditModel, String str, UrlModel urlModel, int i) {
        String str2;
        boolean z;
        ArrayList<InteractionTagUserInfo> arrayList;
        String a;
        String str3;
        List<AVTextExtraStruct> list;
        String str4;
        MethodCollector.m26663i(10227);
        if (videoPublishEditModel != null) {
            str2 = videoPublishEditModel.title;
        } else {
            str2 = null;
        }
        if (str2 == null || str2.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            ExpandableMentionTextView expandableMentionTextView = this.f164668g;
            if (expandableMentionTextView == null) {
                C89219l.m154710a("tvDescription");
            }
            expandableMentionTextView.setVisibility(0);
            if (videoPublishEditModel != null) {
                str4 = videoPublishEditModel.title;
                list = videoPublishEditModel.structList;
                if (C63253l.f143623a.mo73309e().mo93762d() && str4 != null && C89361p.m154908a((CharSequence) str4, (CharSequence) "\n", false)) {
                    C89219l.m154721d(videoPublishEditModel, "");
                    String str5 = videoPublishEditModel.title;
                    C89219l.m154716b(str5, "");
                    String replace = new C89350l("\n+").replace(str5, " ");
                    List list2 = videoPublishEditModel.structList;
                    C89219l.m154716b(list2, "");
                    List<AVTextExtraStruct> g = C89070n.m154585g((Collection) list2);
                    C89070n.m154530a(g, (Comparator) C73318b.f164680a);
                    int i2 = 0;
                    for (AVTextExtraStruct aVTextExtraStruct : g) {
                        String substring = str5.substring(aVTextExtraStruct.getStart(), aVTextExtraStruct.getEnd());
                        C89219l.m154716b(substring, "");
                        int a2 = C89361p.m154888a((CharSequence) replace, substring, i2, false, 4);
                        if (a2 >= 0) {
                            i2 = a2 + substring.length();
                            aVTextExtraStruct.setStart(a2);
                            aVTextExtraStruct.setEnd(i2);
                        }
                    }
                    Pair pair = new Pair(g, replace);
                    list = (List) pair.first;
                    str4 = (String) pair.second;
                }
            } else {
                str4 = null;
                list = null;
            }
            ExpandableMentionTextView expandableMentionTextView2 = this.f164668g;
            if (expandableMentionTextView2 == null) {
                C89219l.m154710a("tvDescription");
            }
            expandableMentionTextView2.setText(str4);
            ExpandableMentionTextView expandableMentionTextView3 = this.f164668g;
            if (expandableMentionTextView3 == null) {
                C89219l.m154710a("tvDescription");
            }
            expandableMentionTextView3.setTextColor(C0643b.m2378c(getContext(), R.color.l));
            ExpandableMentionTextView expandableMentionTextView4 = this.f164668g;
            if (expandableMentionTextView4 == null) {
                C89219l.m154710a("tvDescription");
            }
            expandableMentionTextView4.setSpanColor(C0643b.m2378c(getContext(), R.color.l));
            if (list != null) {
                for (AVTextExtraStruct aVTextExtraStruct2 : list) {
                    C89219l.m154716b(aVTextExtraStruct2, "");
                    if (aVTextExtraStruct2.getType() == 0) {
                        int subType = aVTextExtraStruct2.getSubType();
                        if (subType == 1) {
                            Context context = getContext();
                            C89219l.m154716b(context, "");
                            ExpandableMentionTextView expandableMentionTextView5 = this.f164668g;
                            if (expandableMentionTextView5 == null) {
                                C89219l.m154710a("tvDescription");
                            }
                            C69753a aVar = new C69753a(context, expandableMentionTextView5);
                            ExpandableMentionTextView expandableMentionTextView6 = this.f164668g;
                            if (expandableMentionTextView6 == null) {
                                C89219l.m154710a("tvDescription");
                            }
                            expandableMentionTextView6.mo122334a(aVTextExtraStruct2.getStart(), aVTextExtraStruct2.getEnd(), aVar);
                        } else if (subType == 2) {
                            Context context2 = getContext();
                            C89219l.m154716b(context2, "");
                            ExpandableMentionTextView expandableMentionTextView7 = this.f164668g;
                            if (expandableMentionTextView7 == null) {
                                C89219l.m154710a("tvDescription");
                            }
                            C69755c cVar = new C69755c(context2, expandableMentionTextView7);
                            Context context3 = getContext();
                            C89219l.m154716b(context3, "");
                            cVar.f155895a = BitmapFactory.decodeResource(context3.getResources(), 2131233963);
                            ExpandableMentionTextView expandableMentionTextView8 = this.f164668g;
                            if (expandableMentionTextView8 == null) {
                                C89219l.m154710a("tvDescription");
                            }
                            expandableMentionTextView8.mo122334a(aVTextExtraStruct2.getStart(), aVTextExtraStruct2.getEnd(), cVar);
                        } else if (subType == 3) {
                            Context context4 = getContext();
                            C89219l.m154716b(context4, "");
                            ExpandableMentionTextView expandableMentionTextView9 = this.f164668g;
                            if (expandableMentionTextView9 == null) {
                                C89219l.m154710a("tvDescription");
                            }
                            C69755c cVar2 = new C69755c(context4, expandableMentionTextView9);
                            Context context5 = getContext();
                            C89219l.m154716b(context5, "");
                            cVar2.f155895a = BitmapFactory.decodeResource(context5.getResources(), 2131233965);
                            ExpandableMentionTextView expandableMentionTextView10 = this.f164668g;
                            if (expandableMentionTextView10 == null) {
                                C89219l.m154710a("tvDescription");
                            }
                            expandableMentionTextView10.mo122334a(aVTextExtraStruct2.getStart(), aVTextExtraStruct2.getEnd(), cVar2);
                        }
                    }
                }
            }
        }
        if (!(str == null || str.length() == 0 || urlModel == null)) {
            LinearLayout linearLayout = this.f164669h;
            if (linearLayout == null) {
                C89219l.m154710a("anchorLayout");
            }
            linearLayout.setVisibility(0);
            TextView textView = this.f164671j;
            if (textView == null) {
                C89219l.m154710a("anchorText");
            }
            textView.setText(str);
            List<String> urlList = urlModel.getUrlList();
            if (urlList == null || (str3 = (String) C89070n.m154579f((List) urlList)) == null) {
                str3 = "";
            }
            C20766v a3 = C20761r.m39061a(str3);
            SmartImageView smartImageView = this.f164670i;
            if (smartImageView == null) {
                C89219l.m154710a("anchorIcon");
            }
            a3.f49092E = smartImageView;
            a3.mo34186c();
        }
        if (i == 1) {
            TuxTag tuxTag = this.f164674m;
            if (tuxTag == null) {
                C89219l.m154710a("permissionTag");
            }
            tuxTag.setVisibility(0);
            TuxTag tuxTag2 = this.f164674m;
            if (tuxTag2 == null) {
                C89219l.m154710a("permissionTag");
            }
            Context context6 = getContext();
            C89219l.m154716b(context6, "");
            tuxTag2.setText(context6.getResources().getText(R.string.et7));
            TuxTag tuxTag3 = this.f164674m;
            if (tuxTag3 == null) {
                C89219l.m154710a("permissionTag");
            }
            tuxTag3.setTagIcon(Integer.valueOf((int) R.raw.icon_lock_fill));
        } else if (i == 2) {
            TuxTag tuxTag4 = this.f164674m;
            if (tuxTag4 == null) {
                C89219l.m154710a("permissionTag");
            }
            tuxTag4.setVisibility(0);
            TuxTag tuxTag5 = this.f164674m;
            if (tuxTag5 == null) {
                C89219l.m154710a("permissionTag");
            }
            Context context7 = getContext();
            C89219l.m154716b(context7, "");
            tuxTag5.setText(context7.getResources().getText(R.string.c0u));
            TuxTag tuxTag6 = this.f164674m;
            if (tuxTag6 == null) {
                C89219l.m154710a("permissionTag");
            }
            tuxTag6.setTagIcon(Integer.valueOf((int) R.raw.icon_person_arrow_left_right_fill));
        }
        Context context8 = getContext();
        C89219l.m154716b(context8, "");
        Integer a4 = C23155d.m43641a(context8, R.attr.ac);
        if (a4 != null) {
            int intValue = a4.intValue();
            TuxTag tuxTag7 = this.f164674m;
            if (tuxTag7 == null) {
                C89219l.m154710a("permissionTag");
            }
            tuxTag7.setTagBackgroundColor(intValue);
            if (videoPublishEditModel == null || (arrayList = videoPublishEditModel.tagUserList) == null || !(!arrayList.isEmpty())) {
                MethodCollector.m26664o(10227);
                return;
            }
            TuxTag tuxTag8 = this.f164666e;
            if (tuxTag8 == null) {
                C89219l.m154710a("tvSocialVideoTagged");
            }
            tuxTag8.setVisibility(0);
            TuxTag tuxTag9 = this.f164666e;
            if (tuxTag9 == null) {
                C89219l.m154710a("tvSocialVideoTagged");
            }
            tuxTag9.setTagIcon(Integer.valueOf((int) R.raw.icon_person_fill));
            TuxTag tuxTag10 = this.f164666e;
            if (tuxTag10 == null) {
                C89219l.m154710a("tvSocialVideoTagged");
            }
            if (arrayList.size() == 1) {
                Boolean b = C63244g.m114602a().mo73297y().mo93848b();
                C89219l.m154716b(b, "");
                if (b.booleanValue()) {
                    a = arrayList.get(0).getNickname();
                } else {
                    a = arrayList.get(0).getUniqueId();
                }
            } else {
                Context context9 = getContext();
                C89219l.m154716b(context9, "");
                String string = context9.getResources().getString(R.string.g9y);
                C89219l.m154716b(string, "");
                a = C1764a.m5928a(string, Arrays.copyOf(new Object[]{"", Integer.valueOf(arrayList.size())}, 2));
                C89219l.m154716b(a, "");
            }
            tuxTag10.setText(a);
            MethodCollector.m26664o(10227);
            return;
        }
        MethodCollector.m26664o(10227);
    }
}
