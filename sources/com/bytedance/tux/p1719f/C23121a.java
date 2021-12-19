package com.bytedance.tux.p1719f;

import android.text.Editable;
import android.text.Html;
import android.text.Spannable;
import android.text.style.CharacterStyle;
import com.bytedance.covode.number.Covode;
import java.util.List;
import org.xml.sax.XMLReader;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.bytedance.tux.f.a */
public final class C23121a {

    /* renamed from: a */
    public static final C23122a f54732a = new C23122a((byte) 0);

    static {
        Covode.recordClassIndex(27050);
    }

    /* renamed from: com.bytedance.tux.f.a$a */
    public static final class C23122a {
        static {
            Covode.recordClassIndex(27051);
        }

        private C23122a() {
        }

        public /* synthetic */ C23122a(byte b) {
            this();
        }

        /* renamed from: com.bytedance.tux.f.a$a$a */
        public static final class C23123a implements Html.TagHandler {

            /* renamed from: a */
            private final Spannable[] f54733a;

            static {
                Covode.recordClassIndex(27052);
            }

            public C23123a(Spannable[] spannableArr) {
                C89219l.m154719c(spannableArr, "");
                this.f54733a = spannableArr;
            }

            public final void handleTag(boolean z, String str, Editable editable, XMLReader xMLReader) {
                C89219l.m154719c(str, "");
                C89219l.m154719c(editable, "");
                C89219l.m154719c(xMLReader, "");
                if (C89361p.m154874b(str, "tux-span-", false) && !z) {
                    Integer valueOf = Integer.valueOf((String) C89070n.m154586h((List) C89361p.m154915b(str, new String[]{"-"})));
                    Spannable[] spannableArr = this.f54733a;
                    C89219l.m154709a((Object) valueOf, "");
                    Spannable spannable = spannableArr[valueOf.intValue()];
                    CharacterStyle[] characterStyleArr = (CharacterStyle[]) spannable.getSpans(0, spannable.length(), CharacterStyle.class);
                    C89219l.m154709a((Object) characterStyleArr, "");
                    for (CharacterStyle characterStyle : characterStyleArr) {
                        int spanStart = spannable.getSpanStart(characterStyle);
                        int spanEnd = spannable.getSpanEnd(characterStyle);
                        if (editable.getSpanStart(characterStyle) < 0) {
                            int length = editable.length() - spannable.length();
                            editable.setSpan(characterStyle, spanStart + length, spanEnd + length, spannable.getSpanFlags(characterStyle));
                        }
                    }
                }
            }
        }
    }
}
