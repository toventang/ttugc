package com.p2082ss.android.vesdk.model;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ttve.nativePort.C30739f;
import com.p2082ss.android.vesdk.C85315al;
import java.nio.charset.Charset;

/* renamed from: com.ss.android.vesdk.model.BefTextLayout */
public class BefTextLayout {
    long backColor;
    int charSize;
    String familyName;
    boolean isPlaceholder;
    int letterSpacing;
    int lineCount;
    float lineHeight;
    int lineWidth;
    int split;
    int textAlign;
    long textColor;
    int textIndent;

    static {
        Covode.recordClassIndex(99692);
    }

    public long getBackColor() {
        return this.backColor;
    }

    public int getCharSize() {
        return this.charSize;
    }

    public String getFamilyName() {
        return this.familyName;
    }

    public int getLetterSpacing() {
        return this.letterSpacing;
    }

    public int getLineCount() {
        return this.lineCount;
    }

    public float getLineHeight() {
        return this.lineHeight;
    }

    public int getLineWidth() {
        return this.lineWidth;
    }

    public int getSplit() {
        return this.split;
    }

    public int getTextAlign() {
        return this.textAlign;
    }

    public long getTextColor() {
        return this.textColor;
    }

    public int getTextIndent() {
        return this.textIndent;
    }

    public boolean isPlaceholder() {
        return this.isPlaceholder;
    }

    public String toString() {
        return "BefTextLayout{charSize=" + this.charSize + ", letterSpacing=" + this.letterSpacing + ", lineWidth=" + this.lineWidth + ", lineHeight=" + this.lineHeight + ", textAlign=" + this.textAlign + ", textIndent=" + this.textIndent + ", split=" + this.split + ", lineCount=" + this.lineCount + ", familyName='" + this.familyName + '\'' + ", textColor=" + this.textColor + ", backColor=" + this.backColor + ", isPlaceholder=" + this.isPlaceholder + '}';
    }

    public void setBackColor(long j) {
        this.backColor = j;
    }

    public void setCharSize(int i) {
        this.charSize = i;
    }

    public void setFamilyName(String str) {
        this.familyName = str;
    }

    public void setLetterSpacing(int i) {
        this.letterSpacing = i;
    }

    public void setLineCount(int i) {
        this.lineCount = i;
    }

    public void setLineHeight(float f) {
        this.lineHeight = f;
    }

    public void setLineWidth(int i) {
        this.lineWidth = i;
    }

    public void setPlaceholder(boolean z) {
        this.isPlaceholder = z;
    }

    public void setSplit(int i) {
        this.split = i;
    }

    public void setTextAlign(int i) {
        this.textAlign = i;
    }

    public void setTextColor(long j) {
        this.textColor = j;
    }

    public void setTextIndent(int i) {
        this.textIndent = i;
    }

    public static BefTextLayout readFromByteArray(byte[][] bArr) {
        String str;
        boolean z = false;
        C30739f fVar = new C30739f(bArr[0]);
        BefTextLayout befTextLayout = new BefTextLayout();
        befTextLayout.setBackColor(fVar.mo55460b().longValue());
        befTextLayout.setCharSize(fVar.mo55459a());
        int a = fVar.mo55459a();
        if (fVar.f73597b + a > fVar.f73596a.length) {
            C85315al.m146642d("TEParcel", "readString out of bound(data size=" + fVar.f73596a.length + ", start=" + fVar.f73597b + ", len=" + a + ")");
            str = null;
        } else {
            str = new String(fVar.f73596a, fVar.f73597b, a, Charset.forName("UTF-8"));
            fVar.f73597b += a;
        }
        befTextLayout.setFamilyName(str);
        befTextLayout.setLetterSpacing(fVar.mo55459a());
        befTextLayout.setLineCount(fVar.mo55459a());
        befTextLayout.setLineHeight((float) fVar.mo55459a());
        befTextLayout.setLineWidth(fVar.mo55459a());
        if (fVar.f73597b + 4 > fVar.f73596a.length) {
            C85315al.m146642d("TEParcel", "out of border");
        } else if (fVar.mo55459a() != 0) {
            z = true;
        }
        befTextLayout.setPlaceholder(z);
        befTextLayout.setSplit(fVar.mo55459a());
        befTextLayout.setTextAlign(fVar.mo55459a());
        befTextLayout.setTextColor(fVar.mo55460b().longValue());
        befTextLayout.setTextIndent(fVar.mo55459a());
        return befTextLayout;
    }
}
