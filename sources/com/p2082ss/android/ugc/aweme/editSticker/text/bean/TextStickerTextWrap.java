package com.p2082ss.android.ugc.aweme.editSticker.text.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73991bj;
import com.p2082ss.android.ugc.aweme.sticker.data.CreateAnchorInfo;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import p4600h.C89378p;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerTextWrap */
public final class TextStickerTextWrap implements Parcelable, Cloneable {
    public static final Parcelable.Creator<TextStickerTextWrap> CREATOR = new C46078a();
    private final boolean hasFocus;
    private final boolean isReplaceString;
    private final int selectionStart;
    private final Map<TextStickerString, List<InteractTextStructWrap>> strMap;
    private final TextStickerTextPair strPair;

    static {
        Covode.recordClassIndex(54635);
    }

    public TextStickerTextWrap() {
        this(null, null, 0, false, false, 31, null);
    }

    /* renamed from: com_ss_android_ugc_aweme_editSticker_text_bean_TextStickerTextWrap_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m88935x17d757bf(int i) {
        return i;
    }

    private final TextStickerTextPair component2() {
        return this.strPair;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerTextWrap */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TextStickerTextWrap copy$default(TextStickerTextWrap textStickerTextWrap, Map map, TextStickerTextPair textStickerTextPair, int i, boolean z, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            map = textStickerTextWrap.strMap;
        }
        if ((i2 & 2) != 0) {
            textStickerTextPair = textStickerTextWrap.strPair;
        }
        if ((i2 & 4) != 0) {
            i = textStickerTextWrap.selectionStart;
        }
        if ((i2 & 8) != 0) {
            z = textStickerTextWrap.hasFocus;
        }
        if ((i2 & 16) != 0) {
            z2 = textStickerTextWrap.isReplaceString;
        }
        return textStickerTextWrap.copy(map, textStickerTextPair, i, z, z2);
    }

    public final Map<TextStickerString, List<InteractTextStructWrap>> component1() {
        return this.strMap;
    }

    public final int component3() {
        return this.selectionStart;
    }

    public final boolean component4() {
        return this.hasFocus;
    }

    public final boolean component5() {
        return this.isReplaceString;
    }

    public final TextStickerTextWrap copy(Map<TextStickerString, ? extends List<InteractTextStructWrap>> map, TextStickerTextPair textStickerTextPair, int i, boolean z, boolean z2) {
        C89219l.m154721d(map, "");
        C89219l.m154721d(textStickerTextPair, "");
        return new TextStickerTextWrap(map, textStickerTextPair, i, z, z2);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextStickerTextWrap)) {
            return false;
        }
        TextStickerTextWrap textStickerTextWrap = (TextStickerTextWrap) obj;
        return C89219l.m154714a(this.strMap, textStickerTextWrap.strMap) && C89219l.m154714a(this.strPair, textStickerTextWrap.strPair) && this.selectionStart == textStickerTextWrap.selectionStart && this.hasFocus == textStickerTextWrap.hasFocus && this.isReplaceString == textStickerTextWrap.isReplaceString;
    }

    public final int hashCode() {
        Map<TextStickerString, List<InteractTextStructWrap>> map = this.strMap;
        int i = 0;
        int hashCode = (map != null ? map.hashCode() : 0) * 31;
        TextStickerTextPair textStickerTextPair = this.strPair;
        if (textStickerTextPair != null) {
            i = textStickerTextPair.hashCode();
        }
        int com_ss_android_ugc_aweme_editSticker_text_bean_TextStickerTextWrap_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = (((hashCode + i) * 31) + m88935x17d757bf(this.selectionStart)) * 31;
        boolean z = this.hasFocus;
        int i2 = 1;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = (com_ss_android_ugc_aweme_editSticker_text_bean_TextStickerTextWrap_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + i3) * 31;
        if (!this.isReplaceString) {
            i2 = 0;
        }
        return i6 + i2;
    }

    public final String toString() {
        return "TextStickerTextWrap(strMap=" + this.strMap + ", strPair=" + this.strPair + ", selectionStart=" + this.selectionStart + ", hasFocus=" + this.hasFocus + ", isReplaceString=" + this.isReplaceString + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C89219l.m154721d(parcel, "");
        Map<TextStickerString, List<InteractTextStructWrap>> map = this.strMap;
        parcel.writeInt(map.size());
        for (Map.Entry<TextStickerString, List<InteractTextStructWrap>> entry : map.entrySet()) {
            entry.getKey().writeToParcel(parcel, 0);
            List<InteractTextStructWrap> value = entry.getValue();
            parcel.writeInt(value.size());
            for (InteractTextStructWrap interactTextStructWrap : value) {
                interactTextStructWrap.writeToParcel(parcel, 0);
            }
        }
        this.strPair.writeToParcel(parcel, 0);
        parcel.writeInt(this.selectionStart);
        parcel.writeInt(this.hasFocus ? 1 : 0);
        parcel.writeInt(this.isReplaceString ? 1 : 0);
    }

    public final boolean getHasFocus() {
        return this.hasFocus;
    }

    public final int getSelectionStart() {
        return this.selectionStart;
    }

    public final Map<TextStickerString, List<InteractTextStructWrap>> getStrMap() {
        return this.strMap;
    }

    public final boolean isReplaceString() {
        return this.isReplaceString;
    }

    /* renamed from: com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerTextWrap$a */
    public static class C46078a implements Parcelable.Creator<TextStickerTextWrap> {
        static {
            Covode.recordClassIndex(54636);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ TextStickerTextWrap[] newArray(int i) {
            return new TextStickerTextWrap[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ TextStickerTextWrap createFromParcel(Parcel parcel) {
            C89219l.m154721d(parcel, "");
            int readInt = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(readInt);
            while (readInt != 0) {
                TextStickerString createFromParcel = TextStickerString.CREATOR.createFromParcel(parcel);
                int readInt2 = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt2);
                while (readInt2 != 0) {
                    arrayList.add(InteractTextStructWrap.CREATOR.createFromParcel(parcel));
                    readInt2--;
                }
                linkedHashMap.put(createFromParcel, arrayList);
                readInt--;
            }
            TextStickerTextPair createFromParcel2 = TextStickerTextPair.CREATOR.createFromParcel(parcel);
            int readInt3 = parcel.readInt();
            boolean z = false;
            boolean z2 = parcel.readInt() != 0;
            if (parcel.readInt() != 0) {
                z = true;
            }
            return new TextStickerTextWrap(linkedHashMap, createFromParcel2, readInt3, z2, z);
        }
    }

    public final String getText() {
        return this.strPair.f107313a;
    }

    public final TextStickerString[] getStickerStringArray() {
        Object[] array = this.strMap.keySet().toArray(new TextStickerString[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        return (TextStickerString[]) array;
    }

    public final List<CreateAnchorInfo> getAnchorInfoList() {
        List<InteractTextStructWrap> list = this.strPair.f107314b;
        ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getStruct());
        }
        return arrayList;
    }

    public final String[] getStrArray() {
        Set<TextStickerString> keySet = this.strMap.keySet();
        ArrayList arrayList = new ArrayList(C89070n.m154526a(keySet, 10));
        Iterator<T> it = keySet.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getStr());
        }
        Object[] array = arrayList.toArray(new String[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        return (String[]) array;
    }

    public final TextStickerTextPair safeStrPair() {
        if (this.strPair.f107314b == null) {
            try {
                Field field = C89378p.class.getField("a");
                C89219l.m154716b(field, "");
                field.setAccessible(true);
                field.set(this.strPair, new ArrayList());
            } catch (Exception e) {
                C73991bj.m130129a(e);
            }
        }
        return this.strPair;
    }

    public final boolean isValid() {
        TextStickerString[] stickerStringArray;
        if (this.strMap.isEmpty() || this.isReplaceString || (stickerStringArray = getStickerStringArray()) == null) {
            return false;
        }
        for (TextStickerString textStickerString : stickerStringArray) {
            if (textStickerString.getStr().length() > 0) {
                String str = textStickerString.getStr();
                Objects.requireNonNull(str, "null cannot be cast to non-null type kotlin.CharSequence");
                if (C89361p.m154910b((CharSequence) str).toString().length() > 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.lang.Object
    public final TextStickerTextWrap clone() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<TextStickerString, List<InteractTextStructWrap>> entry : this.strMap.entrySet()) {
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = entry.getValue().iterator();
            while (it.hasNext()) {
                arrayList.add(InteractTextStructWrap.copy$default(it.next(), null, null, 3, null));
            }
            linkedHashMap.put(new TextStickerString(entry.getKey().getStr()), arrayList);
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it2 = this.strPair.f107314b.iterator();
        while (it2.hasNext()) {
            arrayList2.add(InteractTextStructWrap.copy$default(it2.next(), null, null, 3, null));
        }
        return new TextStickerTextWrap(linkedHashMap, new TextStickerTextPair(this.strPair.f107313a, arrayList2), this.selectionStart, false, false, 24, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.Map<com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerString, ? extends java.util.List<com.ss.android.ugc.aweme.editSticker.text.bean.InteractTextStructWrap>> */
    /* JADX WARN: Multi-variable type inference failed */
    public TextStickerTextWrap(Map<TextStickerString, ? extends List<InteractTextStructWrap>> map, TextStickerTextPair textStickerTextPair, int i, boolean z, boolean z2) {
        C89219l.m154721d(map, "");
        C89219l.m154721d(textStickerTextPair, "");
        this.strMap = map;
        this.strPair = textStickerTextPair;
        this.selectionStart = i;
        this.hasFocus = z;
        this.isReplaceString = z2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ TextStickerTextWrap(java.util.Map r8, com.p2082ss.android.ugc.aweme.editSticker.text.bean.TextStickerTextPair r9, int r10, boolean r11, boolean r12, int r13, p4600h.p4611f.p4613b.C89214g r14) {
        /*
            r7 = this;
            r6 = r12
            r2 = r8
            r5 = r11
            r3 = r9
            r4 = r10
            r0 = r13 & 1
            if (r0 == 0) goto L_0x000e
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
        L_0x000e:
            r0 = r13 & 2
            if (r0 == 0) goto L_0x0017
            com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerTextPair r3 = new com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerTextPair
            r3.<init>()
        L_0x0017:
            r0 = r13 & 4
            if (r0 == 0) goto L_0x0021
            java.lang.String r0 = r3.f107313a
            int r4 = r0.length()
        L_0x0021:
            r1 = r13 & 8
            r0 = 0
            if (r1 == 0) goto L_0x0027
            r5 = 0
        L_0x0027:
            r0 = r13 & 16
            if (r0 == 0) goto L_0x002c
            r6 = 0
        L_0x002c:
            r1 = r7
            r1.<init>(r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.editSticker.text.bean.TextStickerTextWrap.<init>(java.util.Map, com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerTextPair, int, boolean, boolean, int, h.f.b.g):void");
    }
}
