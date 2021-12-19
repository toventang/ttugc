package com.p2082ss.android.ugc.aweme.social.p3917d;

import android.os.Build;
import android.os.Looper;
import android.os.SystemClock;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextUtils;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.social.d.a */
public final class C74724a {
    static {
        Covode.recordClassIndex(87561);
    }

    /* renamed from: com.ss.android.ugc.aweme.social.d.a$c */
    public static final class CallableC74728c<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ TuxTextView f167964a;

        /* renamed from: b */
        final /* synthetic */ String f167965b;

        /* renamed from: c */
        final /* synthetic */ String f167966c;

        /* renamed from: d */
        final /* synthetic */ int f167967d;

        /* renamed from: e */
        final /* synthetic */ C74726b f167968e;

        static {
            Covode.recordClassIndex(87565);
        }

        public CallableC74728c(TuxTextView tuxTextView, String str, String str2, int i, C74726b bVar) {
            this.f167964a = tuxTextView;
            this.f167965b = str;
            this.f167966c = str2;
            this.f167967d = i;
            this.f167968e = bVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            ArrayList arrayList;
            TuxTextView tuxTextView = this.f167964a;
            String str = this.f167965b;
            String str2 = this.f167966c;
            int i = this.f167967d;
            if (TextUtils.isEmpty(str2)) {
                arrayList = null;
            } else {
                ArrayList<String> arrayList2 = new ArrayList();
                Matcher matcher = Pattern.compile("(?:[\\uD83C\\uDF00-\\uD83D\\uDDFF]|[\\uD83E\\uDD00-\\uD83E\\uDDFF]|[\\uD83D\\uDE00-\\uD83D\\uDE4F]|[\\uD83D\\uDE80-\\uD83D\\uDEFF]|[\\u2600-\\u26FF]\\uFE0F?|[\\u2700-\\u27BF]\\uFE0F?|\\u24C2\\uFE0F?|[\\uD83C\\uDDE6-\\uD83C\\uDDFF]{1,2}|[\\uD83C\\uDD70\\uD83C\\uDD71\\uD83C\\uDD7E\\uD83C\\uDD7F\\uD83C\\uDD8E\\uD83C\\uDD91-\\uD83C\\uDD9A]\\uFE0F?|[\\u0023\\u002A\\u0030-\\u0039]\\uFE0F?\\u20E3|[\\u2194-\\u2199\\u21A9-\\u21AA]\\uFE0F?|[\\u2B05-\\u2B07\\u2B1B\\u2B1C\\u2B50\\u2B55]\\uFE0F?|[\\u2934\\u2935]\\uFE0F?|[\\u3030\\u303D]\\uFE0F?|[\\u3297\\u3299]\\uFE0F?|[\\uD83C\\uDE01\\uD83C\\uDE02\\uD83C\\uDE1A\\uD83C\\uDE2F\\uD83C\\uDE32-\\uD83C\\uDE3A\\uD83C\\uDE50\\uD83C\\uDE51]\\uFE0F?|[\\u203C\\u2049]\\uFE0F?|[\\u25AA\\u25AB\\u25B6\\u25C0\\u25FB-\\u25FE]\\uFE0F?|[\\u00A9\\u00AE]\\uFE0F?|[\\u2122\\u2139]\\uFE0F?|\\uD83C\\uDC04\\uFE0F?|\\uD83C\\uDCCF\\uFE0F?|[\\u231A\\u231B\\u2328\\u23CF\\u23E9-\\u23F3\\u23F8-\\u23FA]\\uFE0F?)").matcher(str2);
                while (matcher.find()) {
                    arrayList2.add(matcher.group());
                }
                StringBuilder sb = new StringBuilder(str2);
                arrayList = new ArrayList();
                for (String str3 : arrayList2) {
                    int indexOf = sb.indexOf(str3);
                    int length = str3.length() + indexOf;
                    arrayList.add(new int[]{indexOf, length});
                    sb.delete(0, length);
                }
            }
            C89219l.m154716b(arrayList, "");
            C74725a aVar = new C74725a(arrayList);
            int length2 = str2.length() - 1;
            while (true) {
                if (length2 < 0) {
                    break;
                }
                if (!aVar.mo117771a(length2)) {
                    StringBuilder sb2 = new StringBuilder();
                    Objects.requireNonNull(str2, "null cannot be cast to non-null type java.lang.String");
                    String substring = str2.substring(0, length2);
                    C89219l.m154716b(substring, "");
                    String a = C1764a.m5928a(str, Arrays.copyOf(new Object[]{sb2.append(substring).append("…").toString()}, 1));
                    C89219l.m154716b(a, "");
                    if (!C74724a.m131182a(tuxTextView, a, i)) {
                        str = a;
                        break;
                    }
                }
                length2--;
            }
            this.f167968e.mo117772a(str);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.social.d.a$a */
    static final class C74725a extends AbstractC89220m implements AbstractC89172b<Integer, Boolean> {

        /* renamed from: a */
        final /* synthetic */ List f167959a;

        static {
            Covode.recordClassIndex(87562);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C74725a(List list) {
            super(1);
            this.f167959a = list;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Boolean invoke(Integer num) {
            return Boolean.valueOf(mo117771a(num.intValue()));
        }

        /* renamed from: a */
        public final boolean mo117771a(int i) {
            for (int[] iArr : this.f167959a) {
                if (iArr.length >= 2) {
                    int i2 = iArr[0];
                    int i3 = iArr[1];
                    if (i2 <= i && i3 >= i) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.social.d.a$b */
    public static final class C74726b extends AbstractC89220m implements AbstractC89172b<CharSequence, C89391z> {

        /* renamed from: a */
        final /* synthetic */ TuxTextView f167960a;

        /* renamed from: b */
        final /* synthetic */ long f167961b;

        static {
            Covode.recordClassIndex(87563);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C74726b(TuxTextView tuxTextView, long j) {
            super(1);
            this.f167960a = tuxTextView;
            this.f167961b = j;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(CharSequence charSequence) {
            mo117772a(charSequence);
            return C89391z.f203057a;
        }

        /* renamed from: a */
        public final void mo117772a(final CharSequence charSequence) {
            C89219l.m154721d(charSequence, "");
            new StringBuilder("final set text: ").append(charSequence).append(". cost: ").append(SystemClock.uptimeMillis() - this.f167961b);
            if (C89219l.m154714a(Looper.myLooper(), Looper.getMainLooper())) {
                this.f167960a.setText(charSequence);
            } else {
                this.f167960a.post(new Runnable(this) {
                    /* class com.p2082ss.android.ugc.aweme.social.p3917d.C74724a.C74726b.RunnableC747271 */

                    /* renamed from: a */
                    final /* synthetic */ C74726b f167962a;

                    static {
                        Covode.recordClassIndex(87564);
                    }

                    {
                        this.f167962a = r1;
                    }

                    public final void run() {
                        this.f167962a.f167960a.setText(charSequence);
                    }
                });
            }
        }
    }

    /* renamed from: a */
    public static final boolean m131182a(TuxTextView tuxTextView, String str, int i) {
        TextDirectionHeuristic textDirectionHeuristic;
        int maxLines;
        StaticLayout build;
        if (Build.VERSION.SDK_INT < 23) {
            build = new StaticLayout(str, tuxTextView.getPaint(), i, Layout.Alignment.ALIGN_NORMAL, tuxTextView.getLineSpacingMultiplier(), tuxTextView.getLineSpacingExtra(), tuxTextView.getIncludeFontPadding());
        } else {
            if (Build.VERSION.SDK_INT >= 29) {
                textDirectionHeuristic = tuxTextView.getTextDirectionHeuristic();
            } else {
                textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
            }
            StaticLayout.Builder hyphenationFrequency = StaticLayout.Builder.obtain(str, 0, str.length(), tuxTextView.getPaint(), i).setLineSpacing(tuxTextView.getLineSpacingExtra(), tuxTextView.getLineSpacingMultiplier()).setIncludePad(tuxTextView.getIncludeFontPadding()).setBreakStrategy(tuxTextView.getBreakStrategy()).setHyphenationFrequency(tuxTextView.getHyphenationFrequency());
            if (tuxTextView.getMaxLines() == -1) {
                maxLines = Integer.MAX_VALUE;
            } else {
                maxLines = tuxTextView.getMaxLines();
            }
            build = hyphenationFrequency.setMaxLines(maxLines).setTextDirection(textDirectionHeuristic).build();
            C89219l.m154716b(build, "");
        }
        if (tuxTextView.getMaxLines() == -1 || (build.getLineCount() <= tuxTextView.getMaxLines() && build.getLineEnd(build.getLineCount() - 1) == str.length())) {
            return false;
        }
        return true;
    }
}
