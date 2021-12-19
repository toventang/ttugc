package com.p2082ss.android.ugc.aweme.trending.p4149ui;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextSwitcher;
import android.widget.ViewSwitcher;
import androidx.core.content.C0643b;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.search.C67590l;
import com.p2082ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;
import java.util.List;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.trending.ui.TrendingTitleSwitcher */
public final class TrendingTitleSwitcher implements AbstractC33974au {

    /* renamed from: g */
    private static final C79072a f177722g = new C79072a((byte) 0);

    /* renamed from: a */
    int f177723a;

    /* renamed from: b */
    public final TextSwitcher f177724b;

    /* renamed from: c */
    final AbstractC1204m f177725c;

    /* renamed from: d */
    final List<C67590l> f177726d;

    /* renamed from: e */
    private final AbstractC89244h f177727e = C89250i.m154773a((AbstractC89171a) new C79075c(this));

    /* renamed from: f */
    private final AbstractC89183m<String, Integer, C89391z> f177728f;

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.trending.ui.TrendingTitleSwitcher$b */
    public static final class HandlerC79073b extends Handler {

        /* renamed from: b */
        private static final C79074a f177729b = new C79074a((byte) 0);

        /* renamed from: a */
        private final WeakReference<TrendingTitleSwitcher> f177730a;

        static {
            Covode.recordClassIndex(92254);
        }

        /* renamed from: com.ss.android.ugc.aweme.trending.ui.TrendingTitleSwitcher$b$a */
        static final class C79074a {
            static {
                Covode.recordClassIndex(92255);
            }

            private C79074a() {
            }

            public /* synthetic */ C79074a(byte b) {
                this();
            }
        }

        /* renamed from: a */
        public final void mo122889a() {
            if (!hasMessages(101)) {
                removeMessages(101);
                sendEmptyMessageDelayed(101, 3000);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public HandlerC79073b(TrendingTitleSwitcher trendingTitleSwitcher) {
            super(Looper.getMainLooper());
            C89219l.m154721d(trendingTitleSwitcher, "");
            this.f177730a = new WeakReference<>(trendingTitleSwitcher);
        }

        public final void handleMessage(Message message) {
            C89219l.m154721d(message, "");
            if (message.what == 101) {
                TrendingTitleSwitcher trendingTitleSwitcher = this.f177730a.get();
                if (trendingTitleSwitcher != null) {
                    int i = 0;
                    if (trendingTitleSwitcher.f177723a + 1 >= trendingTitleSwitcher.f177726d.size()) {
                        trendingTitleSwitcher.f177723a = 0;
                    } else {
                        trendingTitleSwitcher.f177723a++;
                        i = trendingTitleSwitcher.f177723a;
                    }
                    trendingTitleSwitcher.mo122886a(i, true);
                }
                sendEmptyMessageDelayed(101, 3000);
            }
        }
    }

    static {
        Covode.recordClassIndex(92252);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final HandlerC79073b mo122885a() {
        return (HandlerC79073b) this.f177727e.getValue();
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        if (aVar == AbstractC1196i.EnumC1198a.ON_START) {
            onStart();
        } else if (aVar == AbstractC1196i.EnumC1198a.ON_STOP) {
            onStop();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.trending.ui.TrendingTitleSwitcher$a */
    static final class C79072a {
        static {
            Covode.recordClassIndex(92253);
        }

        private C79072a() {
        }

        public /* synthetic */ C79072a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.trending.ui.TrendingTitleSwitcher$c */
    static final class C79075c extends AbstractC89220m implements AbstractC89171a<HandlerC79073b> {

        /* renamed from: a */
        final /* synthetic */ TrendingTitleSwitcher f177731a;

        static {
            Covode.recordClassIndex(92256);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C79075c(TrendingTitleSwitcher trendingTitleSwitcher) {
            super(0);
            this.f177731a = trendingTitleSwitcher;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ HandlerC79073b invoke() {
            return new HandlerC79073b(this.f177731a);
        }
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_START)
    public final void onStart() {
        mo122885a().mo122889a();
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_STOP)
    public final void onStop() {
        mo122885a().removeCallbacksAndMessages(null);
    }

    /* renamed from: com.ss.android.ugc.aweme.trending.ui.TrendingTitleSwitcher$d */
    static final class C79076d implements ViewSwitcher.ViewFactory {

        /* renamed from: a */
        final /* synthetic */ TrendingTitleSwitcher f177732a;

        static {
            Covode.recordClassIndex(92257);
        }

        C79076d(TrendingTitleSwitcher trendingTitleSwitcher) {
            this.f177732a = trendingTitleSwitcher;
        }

        public final View makeView() {
            Context context = this.f177732a.f177724b.getContext();
            Context context2 = this.f177732a.f177724b.getContext();
            C89219l.m154716b(context2, "");
            TuxTextView tuxTextView = new TuxTextView(context2, null, 0, 6);
            tuxTextView.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
            tuxTextView.setMaxLines(1);
            tuxTextView.setGravity(8388611);
            tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
            tuxTextView.setTextDirection(2);
            tuxTextView.setTextAlignment(5);
            tuxTextView.setTextColor(C0643b.m2378c(context, R.color.a9));
            tuxTextView.setTuxFont(62);
            return tuxTextView;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo122886a(int i, boolean z) {
        int size = this.f177726d.size();
        if (i >= 0 && size > i) {
            String trendingName = this.f177726d.get(i).getTrendingName();
            if (z) {
                this.f177724b.setText(trendingName);
            } else {
                this.f177724b.setCurrentText(trendingName);
            }
            AbstractC89183m<String, Integer, C89391z> mVar = this.f177728f;
            if (mVar != null) {
                if (trendingName == null) {
                    trendingName = "";
                }
                mVar.invoke(trendingName, Integer.valueOf(i));
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: h.f.a.m<? super java.lang.String, ? super java.lang.Integer, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    public TrendingTitleSwitcher(TextSwitcher textSwitcher, AbstractC1204m mVar, List<C67590l> list, AbstractC89183m<? super String, ? super Integer, C89391z> mVar2) {
        C89219l.m154721d(textSwitcher, "");
        C89219l.m154721d(list, "");
        this.f177724b = textSwitcher;
        this.f177725c = mVar;
        this.f177726d = list;
        this.f177728f = mVar2;
    }
}
