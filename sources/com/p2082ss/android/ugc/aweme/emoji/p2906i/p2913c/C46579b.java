package com.p2082ss.android.ugc.aweme.emoji.p2906i.p2913c;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.widget.EditText;
import android.widget.TextView;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView;
import com.p2082ss.android.ugc.aweme.emoji.p2897b.C46447a;
import com.p2082ss.android.ugc.aweme.emoji.views.C46669a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.ss.android.ugc.aweme.emoji.i.c.b */
public final class C46579b {

    /* renamed from: a */
    public static Pattern f108602a = Pattern.compile("(\\[)([^\\[\\]]+)(])");

    /* renamed from: b */
    private static boolean f108603b = false;

    /* renamed from: c */
    private static C46577a f108604c = new C46577a();

    static {
        Covode.recordClassIndex(55166);
    }

    /* renamed from: a */
    public static int m89897a(String str) {
        int i = 0;
        if (!TextUtils.isEmpty(str)) {
            while (f108602a.matcher(str).find()) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: b */
    public static int m89901b(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        List<String> a = m89898a((Context) null, str);
        if (C13603b.m24435a((Collection) a)) {
            return 0;
        }
        int i = 0;
        for (String str2 : a) {
            i += str2.length();
        }
        if (str.length() > i) {
            return 2;
        }
        if (str.length() == i) {
            return 1;
        }
        return 0;
    }

    /* renamed from: c */
    public static int m89902c(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        try {
            ArrayList arrayList = new ArrayList();
            Matcher matcher = Pattern.compile("(?:[\\uD83C\\uDF00-\\uD83D\\uDDFF]|[\\uD83E\\uDD00-\\uD83E\\uDDFF]|[\\uD83D\\uDE00-\\uD83D\\uDE4F]|[\\uD83D\\uDE80-\\uD83D\\uDEFF]|[\\u2600-\\u26FF]\\uFE0F?|[\\u2700-\\u27BF]\\uFE0F?|\\u24C2\\uFE0F?|[\\uD83C\\uDDE6-\\uD83C\\uDDFF]{1,2}|[\\uD83C\\uDD70\\uD83C\\uDD71\\uD83C\\uDD7E\\uD83C\\uDD7F\\uD83C\\uDD8E\\uD83C\\uDD91-\\uD83C\\uDD9A]\\uFE0F?|[\\u0023\\u002A\\u0030-\\u0039]\\uFE0F?\\u20E3|[\\u2194-\\u2199\\u21A9-\\u21AA]\\uFE0F?|[\\u2B05-\\u2B07\\u2B1B\\u2B1C\\u2B50\\u2B55]\\uFE0F?|[\\u2934\\u2935]\\uFE0F?|[\\u3030\\u303D]\\uFE0F?|[\\u3297\\u3299]\\uFE0F?|[\\uD83C\\uDE01\\uD83C\\uDE02\\uD83C\\uDE1A\\uD83C\\uDE2F\\uD83C\\uDE32-\\uD83C\\uDE3A\\uD83C\\uDE50\\uD83C\\uDE51]\\uFE0F?|[\\u203C\\u2049]\\uFE0F?|[\\u25AA\\u25AB\\u25B6\\u25C0\\u25FB-\\u25FE]\\uFE0F?|[\\u00A9\\u00AE]\\uFE0F?|[\\u2122\\u2139]\\uFE0F?|\\uD83C\\uDC04\\uFE0F?|\\uD83C\\uDCCF\\uFE0F?|[\\u231A\\u231B\\u2328\\u23CF\\u23E9-\\u23F3\\u23F8-\\u23FA]\\uFE0F?)").matcher(str);
            while (matcher.find()) {
                arrayList.add(matcher.group());
            }
            for (int i = 0; i < arrayList.size(); i++) {
                ((String) arrayList.get(i)).length();
            }
            Matcher matcher2 = Pattern.compile("(\\[)([^\\[\\]]+)(])").matcher(str);
            while (matcher2.find()) {
                String group = matcher2.group();
                if (f108604c.mo79102a(C17873f.m33102j(), group) != null) {
                    arrayList.add(group);
                }
            }
            int i2 = 0;
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                i2 += ((String) arrayList.get(i3)).length();
            }
            if (i2 == 0) {
                return 0;
            }
            if (i2 == str.length()) {
                return 1;
            }
            return 2;
        } catch (Exception unused) {
            return 0;
        }
    }

    /* renamed from: a */
    public static void m89899a(TextView textView) {
        int i;
        boolean z;
        if (!f108603b) {
            f108603b = true;
            CharSequence text = textView.getText();
            List<String> a = m89898a(textView.getContext(), text.toString());
            int size = a.size();
            if (TextUtils.isEmpty(text) || size <= 0) {
                f108603b = false;
                return;
            }
            SpannableString spannableString = new SpannableString(text);
            C46669a[] aVarArr = (C46669a[]) spannableString.getSpans(0, text.length(), C46669a.class);
            if (aVarArr != null && aVarArr.length > 0) {
                if (aVarArr.length != size) {
                    z = true;
                } else {
                    z = false;
                }
                int length = aVarArr.length;
                for (int i2 = 0; i2 < length; i2++) {
                    C46669a aVar = aVarArr[i2];
                    spannableString.removeSpan(aVar);
                    if (i2 < size && !z && !TextUtils.equals(aVar.mo79288a(), a.get(i2))) {
                        z = true;
                    }
                }
                if (!z) {
                    f108603b = false;
                    return;
                }
            }
            boolean z2 = textView instanceof EditText;
            if (z2) {
                i = textView.getSelectionStart();
            } else {
                i = 0;
            }
            Matcher matcher = f108602a.matcher(text);
            while (matcher.find()) {
                int start = matcher.start();
                int end = matcher.end();
                String group = matcher.group();
                Drawable a2 = f108604c.mo79102a(textView.getContext(), group);
                if (a2 != null) {
                    int lineHeight = textView.getLineHeight();
                    a2.setBounds(0, 0, (int) ((((float) lineHeight) * ((((float) a2.getIntrinsicWidth()) + 0.0f) / ((float) a2.getIntrinsicHeight()))) + 0.5f), lineHeight);
                    spannableString.setSpan(new C46669a(a2, Integer.valueOf(end - start), group), start, end, 33);
                    if (i > start && i < end && z2) {
                        ((EditText) textView).setSelection(end);
                    }
                }
            }
            if (z2) {
                Editable editableText = textView.getEditableText();
                if (editableText != null) {
                    editableText.replace(0, text.length(), spannableString);
                }
            } else {
                textView.setText(spannableString);
            }
            f108603b = false;
        }
    }

    /* renamed from: a */
    public static void m89900a(RemoteImageView remoteImageView, C46447a aVar) {
        f108604c.mo79104a(remoteImageView, aVar);
    }

    /* renamed from: a */
    public static List<String> m89898a(Context context, String str) {
        if ((context == null && (context = C17873f.m33102j()) == null) || TextUtils.isEmpty(str)) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Matcher matcher = f108602a.matcher(str);
        while (matcher.find()) {
            String group = matcher.group();
            if (f108604c.mo79102a(context, group) != null) {
                arrayList.add(group);
            }
        }
        return arrayList;
    }
}
