package com.p2082ss.android.ugc.aweme.editSticker.text.bean;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Rect;
import android.widget.EditText;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2019b.C27895a;
import com.p2082ss.android.ugc.aweme.editSticker.AbstractC45891h;
import com.p2082ss.android.ugc.aweme.editSticker.C45866d;
import com.p2082ss.android.ugc.aweme.sticker.data.CreateAnchorInfo;
import com.p2082ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.p2082ss.android.ugc.aweme.sticker.data.TextStruct;
import com.p2082ss.android.ugc.tools.utils.C84912r;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import org.json.JSONObject;
import p4600h.p4601a.C89070n;
import p4600h.p4602b.C89090a;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.editSticker.text.bean.t */
public final class C46110t {

    /* renamed from: a */
    public static int f107370a;

    static {
        Covode.recordClassIndex(54668);
    }

    /* renamed from: com.ss.android.ugc.aweme.editSticker.text.bean.t$b */
    public static final class C46112b extends C27895a<HashMap<String, String>> {
        static {
            Covode.recordClassIndex(54670);
        }

        C46112b() {
        }
    }

    /* renamed from: a */
    public static final boolean m88965a(List<InteractTextStructWrap> list, int i) {
        if (list == null || list.isEmpty()) {
            return false;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            if (next.isValid(i)) {
                if (next != null) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public static final float m88956a(Context context) {
        C89219l.m154721d(context, "");
        return C84912r.m145930a(context, 4.0f);
    }

    /* renamed from: a */
    public static final List<TextStickerTextWrap> m88961a(String str) {
        return C89070n.m154525d(m88959a(str, false));
    }

    /* renamed from: e */
    public static final boolean m88969e(List<TextStickerTextWrap> list) {
        if (list == null) {
            return false;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            if (next.isValid()) {
                if (next != null) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: f */
    public static final List<CreateAnchorInfo> m88970f(List<TextStickerTextWrap> list) {
        ArrayList arrayList = new ArrayList();
        if (list == null) {
            return new ArrayList();
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.addAll(it.next().getAnchorInfoList());
        }
        return arrayList;
    }

    /* renamed from: g */
    public static final boolean m88971g(List<TextStickerTextWrap> list) {
        if (list == null) {
            return false;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            if (!next.safeStrPair().f107314b.isEmpty()) {
                if (next != null) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: h */
    public static final boolean m88972h(List<TextStickerTextWrap> list) {
        C89219l.m154721d(list, "");
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            String str = next.safeStrPair().f107313a;
            Objects.requireNonNull(str, "null cannot be cast to non-null type kotlin.CharSequence");
            if (C89361p.m154910b((CharSequence) str).toString().length() > 0) {
                if (next != null) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: i */
    public static final String m88973i(List<TextStickerTextWrap> list) {
        if (list == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder("");
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            sb.append(it.next().getText());
        }
        String sb2 = sb.toString();
        C89219l.m154716b(sb2, "");
        return sb2;
    }

    /* renamed from: a */
    public static final TextStickerTextWrap m88960a(String[] strArr) {
        if (strArr == null || strArr.length == 0) {
            return new TextStickerTextWrap(null, null, 0, false, false, 31, null);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        StringBuilder sb = new StringBuilder();
        for (String str : strArr) {
            sb.append(str);
            linkedHashMap.put(new TextStickerString(str), new ArrayList());
        }
        String sb2 = sb.toString();
        C89219l.m154716b(sb2, "");
        return new TextStickerTextWrap(linkedHashMap, new TextStickerTextPair(sb2, new ArrayList()), 0, false, false, 28, null);
    }

    /* renamed from: b */
    public static final TextStickerString[] m88966b(List<TextStickerTextWrap> list) {
        if (list == null || list.isEmpty()) {
            return new TextStickerString[0];
        }
        if (list.size() == 1) {
            Object[] array = list.get(0).getStrMap().keySet().toArray(new TextStickerString[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            return (TextStickerString[]) array;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            T t = next;
            if (!t.isReplaceString()) {
                String text = t.getText();
                Objects.requireNonNull(text, "null cannot be cast to non-null type kotlin.CharSequence");
                if (C89361p.m154910b((CharSequence) text).toString().length() > 0) {
                    if (next != null) {
                        ArrayList arrayList = new ArrayList();
                        ArrayList<TextStickerTextWrap> arrayList2 = new ArrayList();
                        for (T t2 : list) {
                            T t3 = t2;
                            if (!t3.isReplaceString()) {
                                String text2 = t3.getText();
                                Objects.requireNonNull(text2, "null cannot be cast to non-null type kotlin.CharSequence");
                                if (C89361p.m154910b((CharSequence) text2).toString().length() > 0) {
                                    arrayList2.add(t2);
                                }
                            }
                        }
                        for (TextStickerTextWrap textStickerTextWrap : arrayList2) {
                            arrayList.addAll(textStickerTextWrap.getStrMap().keySet());
                        }
                        Object[] array2 = arrayList.toArray(new TextStickerString[0]);
                        Objects.requireNonNull(array2, "null cannot be cast to non-null type kotlin.Array<T>");
                        return (TextStickerString[]) array2;
                    }
                }
            }
        }
        Object[] array3 = list.get(0).getStrMap().keySet().toArray(new TextStickerString[0]);
        Objects.requireNonNull(array3, "null cannot be cast to non-null type kotlin.Array<T>");
        return (TextStickerString[]) array3;
    }

    /* renamed from: c */
    public static final String m88967c(List<TextStickerTextWrap> list) {
        boolean z;
        int i = 0;
        if (list == null || list.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return "";
        }
        ArrayList arrayList = new ArrayList();
        for (T t : list) {
            if (t.isValid()) {
                arrayList.add(t);
            }
        }
        ArrayList arrayList2 = arrayList;
        if (!(!arrayList2.isEmpty()) || arrayList2 == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder("");
        if (arrayList2.size() > 1) {
            int size = arrayList2.size() - 2;
            if (size >= 0) {
                while (true) {
                    sb.append(((TextStickerTextWrap) arrayList2.get(i)).safeStrPair().f107313a);
                    sb.append("\n");
                    if (i == size) {
                        break;
                    }
                    i++;
                }
            }
            sb.append(((TextStickerTextWrap) arrayList2.get(arrayList2.size() - 1)).safeStrPair().f107313a);
        } else {
            sb.append(((TextStickerTextWrap) arrayList2.get(0)).safeStrPair().f107313a);
        }
        String sb2 = sb.toString();
        C89219l.m154716b(sb2, "");
        return sb2;
    }

    /* renamed from: d */
    public static final List<InteractTextStructWrap> m88968d(List<TextStickerTextWrap> list) {
        if (list == null || list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (T t : list) {
            if (t.isValid()) {
                arrayList.add(t);
            }
        }
        ArrayList arrayList2 = arrayList;
        if (!(!arrayList2.isEmpty()) || arrayList2 == null) {
            return new ArrayList();
        }
        if (arrayList2.size() == 1) {
            return ((TextStickerTextWrap) arrayList2.get(0)).safeStrPair().f107314b;
        }
        int size = arrayList2.size();
        for (int i = 1; i < size; i++) {
            for (T t2 : ((TextStickerTextWrap) arrayList2.get(i)).safeStrPair().f107314b) {
                t2.getRange().getStart();
                t2.getRange().getEnd();
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            C89070n.m154535a((Collection) arrayList3, (Iterable) it.next().safeStrPair().f107314b);
        }
        return arrayList3;
    }

    /* renamed from: j */
    public static final List<CreateAnchorInfo> m88974j(List<? extends InteractStickerStruct> list) {
        boolean z;
        TextStruct textStruct;
        List<CreateAnchorInfo> list2;
        ArrayList<CreateAnchorInfo> arrayList = new ArrayList();
        if (list == null) {
            return arrayList;
        }
        ArrayList<InteractStickerStruct> arrayList2 = new ArrayList();
        Iterator<T> it = list.iterator();
        while (true) {
            boolean z2 = true;
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            if (next.getType() != 5) {
                z2 = false;
            }
            if (z2) {
                arrayList2.add(next);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (InteractStickerStruct interactStickerStruct : arrayList2) {
            try {
                textStruct = (TextStruct) C45866d.m88489b().mo46670a(interactStickerStruct.getTextStruct(), TextStruct.class);
            } catch (Exception unused) {
                textStruct = null;
            }
            if (textStruct == null || (list2 = textStruct.getAnchors()) == null) {
                list2 = new ArrayList<>();
            }
            C89070n.m154535a((Collection) arrayList3, (Iterable) list2);
        }
        arrayList.addAll(arrayList3);
        for (CreateAnchorInfo createAnchorInfo : arrayList) {
            String iconUrl = createAnchorInfo.getIconUrl();
            if (iconUrl == null || iconUrl.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                createAnchorInfo.setIconUrl("https://p16.tiktokcdn.com/obj/tiktok-obj/wiki_anchor_new.png");
                createAnchorInfo.setAddTime(0L);
            }
        }
        return arrayList;
    }

    /* renamed from: k */
    public static final List<CreateAnchorInfo> m88975k(List<? extends InteractStickerStruct> list) {
        Exception e;
        String str;
        String str2;
        long j;
        boolean z;
        ArrayList arrayList = new ArrayList();
        if (list == null) {
            return arrayList;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("add_from", 1);
        String jSONObject2 = jSONObject.toString();
        C89219l.m154716b(jSONObject2, "");
        ArrayList<InteractStickerStruct> arrayList2 = new ArrayList();
        Iterator<T> it = list.iterator();
        while (true) {
            boolean z2 = false;
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            if (next.getType() == 6) {
                z2 = true;
            }
            if (z2) {
                arrayList2.add(next);
            }
        }
        for (InteractStickerStruct interactStickerStruct : arrayList2) {
            try {
                Object a = C45866d.m88489b().mo46671a(interactStickerStruct.getAttr(), new C46112b().type);
                C89219l.m154716b(a, "");
                HashMap hashMap = (HashMap) a;
                if (hashMap.get("donation_name") instanceof String) {
                    Object obj = hashMap.get("donation_name");
                    if (obj != null) {
                        str = (String) obj;
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                    }
                } else {
                    str = "";
                }
                if (hashMap.get("donation_url") instanceof String) {
                    Object obj2 = hashMap.get("donation_url");
                    if (obj2 != null) {
                        str2 = (String) obj2;
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                    }
                } else {
                    str2 = "";
                }
                if (hashMap.get("add_anchor_time") instanceof String) {
                    Object obj3 = hashMap.get("add_anchor_time");
                    if (obj3 != null) {
                        if (((String) obj3).length() > 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            Object obj4 = hashMap.get("add_anchor_time");
                            if (obj4 != null) {
                                j = Long.parseLong((String) obj4);
                                arrayList.add(new CreateAnchorInfo(19, str, str2, "", jSONObject2, "https://p16.tiktokcdn.com/obj/tiktok-obj/who3x.png", Long.valueOf(j), null, null, null, null, null, 3968, null));
                            } else {
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                            }
                        }
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                    }
                }
                j = 0;
                try {
                    arrayList.add(new CreateAnchorInfo(19, str, str2, "", jSONObject2, "https://p16.tiktokcdn.com/obj/tiktok-obj/who3x.png", Long.valueOf(j), null, null, null, null, null, 3968, null));
                } catch (Exception e2) {
                    e = e2;
                }
            } catch (Exception e3) {
                e = e3;
                AbstractC45891h d = C45866d.m88491d();
                if (d != null) {
                    d.mo77253b(e.getMessage());
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static final boolean m88964a(List<TextStickerTextWrap> list) {
        if (list == null || list.isEmpty()) {
            return false;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            if (!next.isReplaceString()) {
                if (next != null) {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.editSticker.text.bean.t$a */
    public static final class C46111a<T> implements Comparator {
        static {
            Covode.recordClassIndex(54669);
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return C89090a.m154604a(Integer.valueOf(t.getRange().getStart()), Integer.valueOf(t2.getRange().getStart()));
        }
    }

    /* renamed from: a */
    public static final TextStickerTextWrap m88959a(String str, boolean z) {
        if (str == null || str.length() == 0) {
            return new TextStickerTextWrap(null, null, 0, false, false, 31, null);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(new TextStickerString(str), new ArrayList());
        return new TextStickerTextWrap(linkedHashMap, new TextStickerTextPair(str, new ArrayList()), 0, false, z, 12, null);
    }

    /* renamed from: a */
    public static final TextStickerTextWrap m88958a(EditText editText, List<InteractTextStructWrap> list) {
        if (editText == null) {
            return new TextStickerTextWrap(null, null, 0, false, false, 31, null);
        }
        String obj = editText.getText().toString();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int lineCount = editText.getLineCount();
        int i = 0;
        int i2 = 0;
        while (i < lineCount) {
            int lineEnd = editText.getLayout().getLineEnd(i);
            Objects.requireNonNull(obj, "null cannot be cast to non-null type java.lang.String");
            String substring = obj.substring(i2, lineEnd);
            C89219l.m154716b(substring, "");
            TextStickerString textStickerString = new TextStickerString(substring);
            ArrayList arrayList = new ArrayList();
            if (list != null) {
                for (T t : list) {
                    if (t.getRange().getStart() < lineEnd && t.getRange().getEnd() > i2) {
                        if (i2 >= t.getRange().getStart() && lineEnd <= t.getRange().getEnd()) {
                            arrayList.add(new InteractTextStructWrap(new TextStickerTextUnderlineIndexRange(i2 - i2, lineEnd - i2), CreateAnchorInfo.copy$default(t.getStruct(), 0, null, null, null, null, null, null, null, null, null, null, null, 4095, null)));
                        } else if (i2 >= t.getRange().getStart() && lineEnd > t.getRange().getEnd()) {
                            arrayList.add(new InteractTextStructWrap(new TextStickerTextUnderlineIndexRange(i2 - i2, t.getRange().getEnd() - i2), CreateAnchorInfo.copy$default(t.getStruct(), 0, null, null, null, null, null, null, null, null, null, null, null, 4095, null)));
                        } else if (i2 < t.getRange().getStart() && lineEnd <= t.getRange().getEnd()) {
                            arrayList.add(new InteractTextStructWrap(new TextStickerTextUnderlineIndexRange(t.getRange().getStart() - i2, lineEnd - i2), CreateAnchorInfo.copy$default(t.getStruct(), 0, null, null, null, null, null, null, null, null, null, null, null, 4095, null)));
                        } else if (i2 < t.getRange().getStart() && lineEnd > t.getRange().getEnd()) {
                            arrayList.add(new InteractTextStructWrap(new TextStickerTextUnderlineIndexRange(t.getRange().getStart() - i2, t.getRange().getEnd() - i2), CreateAnchorInfo.copy$default(t.getStruct(), 0, null, null, null, null, null, null, null, null, null, null, null, 4095, null)));
                        }
                    }
                }
            }
            if (arrayList.size() > 1) {
                C89070n.m154530a((List) arrayList, (Comparator) new C46111a());
            }
            linkedHashMap.put(textStickerString, arrayList);
            editText.getLayout().getLineBounds(i, new Rect());
            i++;
            i2 = lineEnd;
        }
        ArrayList arrayList2 = new ArrayList();
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(InteractTextStructWrap.copy$default(it.next(), null, null, 3, null));
            }
        }
        return new TextStickerTextWrap(linkedHashMap, new TextStickerTextPair(obj, arrayList2), editText.getSelectionStart(), editText.hasFocus(), false, 16, null);
    }

    /* renamed from: a */
    public static final void m88963a(List<InteractTextStructWrap> list, InteractTextStructWrap interactTextStructWrap) {
        if (list.remove(interactTextStructWrap)) {
            int end = interactTextStructWrap.getRange().getEnd() - interactTextStructWrap.getRange().getStart();
            for (T t : list) {
                if (t.getRange().getStart() >= interactTextStructWrap.getRange().getEnd()) {
                    TextStickerTextUnderlineIndexRange range = t.getRange();
                    range.setStart(range.getStart() - end);
                    TextStickerTextUnderlineIndexRange range2 = t.getRange();
                    range2.setEnd(range2.getEnd() - end);
                }
            }
        }
    }

    /* renamed from: a */
    public static final void m88962a(List<InteractTextStructWrap> list, int i, int i2) {
        if (list != null) {
            for (T t : list) {
                if (t.getRange().getStart() >= i && i2 != 0) {
                    TextStickerTextUnderlineIndexRange range = t.getRange();
                    range.setStart(range.getStart() + i2);
                    TextStickerTextUnderlineIndexRange range2 = t.getRange();
                    range2.setEnd(range2.getEnd() + i2);
                }
            }
        }
    }

    /* renamed from: a */
    public static final int m88957a(Paint paint, String str, int i, int i2) {
        C89219l.m154721d(paint, "");
        if (str == null || str.length() == 0 || i < 0 || i2 > str.length() || i >= i2) {
            return 0;
        }
        Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
        String substring = str.substring(i, i2);
        C89219l.m154716b(substring, "");
        int length = substring.length();
        float[] fArr = new float[length];
        paint.getTextWidths(substring, fArr);
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4++) {
            i3 += (int) Math.ceil((double) fArr[i4]);
        }
        return i3;
    }
}
