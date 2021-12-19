package com.p2082ss.android.ugc.aweme.tools.draft.viewholder;

import android.app.Application;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextPaint;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.CompoundButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.p037h.C0792v;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1203l;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.bytedance.services.apm.api.C22708a;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxCheckBox;
import com.bytedance.tux.input.TuxTextView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p2082ss.android.ugc.aweme.draft.model.C43223c;
import com.p2082ss.android.ugc.aweme.draft.model.C43225d;
import com.p2082ss.android.ugc.aweme.draft.model.C43237k;
import com.p2082ss.android.ugc.aweme.experiment.C46786cc;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63247i;
import com.p2082ss.android.ugc.aweme.services.effect.IEffectService;
import com.p2082ss.android.ugc.aweme.shortvideo.C70005cr;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73991bj;
import com.p2082ss.android.ugc.aweme.tools.draft.p4103d.C78232c;
import com.p2082ss.android.ugc.aweme.tools.draft.p4103d.C78242m;
import com.p2082ss.android.ugc.aweme.tools.draft.p4105f.AbstractC78249a;
import com.p2082ss.android.ugc.aweme.tools.draft.viewmodel.C78467a;
import com.p2082ss.android.ugc.tools.p4340c.C84402a;
import com.p2082ss.android.ugc.trill.R;
import java.io.File;
import java.lang.reflect.Field;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4619j.C89271h;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.tools.draft.viewholder.NewDraftViewHolder */
public final class NewDraftViewHolder extends AbstractC78442a<C78242m> implements AbstractC1203l {

    /* renamed from: a */
    public final String f176240a = "NewDraftViewHolder";

    /* renamed from: b */
    public Context f176241b;

    /* renamed from: c */
    TuxCheckBox f176242c;

    /* renamed from: d */
    public SimpleDraweeView f176243d;

    /* renamed from: e */
    public C78242m f176244e;

    /* renamed from: f */
    long f176245f;

    /* renamed from: g */
    public final AbstractC78249a f176246g;

    /* renamed from: h */
    public final C78467a f176247h;

    /* renamed from: i */
    private TuxTextView f176248i;

    /* renamed from: j */
    private View f176249j;

    /* renamed from: k */
    private TuxTextView f176250k;

    /* renamed from: l */
    private ViewGroup f176251l;

    /* renamed from: m */
    private ViewGroup f176252m;

    /* renamed from: n */
    private ViewGroup f176253n;

    /* renamed from: o */
    private TuxIconView f176254o;

    /* renamed from: p */
    private TextView f176255p;

    /* renamed from: q */
    private C43237k f176256q;

    static {
        Covode.recordClassIndex(91564);
    }

    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
    }

    /* renamed from: a */
    public static final /* synthetic */ C78242m m136959a(NewDraftViewHolder newDraftViewHolder) {
        C78242m mVar = newDraftViewHolder.f176244e;
        if (mVar == null) {
            C89219l.m154710a("mData");
        }
        return mVar;
    }

    /* renamed from: b */
    public static final /* synthetic */ SimpleDraweeView m136962b(NewDraftViewHolder newDraftViewHolder) {
        SimpleDraweeView simpleDraweeView = newDraftViewHolder.f176243d;
        if (simpleDraweeView == null) {
            C89219l.m154710a("mCover");
        }
        return simpleDraweeView;
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.draft.viewholder.NewDraftViewHolder$c */
    public static final class C78439c implements IEffectService.OnVideoCoverCallback {

        /* renamed from: a */
        final /* synthetic */ NewDraftViewHolder f176260a;

        /* renamed from: b */
        final /* synthetic */ C78242m f176261b;

        /* renamed from: c */
        final /* synthetic */ C43223c f176262c;

        static {
            Covode.recordClassIndex(91567);
        }

        @Override // com.p2082ss.android.ugc.aweme.services.effect.IEffectService.OnVideoCoverCallback
        public final void onGetVideoCoverFailed(int i) {
            C73991bj.m130131b(this.f176260a.f176240a + " :onGetVideoCoverFailed: errorCode = " + i);
        }

        @Override // com.p2082ss.android.ugc.aweme.services.effect.IEffectService.OnVideoCoverCallback
        public final void onGetVideoCoverSuccess(Bitmap bitmap) {
            C89219l.m154721d(bitmap, "");
            C73991bj.m130131b(this.f176260a.f176240a + " : bindDraftCover -> creationId = " + ((C78232c) this.f176261b).f175706c);
            C73991bj.m130128a(this.f176260a.f176240a + " : onGetVideoCoverSuccess: ");
            if (!bitmap.isRecycled() && NewDraftViewHolder.m136962b(this.f176260a).getTag() != null && !(!C89219l.m154714a(NewDraftViewHolder.m136962b(this.f176260a).getTag(), (Object) this.f176262c.mo73726r()))) {
                SimpleDraweeView b = NewDraftViewHolder.m136962b(this.f176260a);
                if (!bitmap.isRecycled()) {
                    b.setImageBitmap(bitmap);
                }
            }
        }

        C78439c(NewDraftViewHolder newDraftViewHolder, C78242m mVar, C43223c cVar) {
            this.f176260a = newDraftViewHolder;
            this.f176261b = mVar;
            this.f176262c = cVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.draft.viewholder.NewDraftViewHolder$b */
    static final class View$OnClickListenerC78438b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ NewDraftViewHolder f176258a;

        /* renamed from: b */
        final /* synthetic */ C78242m f176259b;

        static {
            Covode.recordClassIndex(91566);
        }

        View$OnClickListenerC78438b(NewDraftViewHolder newDraftViewHolder, C78242m mVar) {
            this.f176258a = newDraftViewHolder;
            this.f176259b = mVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (!C63244g.m114602a().mo73287o().mo104784d()) {
                C70005cr.m123611a();
                C89219l.m154716b(view, "");
                if (!C70005cr.m123613a(view.getContext())) {
                    return;
                }
            }
            AbstractC78249a aVar = this.f176258a.f176246g;
            C89219l.m154716b(view, "");
            aVar.mo122084a(view, this.f176258a.f176241b, ((C78232c) this.f176259b).f175706c);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.draft.viewholder.NewDraftViewHolder$e */
    static final class View$OnLongClickListenerC78441e implements View.OnLongClickListener {

        /* renamed from: a */
        final /* synthetic */ NewDraftViewHolder f176264a;

        static {
            Covode.recordClassIndex(91569);
        }

        View$OnLongClickListenerC78441e(NewDraftViewHolder newDraftViewHolder) {
            this.f176264a = newDraftViewHolder;
        }

        public final boolean onLongClick(View view) {
            NewDraftViewHolder newDraftViewHolder = this.f176264a;
            if (view == null) {
                C89219l.m154715b();
            }
            C89219l.m154721d(view, "");
            C70005cr.m123611a();
            if (!C70005cr.m123613a(view.getContext())) {
                return true;
            }
            AbstractC78249a aVar = newDraftViewHolder.f176246g;
            C78242m mVar = newDraftViewHolder.f176244e;
            if (mVar == null) {
                C89219l.m154710a("mData");
            }
            aVar.mo122085a(view, mVar);
            return true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.draft.viewholder.NewDraftViewHolder$d */
    static final class View$OnClickListenerC78440d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ NewDraftViewHolder f176263a;

        static {
            Covode.recordClassIndex(91568);
        }

        View$OnClickListenerC78440d(NewDraftViewHolder newDraftViewHolder) {
            this.f176263a = newDraftViewHolder;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            NewDraftViewHolder newDraftViewHolder = this.f176263a;
            if (view == null) {
                C89219l.m154715b();
            }
            C78242m mVar = newDraftViewHolder.f176244e;
            if (mVar == null) {
                C89219l.m154710a("mData");
            }
            if (mVar.f175702a) {
                TuxCheckBox tuxCheckBox = newDraftViewHolder.f176242c;
                if (tuxCheckBox == null) {
                    C89219l.m154710a("mCheckBox");
                }
                C78242m mVar2 = newDraftViewHolder.f176244e;
                if (mVar2 == null) {
                    C89219l.m154710a("mData");
                }
                tuxCheckBox.setChecked(!mVar2.f175708e);
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - newDraftViewHolder.f176245f >= 500) {
                newDraftViewHolder.f176245f = currentTimeMillis;
                AbstractC78249a aVar = newDraftViewHolder.f176246g;
                int adapterPosition = newDraftViewHolder.getAdapterPosition();
                C78242m mVar3 = newDraftViewHolder.f176244e;
                if (mVar3 == null) {
                    C89219l.m154710a("mData");
                }
                aVar.mo122083a(adapterPosition, mVar3);
            }
        }
    }

    /* renamed from: a */
    private final void m136961a(C78242m mVar) {
        if (C46786cc.m90132a()) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
            layoutParams.addRule(20);
            View view = this.itemView;
            C89219l.m154716b(view, "");
            int b = (int) C13628n.m24520b(view.getContext(), 4.0f);
            View view2 = this.itemView;
            C89219l.m154716b(view2, "");
            int b2 = (int) C13628n.m24520b(view2.getContext(), 6.0f);
            layoutParams.setMargins(b, b2, b, b2);
            ViewGroup viewGroup = this.f176252m;
            if (viewGroup == null) {
                C89219l.m154710a("mTextBottomContainer");
            }
            viewGroup.setLayoutParams(layoutParams);
            TuxIconView tuxIconView = this.f176254o;
            if (tuxIconView == null) {
                C89219l.m154710a("iconView");
            }
            tuxIconView.setIconRes(R.raw.icon_music_note);
            TuxIconView tuxIconView2 = this.f176254o;
            if (tuxIconView2 == null) {
                C89219l.m154710a("iconView");
            }
            tuxIconView2.setTintColorRes(R.attr.aa);
            TuxTextView tuxTextView = this.f176250k;
            if (tuxTextView == null) {
                C89219l.m154710a("textBottom");
            }
            tuxTextView.setMaxLines(1);
            TuxTextView tuxTextView2 = this.f176250k;
            if (tuxTextView2 == null) {
                C89219l.m154710a("textBottom");
            }
            tuxTextView2.setMinTextSize(13.0f);
            TuxTextView tuxTextView3 = this.f176250k;
            if (tuxTextView3 == null) {
                C89219l.m154710a("textBottom");
            }
            tuxTextView3.setTuxFont(62);
            TuxTextView tuxTextView4 = this.f176250k;
            if (tuxTextView4 == null) {
                C89219l.m154710a("textBottom");
            }
            tuxTextView4.setText(mVar.f175710g);
        } else {
            TuxIconView tuxIconView3 = this.f176254o;
            if (tuxIconView3 == null) {
                C89219l.m154710a("iconView");
            }
            tuxIconView3.setIconRes(R.raw.icon_video);
            TuxIconView tuxIconView4 = this.f176254o;
            if (tuxIconView4 == null) {
                C89219l.m154710a("iconView");
            }
            tuxIconView4.setTintColorRes(R.attr.aa);
            TuxTextView tuxTextView5 = this.f176250k;
            if (tuxTextView5 == null) {
                C89219l.m154710a("textBottom");
            }
            tuxTextView5.setMaxLines(2);
            TuxTextView tuxTextView6 = this.f176250k;
            if (tuxTextView6 == null) {
                C89219l.m154710a("textBottom");
            }
            tuxTextView6.setMinTextSize(10.0f);
            Object a = m136960a(C63247i.f143610a, "window");
            Objects.requireNonNull(a, "null cannot be cast to non-null type android.view.WindowManager");
            Display defaultDisplay = ((WindowManager) a).getDefaultDisplay();
            Point point = new Point();
            int i = Build.VERSION.SDK_INT;
            defaultDisplay.getRealSize(point);
            int i2 = point.x / 3;
            View view3 = this.itemView;
            C89219l.m154716b(view3, "");
            int b3 = i2 - ((int) C13628n.m24520b(view3.getContext(), 34.0f));
            TuxTextView tuxTextView7 = this.f176250k;
            if (tuxTextView7 == null) {
                C89219l.m154710a("textBottom");
            }
            TextPaint paint = tuxTextView7.getPaint();
            String string = this.f176241b.getString(R.string.bcw);
            C89219l.m154716b(string, "");
            TuxTextView tuxTextView8 = this.f176250k;
            if (tuxTextView8 == null) {
                C89219l.m154710a("textBottom");
            }
            tuxTextView8.setText(R.string.bcw);
            TuxTextView tuxTextView9 = this.f176250k;
            if (tuxTextView9 == null) {
                C89219l.m154710a("textBottom");
            }
            tuxTextView9.setTuxFont(92);
            float f = (float) b3;
            if (paint.measureText(string) > f) {
                TuxTextView tuxTextView10 = this.f176250k;
                if (tuxTextView10 == null) {
                    C89219l.m154710a("textBottom");
                }
                tuxTextView10.setTuxFont(92);
            } else {
                TuxTextView tuxTextView11 = this.f176250k;
                if (tuxTextView11 == null) {
                    C89219l.m154710a("textBottom");
                }
                tuxTextView11.setTuxFont(62);
            }
            Object[] array = C89361p.m154921c(string, new String[]{" "}).toArray(new String[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            String[] strArr = (String[]) array;
            if (paint.measureText(string) > f) {
                try {
                    String str = strArr[0];
                    int length = strArr.length;
                    int i3 = 0;
                    for (int i4 = 1; i4 < length; i4++) {
                        if (paint.measureText(str + " " + strArr[i4]) <= f) {
                            str = str + " " + strArr[i4];
                        } else {
                            i3 = i4;
                        }
                    }
                    String str2 = strArr[i3];
                    for (int i5 = i3 + 1; i5 < strArr.length; i5++) {
                        str2 = str2 + " " + strArr[i5];
                    }
                    float b4 = C89271h.m154768b(paint.measureText(str), paint.measureText(str2));
                    TuxTextView tuxTextView12 = this.f176250k;
                    if (tuxTextView12 == null) {
                        C89219l.m154710a("textBottom");
                    }
                    tuxTextView12.setWidth((int) (b4 + 1.0f));
                } catch (IndexOutOfBoundsException e) {
                    e.printStackTrace();
                } catch (NullPointerException e2) {
                    e2.printStackTrace();
                }
            }
        }
        TuxTextView tuxTextView13 = this.f176250k;
        if (tuxTextView13 == null) {
            C89219l.m154710a("textBottom");
        }
        tuxTextView13.setVisibility(0);
        ViewGroup viewGroup2 = this.f176251l;
        if (viewGroup2 == null) {
            C89219l.m154710a("mVideoInfoContainer");
        }
        viewGroup2.setVisibility(0);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.ss.android.ugc.aweme.tools.draft.d.a] */
    @Override // com.p2082ss.android.ugc.aweme.tools.draft.viewholder.AbstractC78442a
    /* renamed from: a */
    public final /* synthetic */ void mo122361a(C78242m mVar) {
        C78242m mVar2 = mVar;
        C89219l.m154721d(mVar2, "");
        this.f176244e = mVar2;
        if (mVar2 == null) {
            C89219l.m154710a("mData");
        }
        if (mVar2.f175702a) {
            TuxCheckBox tuxCheckBox = this.f176242c;
            if (tuxCheckBox == null) {
                C89219l.m154710a("mCheckBox");
            }
            tuxCheckBox.setVisibility(0);
        } else {
            TuxCheckBox tuxCheckBox2 = this.f176242c;
            if (tuxCheckBox2 == null) {
                C89219l.m154710a("mCheckBox");
            }
            tuxCheckBox2.setVisibility(8);
            C78242m mVar3 = this.f176244e;
            if (mVar3 == null) {
                C89219l.m154710a("mData");
            }
            mVar3.f175708e = false;
        }
        TuxCheckBox tuxCheckBox3 = this.f176242c;
        if (tuxCheckBox3 == null) {
            C89219l.m154710a("mCheckBox");
        }
        tuxCheckBox3.setOnCheckedChangeListener(null);
        TuxCheckBox tuxCheckBox4 = this.f176242c;
        if (tuxCheckBox4 == null) {
            C89219l.m154710a("mCheckBox");
        }
        C78242m mVar4 = this.f176244e;
        if (mVar4 == null) {
            C89219l.m154710a("mData");
        }
        tuxCheckBox4.setChecked(mVar4.f175708e);
        TuxCheckBox tuxCheckBox5 = this.f176242c;
        if (tuxCheckBox5 == null) {
            C89219l.m154710a("mCheckBox");
        }
        tuxCheckBox5.setOnCheckedChangeListener(new C78437a(this));
        SimpleDraweeView simpleDraweeView = this.f176243d;
        if (simpleDraweeView == null) {
            C89219l.m154710a("mCover");
        }
        C78242m mVar5 = this.f176244e;
        if (mVar5 == null) {
            C89219l.m154710a("mData");
        }
        simpleDraweeView.setTag(((C78232c) mVar5).f175706c);
        SimpleDraweeView simpleDraweeView2 = this.f176243d;
        if (simpleDraweeView2 == null) {
            C89219l.m154710a("mCover");
        }
        simpleDraweeView2.setActualImageResource(2131232418);
        C78242m mVar6 = this.f176244e;
        if (mVar6 == null) {
            C89219l.m154710a("mData");
        }
        File file = new File(mVar6.f175707d);
        if (file.exists()) {
            Uri fromFile = Uri.fromFile(file);
            SimpleDraweeView simpleDraweeView3 = this.f176243d;
            if (simpleDraweeView3 == null) {
                C89219l.m154710a("mCover");
            }
            C84402a.m145174a(simpleDraweeView3, fromFile.toString(), -1, -1);
        } else {
            C43223c a = this.f176247h.mo122385a(((C78232c) mVar6).f175706c);
            if (a == null) {
                C73991bj.m130131b(this.f176240a + ": bindDraftCover -> draft is null");
                C22708a.m42800a("queryNull -> " + this.f176240a + " : bindDraftCover");
            } else {
                int dimensionPixelOffset = this.f176241b.getResources().getDimensionPixelOffset(R.dimen.j6);
                C43237k kVar = new C43237k(dimensionPixelOffset, dimensionPixelOffset, Bitmap.Config.ARGB_8888);
                this.f176256q = kVar;
                C43225d.m86327a(a, kVar, new C78439c(this, mVar6, a));
            }
        }
        C78242m mVar7 = this.f176244e;
        if (mVar7 == null) {
            C89219l.m154710a("mData");
        }
        if (!mVar7.f175702a) {
            TuxTextView tuxTextView = this.f176248i;
            if (tuxTextView == null) {
                C89219l.m154710a("mTvTop");
            }
            tuxTextView.setVisibility(0);
            TuxTextView tuxTextView2 = this.f176248i;
            if (tuxTextView2 == null) {
                C89219l.m154710a("mTvTop");
            }
            C78242m mVar8 = this.f176244e;
            if (mVar8 == null) {
                C89219l.m154710a("mData");
            }
            tuxTextView2.setText(mVar8.f175738i);
        } else {
            TuxTextView tuxTextView3 = this.f176248i;
            if (tuxTextView3 == null) {
                C89219l.m154710a("mTvTop");
            }
            tuxTextView3.setVisibility(8);
        }
        C78242m mVar9 = this.f176244e;
        if (mVar9 == null) {
            C89219l.m154710a("mData");
        }
        if (mVar9.f175703b) {
            ViewGroup viewGroup = this.f176253n;
            if (viewGroup == null) {
                C89219l.m154710a("mSizeContainer");
            }
            viewGroup.setVisibility(0);
            ViewGroup viewGroup2 = this.f176251l;
            if (viewGroup2 == null) {
                C89219l.m154710a("mVideoInfoContainer");
            }
            viewGroup2.setVisibility(8);
            TextView textView = this.f176255p;
            if (textView == null) {
                C89219l.m154710a("mDraftSize");
            }
            Context context = this.f176241b;
            C78242m mVar10 = this.f176244e;
            if (mVar10 == null) {
                C89219l.m154710a("mData");
            }
            long j = mVar10.f175709f;
            C89219l.m154721d(context, "");
            double d = (double) j;
            Double.isNaN(d);
            String string = context.getString(R.string.fn1, Double.valueOf(d / 1048576.0d));
            C89219l.m154716b(string, "");
            textView.setText(string);
            return;
        }
        ViewGroup viewGroup3 = this.f176253n;
        if (viewGroup3 == null) {
            C89219l.m154710a("mSizeContainer");
        }
        viewGroup3.setVisibility(8);
        C78242m mVar11 = this.f176244e;
        if (mVar11 == null) {
            C89219l.m154710a("mData");
        }
        if (mVar11.f175710g.length() > 0) {
            C78242m mVar12 = this.f176244e;
            if (mVar12 == null) {
                C89219l.m154710a("mData");
            }
            m136961a(mVar12);
        } else {
            TuxTextView tuxTextView4 = this.f176250k;
            if (tuxTextView4 == null) {
                C89219l.m154710a("textBottom");
            }
            tuxTextView4.setVisibility(8);
            ViewGroup viewGroup4 = this.f176251l;
            if (viewGroup4 == null) {
                C89219l.m154710a("mVideoInfoContainer");
            }
            viewGroup4.setVisibility(8);
        }
        ViewGroup viewGroup5 = this.f176251l;
        if (viewGroup5 == null) {
            C89219l.m154710a("mVideoInfoContainer");
        }
        viewGroup5.setOnClickListener(new View$OnClickListenerC78438b(this, mVar2));
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.draft.viewholder.NewDraftViewHolder$a */
    static final class C78437a implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a */
        final /* synthetic */ NewDraftViewHolder f176257a;

        static {
            Covode.recordClassIndex(91565);
        }

        C78437a(NewDraftViewHolder newDraftViewHolder) {
            this.f176257a = newDraftViewHolder;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            NewDraftViewHolder.m136959a(this.f176257a).f175708e = z;
            this.f176257a.f176246g.mo122086a(NewDraftViewHolder.m136959a(this.f176257a), z);
        }
    }

    /* renamed from: a */
    private static Object m136960a(Application application, String str) {
        Object obj;
        MethodCollector.m26663i(7397);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!C58027i.f132247b && "connectivity".equals(str)) {
                try {
                    new C21708b().mo35361a();
                    C58027i.f132247b = true;
                    obj = application.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = application.getSystemService(str);
        } else if (C58027i.f132246a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = application.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new C58027i.HandlerC58028a((Handler) declaredField.get(obj)));
                        } catch (Exception e) {
                            C13849d.m25015a(e, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    C58027i.f132246a = false;
                } finally {
                    MethodCollector.m26664o(7397);
                }
            }
        } else {
            obj = application.getSystemService(str);
        }
        return obj;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NewDraftViewHolder(View view, AbstractC78249a aVar, C78467a aVar2) {
        super(view);
        C89219l.m154721d(view, "");
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(aVar2, "");
        this.f176246g = aVar;
        this.f176247h = aVar2;
        Context context = view.getContext();
        C89219l.m154716b(context, "");
        this.f176241b = context;
        View findViewById = view.findViewById(R.id.acf);
        C89219l.m154716b(findViewById, "");
        this.f176249j = findViewById;
        View findViewById2 = view.findViewById(R.id.f18);
        C89219l.m154716b(findViewById2, "");
        this.f176250k = (TuxTextView) findViewById2;
        View c = C0792v.m2762c(view, (int) R.id.afn);
        C89219l.m154716b(c, "");
        this.f176243d = (SimpleDraweeView) c;
        View findViewById3 = view.findViewById(R.id.f6_);
        C89219l.m154716b(findViewById3, "");
        this.f176248i = (TuxTextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.fcx);
        C89219l.m154716b(findViewById4, "");
        this.f176251l = (ViewGroup) findViewById4;
        View findViewById5 = view.findViewById(R.id.eg0);
        C89219l.m154716b(findViewById5, "");
        this.f176252m = (ViewGroup) findViewById5;
        View c2 = C0792v.m2762c(view, (int) R.id.evf);
        C89219l.m154716b(c2, "");
        this.f176255p = (TextView) c2;
        View c3 = C0792v.m2762c(view, (int) R.id.e1l);
        C89219l.m154716b(c3, "");
        this.f176253n = (ViewGroup) c3;
        View c4 = C0792v.m2762c(view, (int) R.id.a4l);
        C89219l.m154716b(c4, "");
        this.f176242c = (TuxCheckBox) c4;
        View findViewById6 = view.findViewById(R.id.byw);
        C89219l.m154716b(findViewById6, "");
        this.f176254o = (TuxIconView) findViewById6;
        View view2 = this.f176249j;
        if (view2 == null) {
            C89219l.m154710a("mContainer");
        }
        view2.setOnClickListener(new View$OnClickListenerC78440d(this));
        View view3 = this.f176249j;
        if (view3 == null) {
            C89219l.m154710a("mContainer");
        }
        view3.setOnLongClickListener(new View$OnLongClickListenerC78441e(this));
    }
}
