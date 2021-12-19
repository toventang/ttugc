package org.eclipse.mat.json;

import com.bytedance.covode.number.Covode;
import java.util.Objects;

public class JSONTokener {

    /* renamed from: in */
    private final String f204975in;
    private int pos;

    static {
        Covode.recordClassIndex(106505);
    }

    public static int dehexchar(char c) {
        if (c >= '0' && c <= '9') {
            return c - '0';
        }
        char c2 = 'A';
        if (c < 'A' || c > 'F') {
            c2 = 'a';
            if (c < 'a' || c > 'f') {
                return -1;
            }
        }
        return (c - c2) + 10;
    }

    public void back() {
        int i = this.pos - 1;
        this.pos = i;
        if (i == -1) {
            this.pos = 0;
        }
    }

    public boolean more() {
        if (this.pos < this.f204975in.length()) {
            return true;
        }
        return false;
    }

    public char nextClean() {
        int nextCleanInternal = nextCleanInternal();
        if (nextCleanInternal == -1) {
            return 0;
        }
        return (char) nextCleanInternal;
    }

    public char next() {
        if (this.pos >= this.f204975in.length()) {
            return 0;
        }
        String str = this.f204975in;
        int i = this.pos;
        this.pos = i + 1;
        return str.charAt(i);
    }

    public String toString() {
        return " at character " + this.pos + " of " + this.f204975in;
    }

    public Object nextValue() {
        int nextCleanInternal = nextCleanInternal();
        if (nextCleanInternal == -1) {
            throw syntaxError("End of input");
        } else if (nextCleanInternal == 34 || nextCleanInternal == 39) {
            return nextString((char) nextCleanInternal);
        } else {
            if (nextCleanInternal == 91) {
                return readArray();
            }
            if (nextCleanInternal == 123) {
                return readObject();
            }
            this.pos--;
            return readLiteral();
        }
    }

    private int nextCleanInternal() {
        while (this.pos < this.f204975in.length()) {
            String str = this.f204975in;
            int i = this.pos;
            this.pos = i + 1;
            char charAt = str.charAt(i);
            if (!(charAt == '\t' || charAt == '\n' || charAt == '\r' || charAt == ' ')) {
                if (charAt != '/' || this.pos == this.f204975in.length()) {
                    return charAt;
                }
                char charAt2 = this.f204975in.charAt(this.pos);
                if (charAt2 != '*' && charAt2 != '/') {
                    return charAt;
                }
                skipComment();
            }
        }
        return -1;
    }

    private JSONArray readArray() {
        JSONArray jSONArray = new JSONArray();
        boolean z = false;
        while (true) {
            int nextCleanInternal = nextCleanInternal();
            if (nextCleanInternal != -1) {
                if (nextCleanInternal == 44 || nextCleanInternal == 59) {
                    jSONArray.put((Object) null);
                } else if (nextCleanInternal != 93) {
                    this.pos--;
                    jSONArray.put(nextValue());
                    int nextCleanInternal2 = nextCleanInternal();
                    if (!(nextCleanInternal2 == 44 || nextCleanInternal2 == 59)) {
                        if (nextCleanInternal2 == 93) {
                            return jSONArray;
                        }
                        throw syntaxError("Unterminated array");
                    }
                } else {
                    if (z) {
                        jSONArray.put((Object) null);
                    }
                    return jSONArray;
                }
                z = true;
            } else {
                throw syntaxError("Unterminated array");
            }
        }
    }

    private char readEscapeCharacter() {
        String str = this.f204975in;
        int i = this.pos;
        this.pos = i + 1;
        char charAt = str.charAt(i);
        if (charAt == 'b') {
            return '\b';
        }
        if (charAt == 'f') {
            return '\f';
        }
        if (charAt == 'n') {
            return '\n';
        }
        if (charAt == 'r') {
            return '\r';
        }
        if (charAt == 't') {
            return '\t';
        }
        if (charAt != 'u') {
            return charAt;
        }
        if (this.pos + 4 <= this.f204975in.length()) {
            String str2 = this.f204975in;
            int i2 = this.pos;
            String substring = str2.substring(i2, i2 + 4);
            this.pos += 4;
            return (char) Integer.parseInt(substring, 16);
        }
        throw syntaxError("Unterminated escape sequence");
    }

    private void skipComment() {
        String str = this.f204975in;
        int i = this.pos;
        this.pos = i + 1;
        if (str.charAt(i) == '*') {
            int indexOf = this.f204975in.indexOf("*/", this.pos);
            if (indexOf != -1) {
                this.pos = indexOf + 2;
                return;
            }
            throw syntaxError("Unterminated comment");
        }
        while (this.pos < this.f204975in.length()) {
            char charAt = this.f204975in.charAt(this.pos);
            if (charAt == '\r' || charAt == '\n') {
                this.pos++;
                return;
            }
            this.pos++;
        }
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:36:0x0086 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.Object readLiteral() {
        /*
        // Method dump skipped, instructions count: 152
        */
        throw new UnsupportedOperationException("Method not decompiled: org.eclipse.mat.json.JSONTokener.readLiteral():java.lang.Object");
    }

    private JSONObject readObject() {
        JSONObject jSONObject = new JSONObject();
        int nextCleanInternal = nextCleanInternal();
        if (nextCleanInternal == 125) {
            return jSONObject;
        }
        if (nextCleanInternal != -1) {
            this.pos--;
        }
        while (true) {
            Object nextValue = nextValue();
            if (nextValue instanceof String) {
                int nextCleanInternal2 = nextCleanInternal();
                if (nextCleanInternal2 == 58 || nextCleanInternal2 == 61) {
                    if (this.pos < this.f204975in.length() && this.f204975in.charAt(this.pos) == '>') {
                        this.pos++;
                    }
                    jSONObject.put((String) nextValue, nextValue());
                    int nextCleanInternal3 = nextCleanInternal();
                    if (nextCleanInternal3 != 44 && nextCleanInternal3 != 59) {
                        if (nextCleanInternal3 == 125) {
                            return jSONObject;
                        }
                        throw syntaxError("Unterminated object");
                    }
                } else {
                    throw syntaxError("Expected ':' after ".concat(String.valueOf(nextValue)));
                }
            } else if (nextValue == null) {
                throw syntaxError("Names cannot be null");
            } else {
                throw syntaxError("Names must be strings, but " + nextValue + " is of type " + nextValue.getClass().getName());
            }
        }
    }

    public JSONTokener(String str) {
        this.f204975in = str;
    }

    public String nextTo(char c) {
        return nextToInternal(String.valueOf(c)).trim();
    }

    public char skipTo(char c) {
        int indexOf = this.f204975in.indexOf(c, this.pos);
        if (indexOf == -1) {
            return 0;
        }
        this.pos = indexOf;
        return c;
    }

    public String nextTo(String str) {
        Objects.requireNonNull(str);
        return nextToInternal(str).trim();
    }

    public void skipPast(String str) {
        int length;
        int indexOf = this.f204975in.indexOf(str, this.pos);
        if (indexOf == -1) {
            length = this.f204975in.length();
        } else {
            length = str.length() + indexOf;
        }
        this.pos = length;
    }

    public JSONException syntaxError(String str) {
        return new JSONException(str + this);
    }

    private String nextToInternal(String str) {
        int i = this.pos;
        while (this.pos < this.f204975in.length()) {
            char charAt = this.f204975in.charAt(this.pos);
            if (charAt == '\r' || charAt == '\n' || str.indexOf(charAt) != -1) {
                return this.f204975in.substring(i, this.pos);
            }
            this.pos++;
        }
        return this.f204975in.substring(i);
    }

    public char next(char c) {
        char next = next();
        if (next == c) {
            return next;
        }
        throw syntaxError("Expected " + c + " but was " + next);
    }

    public String next(int i) {
        if (this.pos + i <= this.f204975in.length()) {
            String str = this.f204975in;
            int i2 = this.pos;
            String substring = str.substring(i2, i2 + i);
            this.pos += i;
            return substring;
        }
        throw syntaxError(i + " is out of bounds");
    }

    public String nextString(char c) {
        int i = this.pos;
        StringBuilder sb = null;
        while (this.pos < this.f204975in.length()) {
            String str = this.f204975in;
            int i2 = this.pos;
            this.pos = i2 + 1;
            char charAt = str.charAt(i2);
            if (charAt == c) {
                if (sb == null) {
                    return new String(this.f204975in.substring(i, this.pos - 1));
                }
                sb.append((CharSequence) this.f204975in, i, this.pos - 1);
                return sb.toString();
            } else if (charAt == '\\') {
                if (this.pos != this.f204975in.length()) {
                    if (sb == null) {
                        sb = new StringBuilder();
                    }
                    sb.append((CharSequence) this.f204975in, i, this.pos - 1);
                    sb.append(readEscapeCharacter());
                    i = this.pos;
                } else {
                    throw syntaxError("Unterminated escape sequence");
                }
            }
        }
        throw syntaxError("Unterminated string");
    }
}
