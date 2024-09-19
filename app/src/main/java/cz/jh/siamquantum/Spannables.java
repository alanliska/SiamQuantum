package cz.jh.siamquantum;

import android.graphics.Color;
import android.graphics.Typeface;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;

// the last colorization within the function is the most important (will be applied as the last)
// rule: the first are the least important colorizations, overriden by the last ones

public class Spannables extends MainActivity {

    public static Spannable colorized_numbers(final String text) {
        SpannableString spannable = new SpannableString(text);
        // when the white background span is applied, the text selection is not visible (only the non-spanned parts)
        Integer argb_back = Color.WHITE;

        String[] words_red = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", ".", "+", "-"};
        Integer argb_red = Color.RED;
        for (String word : words_red) {
            int substringStart=0;
            int start;
            while((start=text.indexOf(word,substringStart))>=0){
                spannable.setSpan(
                        new ForegroundColorSpan(argb_red),start,start+word.length(),
                        Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
                );
//                spannable.setSpan(
//                        new BackgroundColorSpan(argb_back),start,start+word.length(),
//                        Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
//                );
                substringStart = start+word.length();
            }
        }

        return spannable;
    }

    public static Spannable colorized_bash(final String text) {
        SpannableString spannable = new SpannableString(text);
        Integer argb_back = Color.WHITE;

        String[] words_green = {"cd ", "export ", "acpid ", "adjtimex ", "ar ", "arch ", "arp ", "arping ", "ash ", "awk ", "basename ", "bc ", "blkdiscard ", "blockdev ", "brctl ", "bunzip2 ", "bzcat ", "bzip2 ", "cal ", "cat ", "chgrp ", "chmod ", "chown ", "chroot ", "chvt ", "clear ", "cmp ", "cp ", "cpio ", "cttyhack ", "cut ", "date ", "dc ", "dd ", "deallocvt ", "depmod ", "devmem ", "df ", "diff ", "dirname ", "dmesg ", "dnsdomainname ", "dos2unix ", "du ", "dumpkmap ", "dumpleases ", "echo ", "egrep ", "env ", "expand ", "expr ", "factor ", "fallocate ", "false ", "fatattr ", "fgrep ", "find ", "fold ", "free ", "freeramdisk ", "fsfreeze ", "fstrim ", "ftpget ", "ftpput ", "getopt ", "getty ", "grep ", "groups ", "gunzip ", "gzip ", "halt ", "head ", "hexdump ", "hostid ", "hostname ", "httpd ", "hwclock ", "i2cdetect ", "i2cdump ", "i2cget ", "i2cset ", "id ", "ifconfig ", "ifdown ", "ifup ", "init ", "insmod ", "ionice ", "ip ", "ipcalc ", "ipneigh ", "kill ", "killall ", "klogd ", "last ", "less ", "link ", "linux32 ", "linux64 ", "linuxrc ", "ln ", "loadfont ", "loadkmap ", "logger ", "login ", "logname ", "logread ", "losetup ", "ls ", "lsmod ", "lsscsi ", "lzcat ", "lzma ", "lzop ", "md5sum ", "mdev ", "microcom ", "mkdir ", "mkdosfs ", "mke2fs ", "mkfifo ", "mknod ", "mkpasswd ", "mkswap ", "mktemp ", "modinfo ", "modprobe ", "more ", "mount ", "mt ", "mv ", "nameif ", "nc ", "netstat ", "nl ", "nologin ", "nproc ", "nsenter ", "nslookup ", "nuke ", "od ", "openvt ", "partprobe ", "paste ", "patch ", "pidof ", "ping ", "ping6 ", "pivot_root ", "poweroff ", "printf ", "ps ", "pwd ", "rdate ", "readlink ", "realpath ", "reboot ", "renice ", "reset ", "resume ", "rev ", "rm ", "rmdir ", "rmmod ", "route ", "rpm ", "rpm2cpio ", "run-init ", "run-parts ", "sed ", "seq ", "setkeycodes ", "setpriv ", "setsid ", "sh ", "sha1sum ", "sha256sum ", "sha512sum ", "shred ", "shuf ", "sleep ", "sort ", "ssl_client ", "start-stop-daemon ", "stat ", "strings ", "stty ", "svc ", "svok ", "swapoff ", "swapon ", "switch_root ", "sync ", "sysctl ", "syslogd ", "tac ", "tail ", "tar ", "taskset ", "tee ", "telnet ", "test ", "tftp ", "time ", "timeout ", "top ", "touch ", "tr ", "traceroute ", "traceroute6 ", "true ", "truncate ", "tty ", "ubirename ", "udhcpc ", "udhcpd ", "uevent ", "umount ", "uname ", "uncompress ", "unexpand ", "uniq ", "unix2dos ", "unlink ", "unlzma ", "unshare ", "unxz ", "unzip ", "uptime ", "usleep ", "uudecode ", "uuencode ", "vconfig ", "vi ", "w ", "watch ", "watchdog ", "wc ", "wget ", "which ", "who ", "whoami ", "xargs ", "xxd ", "xz ", "xzcat ", "yes ", "zcat ", "obabel ", "xbbc ", "xbvm ", "sq ", "toybox "};
        Integer argb_green = Color.parseColor("#66BB6A");
        for (String word : words_green) {
            int substringStart=0;
            int start;
            while((start=text.indexOf(word,substringStart))>=0){
                spannable.setSpan(
                        new ForegroundColorSpan(argb_green),start,start+word.length(),
                        Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
                );
//                spannable.setSpan(
//                        new BackgroundColorSpan(argb_back),start,start+word.length(),
//                        Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
//                );
                substringStart = start+word.length();
            }
        }

        String[] words_red = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", ".", "+", "-"};
        Integer argb_red = Color.RED;
        for (String word : words_red) {
            int substringStart=0;
            int start;
            while((start=text.indexOf(word,substringStart))>=0){
                spannable.setSpan(
                        new ForegroundColorSpan(argb_red),start,start+word.length(),
                        Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
                );
//                spannable.setSpan(
//                        new BackgroundColorSpan(argb_back),start,start+word.length(),
//                        Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
//                );
                substringStart = start+word.length();
            }
        }

        String[] words_comment = {"#", "!"};
        Integer argb_comment = Color.parseColor("#058a47");
        for (String word : words_comment) {
            int substringStart = 0;
            int start;
            while ((start = text.indexOf(word, substringStart)) >= 0) {
                int endOfLine = text.indexOf("\n",start);
                // endOfLine = -1 in the last line, since there is no more line break until the ond of the file
                if (endOfLine != -1) {
                    spannable.setSpan(
                            new ForegroundColorSpan(argb_comment), start, endOfLine,
                            Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
                    );
//                    spannable.setSpan(
//                            new BackgroundColorSpan(argb_back),start,endOfLine,
//                            Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
//                    );
                    substringStart = endOfLine;
                } else {
                    spannable.setSpan(
                            // in the last line, only the "#" character would be colorized by green, the following characters would be either black or colorized by previous
//                            new ForegroundColorSpan(argb_comment), start, start+word.length(),
                            // text.length() is the position of the end of whole text, better (it works as should)
                            new ForegroundColorSpan(argb_comment), start, text.length(),
                            Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
                    );
//                    spannable.setSpan(
//                            new BackgroundColorSpan(argb_back),start,text.length(),
//                            Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
//                    );
                    substringStart = start+word.length();
                }
            }
        }

        return spannable;
    }

    public static Spannable colorized_x11basic(final String text) {
        SpannableString spannable = new SpannableString(text);
        Integer argb_back = Color.WHITE;

        String[] words_basic = {"ABS(", "ABSOLUTE", "ACOS(", "ACOSH(", "ADD", "ADD(", "AFTER", "ALERT", "AND", "AND(", "ANDROID?", "ARG(", "ARID$(", "ARIE$(", "ARRAYCOPY", "ARRAYFILL", "ARRPTR(", "ASC(", "ASIN(", "ASINH(", "AT(", "ATAN(", "ATAN2(", "ATANH(", "ATN(", "BCHG(", "BCLR(", "BEEP", "BELL", "BGET", "BIN$(", "BLOAD", "BMOVE", "BOTTOMW", "BOUNDARY", "BOX", "BPUT", "BREAK", "BSAVE", "BSET(", "BTST(", "BWTD$(", "BWTE$(", "BYTE(", "CALL", "CALL(", "CALL$(", "CALLD(", "CARD(", "CASE", "CBRT(", "CEIL(", "CGI", "CHAIN", "CHDIR", "CHMOD", "CHR$(", "CINT(", "CIRCLE", "CLEAR", "CLEARW", "CLIP", "CLOSE", "CLOSEW", "CLR", "CLS", "COLOR", "COLOR(", "COLOR_RGB(", "COLS", "COMBIN(", "COMPRESS$(", "CONJ(", "CONNECT", "CONT", "CONTINUE", "COPY_AREA", "COPYAREA", "COS(", "COSH(", "CRC(", "CRSCOL", "CRSLIN", "CTIMER", "CURVE", "CVA(", "CVD(", "CVF(", "CVI(", "CVL(", "CVS(", "DATA", "DATE$", "DEC", "DECLOSE$(", "DECRYPT$(", "DEFAULT", "DEFFILL", "DEFFN", "DEFLINE", "DEFMARK", "DEFMOUSE", "DEFTEXT", "DEG(", "DELAY", "DET(", "DEVICE(", "DIM", "DIM?", "DIM?(", "DIR$(", "DIV", "DIV(", "DO", "DOWNTO", "DPEEK(", "DPOKE", "DRAW", "DUMP", "ECHO", "EDIT", "ELLIPSE", "ELSE", "ELSE IF", "ENCLOSE$(", "ENCRYPT$(", "END", "ENDFUNCTION", "ENDIF", "ENDPROCEDURE", "ENDSELECT", "ENV$(", "EOF(", "EQV", "ERASE", "ERR", "ERR$(", "ERROR", "EVAL", "EVAL(", "EVEN(", "EVENT", "EVENT?(", "EVERY", "EXEC", "EXEC(", "EXIST(", "EXIT", "EXIT IF", "EXP(", "EXPM1(", "FACT(", "FALSE", "FATAL", "FFT", "FFT(", "FIB(", "FILEEVENT$", "FILESELECT", "FILL", "FIT", "FIT_LINEAR", "FIT_POLY", "FIX(", "FLOOR(", "FLUSH", "FOR", "FORK(", "FORMINPUT AS", "FORM_ALERT(", "FORM_CENTER(", "FORM_DIAL(", "FORM_DO(", "FRAC(", "FREE", "FREE(", "FREEFILE(", "FSEL_INPUT(", "FSFIRST$(", "FSNEXT$(", "FULLW", "FUNCTION", "GAMMA(", "GASDEV", "GASDEV(", "GCD(", "GET", "GET_COLOR(", "GET_GEOMETRY", "GET_LOCATION", "GET_SCREENSIZE", "GLOB(", "GOLOR_RGB(", "GOSUB", "GOSUBABBREV", "GOTO", "GPRINT", "GPS", "GPS?", "GPS_ALT", "GPS_LAT", "GPS_LON", "GRAPHMODE", "GRAY(", "HASH$(", "HELP", "HEX$(", "HIDEK", "HIDEM", "HOME", "HYPOT(", "IDE", "IF", "IMAG(", "IMP", "INC", "INFOW", "INKEY$", "INLINE$(", "INODE(", "INP(", "INP?(", "INP%(", "INP&(", "INPUT", "INPUT$(", "INSTR(", "INT(", "INV(", "INVERT(", "IOCTL(", "JULDATE$(", "JULIAN(", "KEYEVENT", "KILL", "LCM(", "LEFT$(", "LEFTOF$(", "LEN(", "LET", "LGAMMA(", "LINE", "LINEINPUT", "LINEINPUT$(", "LINK", "LIST", "LISTSELECT(", "LN(", "LOAD", "LOC(", "LOCAL", "LOCATE", "LOF(", "LOG(", "LOG10(", "LOG1P(", "LOGB(", "LOOP", "LOWER$(", "LPEEK(", "LPOKE", "LTEXT", "LTEXTLEN(", "LUCNUM(", "MALLOC(", "MAP", "MAX(", "MENU", "MENUDEF", "MENUKILL", "MENUSET", "MERGE", "MFREE", "MFREE(", "MID$(", "MIN(", "MKA$(", "MKD$(", "MKDIR", "MKF$(", "MKI$(", "MKL$(", "MKS$(", "MOD", "MOD(", "MODE(", "MOTIONEVENT", "MOUSE", "MOUSEEVENT", "MOUSEK", "MOUSES", "MOUSEX", "MOUSEY", "MOVEW", "MSHRINK(", "MSYNC", "MTFD$(", "MTFE$(", "MUL", "MUL(", "NAND", "NEW", "NEXT", "NEXTPRIME(", "NLINK(", "NOOP", "NOP", "NOR", "NOROOTWINDOW", "NOT", "OBJ_DRAW(", "OBJC_ADD", "OBJC_DELETE", "OBJC_DRAW(", "OBJC_FIND(", "OBJC_OFFSET(", "OCT$(", "ODD(", "ON*GOSUB", "ON*GOTO", "ONBREAK", "ONERROR", "ONERRORGOSUB", "OPEN", "OPENW", "OR", "OR(", "OUT", "OUT?(", "PARAM$(", "PAUSE", "PBOX", "PC", "PCIRCLE", "PEEK(", "PELLIPSE", "PI", "PIPE", "PLAYSOUND", "PLAYSOUNDFILE", "PLIST", "PLOT", "PNGDECODE$(", "PNGENCODE$(", "POINT(", "POKE", "POLYFILL", "POLYLINE", "POLYMARK", "POWM(", "PRBOX", "PRED(", "PRG$(", "PRIMORIAL(", "PRINT", "PRINT AT(", "PRINT COLOR(", "PRINT SPC(", "PRINT TAB(", "PRINT TAB( SPC(", "PRINT USING", "PROCEDURE", "PROGRAM", "PTST(", "PUT", "PUT_BITMAP", "PUTBACK", "QUIT", "RAD(", "RADIX$(", "RAND(", "RANDOM(", "RANDOMIZE", "RBOX", "READ", "REAL(", "REALLOC", "REALLOC(", "RECEIVE", "RELSEEK", "REM", "REMABBREV", "RENAME", "REPEAT", "REPLACE$(", "RESTORE", "RESUME", "RETURN", "REVERSE$(", "RIGHT$(", "RIGHTOF$(", "RINSTR(", "RLD$(", "RLE$(", "RMDIR", "RND(", "ROL(", "ROOT(", "ROOTWINDOW", "ROR(", "ROUND(", "ROWS", "RPM", "RSRC_FREE", "RSRC_LOAD", "RUN", "SAVE", "SAVESCREEN", "SAVEWINDOW", "SCOPE", "SCREEN", "SEEK", "SELECT", "SEND", "SENSOR", "SENSOR(", "SENSOR?", "SETENV", "SETFONT", "SETMOUSE", "SGET", "SGN(", "SHELL", "SHL(", "SHM_ATTACH(", "SHM_DETACH", "SHM_FREE", "SHM_MALLOC(", "SHOWK", "SHOWM", "SHOWPAGE", "SHR(", "SIGN$(", "SIN(", "SINH(", "SIZE(", "SIZEW", "SOLVE", "SOLVE(", "SORT", "SOUND", "SP", "SPACE$(", "SPAWN", "SPC(", "SPEAK", "SPLIT", "SPUT", "SQR(", "SQRT(", "SRAND(", "STEP", "STIMER", "STOP", "STR$(", "STRING$(", "SUB", "SUB(", "SUCC(", "SWAP", "SWAP(", "SYM_ADR(", "SYSTEM", "SYSTEM$(", "TAB(", "TALLY(", "TAN(", "TANH(", "TERMINALNAME$", "TERMINALNAME$(", "TEXT", "TIME$", "TIMER", "TITLEW", "TO", "TOPW", "TOUCH", "TRACE", "TRACE$", "TRIM$(", "TROFF", "TRON", "TRUE", "TRUNC(", "TT?", "TYP?(", "UBOUND(", "UCASE$(", "UNCOMPRESS$(", "UNIX", "UNIX?", "UNIXDATE$(", "UNIXTIME$(", "UNLINK", "UNMAP", "UNTIL", "UPPER$(", "USEWINDOW", "USING$(", "VAL(", "VAL?(", "VAR", "VARIAT(", "VARPTR(", "VERSION", "VOID", "ABBREV", "VRFY(", "VSYNC", "VT100", "WATCH", "WAVE", "WEND", "WHILE", "WIN32?", "WORD(", "WORD$(", "WORT_SEP", "WORT_SEP(", "XLOAD", "XOR", "XOR(", "XRUN", "XTRIM$(", "abs(", "absolute", "acos(", "acosh(", "add", "add(", "after", "alert", "and", "and(", "android?", "arg(", "arid$(", "arie$(", "arraycopy", "arrayfill", "arrptr(", "asc(", "asin(", "asinh(", "at(", "atan(", "atan2(", "atanh(", "atn(", "bchg(", "bclr(", "beep", "bell", "bget", "bin$(", "bload", "bmove", "bottomw", "boundary", "box", "bput", "break", "bsave", "bset(", "btst(", "bwtd$(", "bwte$(", "byte(", "call", "call(", "call$(", "calld(", "card(", "case", "cbrt(", "ceil(", "cgi", "chain", "chdir", "chmod", "chr$(", "cint(", "circle", "clear", "clearw", "clip", "close", "closew", "clr", "cls", "color", "color(", "color_rgb(", "cols", "combin(", "compress$(", "conj(", "connect", "cont", "continue", "copy_area", "copyarea", "cos(", "cosh(", "crc(", "crscol", "crslin", "ctimer", "curve", "cva(", "cvd(", "cvf(", "cvi(", "cvl(", "cvs(", "data", "date$", "dec", "declose$(", "decrypt$(", "default", "deffill", "deffn", "defline", "defmark", "defmouse", "deftext", "deg(", "delay", "det(", "device(", "dim", "dim?", "dim?(", "dir$(", "div", "div(", "do", "downto", "dpeek(", "dpoke", "draw", "dump", "echo", "edit", "ellipse", "else", "else if", "enclose$(", "encrypt$(", "end", "endfunction", "endif", "endprocedure", "endselect", "env$(", "eof(", "eqv", "erase", "err", "err$(", "error", "eval", "eval(", "even(", "event", "event?(", "every", "exec", "exec(", "exist(", "exit", "exit if", "exp(", "expm1(", "fact(", "false", "fatal", "fft", "fft(", "fib(", "fileevent$", "fileselect", "fill", "fit", "fit_linear", "fit_poly", "fix(", "floor(", "flush", "for", "fork(", "forminput as", "form_alert(", "form_center(", "form_dial(", "form_do(", "frac(", "free", "free(", "freefile(", "fsel_input(", "fsfirst$(", "fsnext$(", "fullw", "function", "gamma(", "gasdev", "gasdev(", "gcd(", "get", "get_color(", "get_geometry", "get_location", "get_screensize", "glob(", "golor_rgb(", "gosub", "gosubabbrev", "goto", "gprint", "gps", "gps?", "gps_alt", "gps_lat", "gps_lon", "graphmode", "gray(", "hash$(", "help", "hex$(", "hidek", "hidem", "home", "hypot(", "ide", "if", "imag(", "imp", "inc", "infow", "inkey$", "inline$(", "inode(", "inp(", "inp?(", "inp%(", "inp&(", "input", "input$(", "instr(", "int(", "inv(", "invert(", "ioctl(", "juldate$(", "julian(", "keyevent", "kill", "lcm(", "left$(", "leftof$(", "len(", "let", "lgamma(", "line", "lineinput", "lineinput$(", "link", "list", "listselect(", "ln(", "load", "loc(", "local", "locate", "lof(", "log(", "log10(", "log1p(", "logb(", "loop", "lower$(", "lpeek(", "lpoke", "ltext", "ltextlen(", "lucnum(", "malloc(", "map", "max(", "menu", "menudef", "menukill", "menuset", "merge", "mfree", "mfree(", "mid$(", "min(", "mka$(", "mkd$(", "mkdir", "mkf$(", "mki$(", "mkl$(", "mks$(", "mod", "mod(", "mode(", "motionevent", "mouse", "mouseevent", "mousek", "mouses", "mousex", "mousey", "movew", "mshrink(", "msync", "mtfd$(", "mtfe$(", "mul", "mul(", "nand", "new", "next", "nextprime(", "nlink(", "noop", "nop", "nor", "norootwindow", "not", "obj_draw(", "objc_add", "objc_delete", "objc_draw(", "objc_find(", "objc_offset(", "oct$(", "odd(", "on*gosub", "on*goto", "onbreak", "onerror", "onerrorgosub", "open", "openw", "or", "or(", "out", "out?(", "param$(", "pause", "pbox", "pc", "pcircle", "peek(", "pellipse", "pi", "pipe", "playsound", "playsoundfile", "plist", "plot", "pngdecode$(", "pngencode$(", "point(", "poke", "polyfill", "polyline", "polymark", "powm(", "prbox", "pred(", "prg$(", "primorial(", "print", "print at(", "print color(", "print spc(", "print tab(", "print tab( spc(", "print using", "procedure", "program", "ptst(", "put", "put_bitmap", "putback", "quit", "rad(", "radix$(", "rand(", "random(", "randomize", "rbox", "read", "real(", "realloc", "realloc(", "receive", "relseek", "rem", "remabbrev", "rename", "repeat", "replace$(", "restore", "resume", "return", "reverse$(", "right$(", "rightof$(", "rinstr(", "rld$(", "rle$(", "rmdir", "rnd(", "rol(", "root(", "rootwindow", "ror(", "round(", "rows", "rpm", "rsrc_free", "rsrc_load", "run", "save", "savescreen", "savewindow", "scope", "screen", "seek", "select", "send", "sensor", "sensor(", "sensor?", "setenv", "setfont", "setmouse", "sget", "sgn(", "shell", "shl(", "shm_attach(", "shm_detach", "shm_free", "shm_malloc(", "showk", "showm", "showpage", "shr(", "sign$(", "sin(", "sinh(", "size(", "sizew", "solve", "solve(", "sort", "sound", "sp", "space$(", "spawn", "spc(", "speak", "split", "sput", "sqr(", "sqrt(", "srand(", "step", "stimer", "stop", "str$(", "string$(", "sub", "sub(", "succ(", "swap", "swap(", "sym_adr(", "system", "system$(", "tab(", "tally(", "tan(", "tanh(", "terminalname$", "terminalname$(", "text", "time$", "timer", "titlew", "to", "topw", "touch", "trace", "trace$", "trim$(", "troff", "tron", "true", "trunc(", "tt?", "typ?(", "ubound(", "ucase$(", "uncompress$(", "unix", "unix?", "unixdate$(", "unixtime$(", "unlink", "unmap", "until", "upper$(", "usewindow", "using$(", "val(", "val?(", "var", "variat(", "varptr(", "version", "void", "abbrev", "vrfy(", "vsync", "vt100", "watch", "wave", "wend", "while", "win32?", "word(", "word$(", "wort_sep", "wort_sep(", "xload", "xor", "xor(", "xrun", "xtrim$(", "(", ")"};
        Integer argb_basic = Color.parseColor("#A52A2A");
        Integer argb_basic_back = Color.parseColor("#FFE797");
        for (String word : words_basic) {
            int substringStart=0;
            int start;
            while((start=text.indexOf(word,substringStart))>=0){
                spannable.setSpan(
                        new ForegroundColorSpan(argb_basic),start,start+word.length(),
                        Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
                );
                spannable.setSpan(
                        new BackgroundColorSpan(argb_basic_back),start,start+word.length(),
                        Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
                );
                substringStart = start+word.length();
            }
        }

        String[] words_red = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", ".", "+", "-"};
        Integer argb_red = Color.RED;
        for (String word : words_red) {
            int substringStart=0;
            int start;
            while((start=text.indexOf(word,substringStart))>=0){
                spannable.setSpan(
                        new ForegroundColorSpan(argb_red),start,start+word.length(),
                        Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
                );
//                spannable.setSpan(
//                        new BackgroundColorSpan(argb_back),start,start+word.length(),
//                        Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
//                );
                substringStart = start+word.length();
            }
        }

        String[] words_comment = {"#", "REM", "!"};
        Integer argb_comment = Color.parseColor("#058a47");
        for (String word : words_comment) {
            int substringStart = 0;
            int start;
            while ((start = text.indexOf(word, substringStart)) >= 0) {
                int endOfLine = text.indexOf("\n",start);
                // endOfLine = -1 in the last line, since there is no more line break until the ond of the file
                if (endOfLine != -1) {
                    spannable.setSpan(
                            new ForegroundColorSpan(argb_comment), start, endOfLine,
                            Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
                    );
//                    spannable.setSpan(
//                            new BackgroundColorSpan(argb_back),start,endOfLine,
//                            Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
//                    );
                    substringStart = endOfLine;
                } else {
                    spannable.setSpan(
                            // in the last line, only the "#" character would be colorized by green, the following characters would be either black or colorized by previous
//                            new ForegroundColorSpan(argb_comment), start, start+word.length(),
                            // text.length() is the position of the end of whole text, better (it works as should)
                            new ForegroundColorSpan(argb_comment), start, text.length(),
                            Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
                    );
//                    spannable.setSpan(
//                            new BackgroundColorSpan(argb_back),start,text.length(),
//                            Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
//                    );
                    substringStart = start+word.length();
                }
            }
        }

        return spannable;
    }

    public static Spannable colorized_siamquantum(final String text) {
        SpannableString spannable = new SpannableString(text);
        Integer argb_back = Color.WHITE;

        String[] words_green = {"cd ", "export ", "acpid ", "adjtimex ", "ar ", "arch ", "arp ", "arping ", "ash ", "awk ", "basename ", "bc ", "blkdiscard ", "blockdev ", "brctl ", "bunzip2 ", "bzcat ", "bzip2 ", "cal ", "cat ", "chgrp ", "chmod ", "chown ", "chroot ", "chvt ", "clear ", "cmp ", "cp ", "cpio ", "cttyhack ", "cut ", "date ", "dc ", "dd ", "deallocvt ", "depmod ", "devmem ", "df ", "diff ", "dirname ", "dmesg ", "dnsdomainname ", "dos2unix ", "du ", "dumpkmap ", "dumpleases ", "echo ", "egrep ", "env ", "expand ", "expr ", "factor ", "fallocate ", "false ", "fatattr ", "fgrep ", "find ", "fold ", "free ", "freeramdisk ", "fsfreeze ", "fstrim ", "ftpget ", "ftpput ", "getopt ", "getty ", "grep ", "groups ", "gunzip ", "gzip ", "halt ", "head ", "hexdump ", "hostid ", "hostname ", "httpd ", "hwclock ", "i2cdetect ", "i2cdump ", "i2cget ", "i2cset ", "id ", "ifconfig ", "ifdown ", "ifup ", "init ", "insmod ", "ionice ", "ip ", "ipcalc ", "ipneigh ", "kill ", "killall ", "klogd ", "last ", "less ", "link ", "linux32 ", "linux64 ", "linuxrc ", "ln ", "loadfont ", "loadkmap ", "logger ", "login ", "logname ", "logread ", "losetup ", "ls ", "lsmod ", "lsscsi ", "lzcat ", "lzma ", "lzop ", "md5sum ", "mdev ", "microcom ", "mkdir ", "mkdosfs ", "mke2fs ", "mkfifo ", "mknod ", "mkpasswd ", "mkswap ", "mktemp ", "modinfo ", "modprobe ", "more ", "mount ", "mt ", "mv ", "nameif ", "nc ", "netstat ", "nl ", "nologin ", "nproc ", "nsenter ", "nslookup ", "nuke ", "od ", "openvt ", "partprobe ", "paste ", "patch ", "pidof ", "ping ", "ping6 ", "pivot_root ", "poweroff ", "printf ", "ps ", "pwd ", "rdate ", "readlink ", "realpath ", "reboot ", "renice ", "reset ", "resume ", "rev ", "rm ", "rmdir ", "rmmod ", "route ", "rpm ", "rpm2cpio ", "run-init ", "run-parts ", "sed ", "seq ", "setkeycodes ", "setpriv ", "setsid ", "sh ", "sha1sum ", "sha256sum ", "sha512sum ", "shred ", "shuf ", "sleep ", "sort ", "ssl_client ", "start-stop-daemon ", "stat ", "strings ", "stty ", "svc ", "svok ", "swapoff ", "swapon ", "switch_root ", "sync ", "sysctl ", "syslogd ", "tac ", "tail ", "tar ", "taskset ", "tee ", "telnet ", "test ", "tftp ", "time ", "timeout ", "top ", "touch ", "tr ", "traceroute ", "traceroute6 ", "true ", "truncate ", "tty ", "ubirename ", "udhcpc ", "udhcpd ", "uevent ", "umount ", "uname ", "uncompress ", "unexpand ", "uniq ", "unix2dos ", "unlink ", "unlzma ", "unshare ", "unxz ", "unzip ", "uptime ", "usleep ", "uudecode ", "uuencode ", "vconfig ", "vi ", "w ", "watch ", "watchdog ", "wc ", "wget ", "which ", "who ", "whoami ", "xargs ", "xxd ", "xz ", "xzcat ", "yes ", "zcat ", "obabel ", "dftb ", "qcxms ", "modes ", "xbbc ", "xbvm ", "plotms ", "stda ", "xtb ", "xtb4stda ", "waveplot ", "chimescalc ", "chemsol ", "mopac ", "mopac-makpol ", "fastchem ", "mopac-param ", "phreeqc ", "transpose ", "cpx ", "dftd4 ", "multicharge ", "numsa-exe ", "s-dftd3 ", "tblite "};
        Integer argb_green = Color.parseColor("#66BB6A");
        for (String word : words_green) {
            int substringStart=0;
            int start;
            while((start=text.indexOf(word,substringStart))>=0){
                spannable.setSpan(
                        new ForegroundColorSpan(argb_green),start,start+word.length(),
                        Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
                );
//                spannable.setSpan(
//                        new BackgroundColorSpan(argb_back),start,start+word.length(),
//                        Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
//                );
                substringStart = start+word.length();
            }
        }

        String[] words_basic = {"X:", "S:"};
        Integer argb_basic = Color.parseColor("#A52A2A");
        Integer argb_basic_back = Color.parseColor("#FFE797");
        for (String word : words_basic) {
            int substringStart=0;
            int start;
            while((start=text.indexOf(word,substringStart))>=0){
                spannable.setSpan(
                        new ForegroundColorSpan(argb_basic),start,start+word.length(),
                        Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
                );
                spannable.setSpan(
                        new BackgroundColorSpan(argb_basic_back),start,start+word.length(),
                        Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
                );
                substringStart = start+word.length();
            }
        }

//        String[] words_brown = {"LDA_X", "LDA_X_1D_EXPONENTIAL", "LDA_X_1D_SOFT", "LDA_X_2D", "LDA_X_ERF", "LDA_X_RAE", "LDA_X_REL", "LDA_X_SLOC", "LDA_X_YUKAWA", "LDA_C_1D_CSC", "LDA_C_1D_LOOS", "LDA_C_2D_AMGB", "LDA_C_2D_PRM", "LDA_C_BR78", "LDA_C_CHACHIYO", "LDA_C_CHACHIYO_MOD", "LDA_C_GK72", "LDA_C_GL", "LDA_C_GOMBAS", "LDA_C_HL", "LDA_C_KARASIEV", "LDA_C_KARASIEV_MOD", "LDA_C_LP96", "LDA_C_MCWEENY", "LDA_C_ML1", "LDA_C_ML2", "LDA_C_OB_PW", "LDA_C_OB_PZ", "LDA_C_OW", "LDA_C_OW_LYP", "LDA_C_PK09", "LDA_C_PMGB06", "LDA_C_PW", "LDA_C_PW_MOD", "LDA_C_PW_RPA", "LDA_C_PZ", "LDA_C_PZ_MOD", "LDA_C_RC04", "LDA_C_RPA", "LDA_C_RPW92", "LDA_C_UPW92", "LDA_C_VBH", "LDA_C_VWN", "LDA_C_VWN_1", "LDA_C_VWN_2", "LDA_C_VWN_3", "LDA_C_VWN_4", "LDA_C_VWN_RPA", "LDA_C_W20", "LDA_C_WIGNER", "LDA_C_XALPHA", "LDA_XC_1D_EHWLRG_1", "LDA_XC_1D_EHWLRG_2", "LDA_XC_1D_EHWLRG_3", "LDA_XC_CORRKSDT", "LDA_XC_GDSMFB", "LDA_XC_KSDT", "LDA_XC_LP_A", "LDA_XC_LP_B", "LDA_XC_TETER93", "LDA_XC_TIH", "LDA_XC_ZLP", "LDA_K_LP", "LDA_K_LP96", "LDA_K_TF", "LDA_K_ZLP", "HYB_LDA_XC_BN05", "HYB_LDA_XC_CAM_LDA0", "HYB_LDA_XC_LDA0", "GGA_X_2D_B86", "GGA_X_2D_B86_MGC", "GGA_X_2D_B88", "GGA_X_2D_PBE", "GGA_X_AIRY", "GGA_X_AK13", "GGA_X_AM05", "GGA_X_APBE", "GGA_X_B86", "GGA_X_B86_MGC", "GGA_X_B86_R", "GGA_X_B88", "GGA_X_B88_6311G", "GGA_X_B88M", "GGA_X_BAYESIAN", "GGA_X_BCGP", "GGA_X_BEEFVDW", "GGA_X_BPCCAC", "GGA_X_C09X", "GGA_X_CAP", "GGA_X_CHACHIYO", "GGA_X_DK87_R1", "GGA_X_DK87_R2", "GGA_X_EB88", "GGA_X_ECMV92", "GGA_X_EV93", "GGA_X_FD_LB94", "GGA_X_FD_REVLB94", "GGA_X_FT97_A", "GGA_X_FT97_B", "GGA_X_G96", "GGA_X_GAM", "GGA_X_GG99", "GGA_X_HCTH_A", "GGA_X_HJS_B88", "GGA_X_HJS_B88_V2", "GGA_X_HJS_B97X", "GGA_X_HJS_PBE", "GGA_X_HJS_PBE_SOL", "GGA_X_HTBS", "GGA_X_ITYH", "GGA_X_ITYH_OPTX", "GGA_X_ITYH_PBE", "GGA_X_KGG99", "GGA_X_KT1", "GGA_X_LAG", "GGA_X_LAMBDA_CH_N", "GGA_X_LAMBDA_LO_N", "GGA_X_LAMBDA_OC2_N", "GGA_X_LB", "GGA_X_LBM", "GGA_X_LG93", "GGA_X_LSPBE", "GGA_X_LSRPBE", "GGA_X_LV_RPW86", "GGA_X_MB88", "GGA_X_MPBE", "GGA_X_MPW91", "GGA_X_N12", "GGA_X_NCAP", "GGA_X_NCAPR", "GGA_X_OL2", "GGA_X_OPTB86B_VDW", "GGA_X_OPTB88_VDW", "GGA_X_OPTPBE_VDW", "GGA_X_OPTX", "GGA_X_PBE", "GGA_X_PBE_GAUSSIAN", "GGA_X_PBE_JSJR", "GGA_X_PBE_MOD", "GGA_X_PBE_MOL", "GGA_X_PBE_R", "GGA_X_PBE_SOL", "GGA_X_PBE_TCA", "GGA_X_PBEA", "GGA_X_PBEFE", "GGA_X_PBEINT", "GGA_X_PBEK1_VDW", "GGA_X_PBEPOW", "GGA_X_PBETRANS", "GGA_X_PW86", "GGA_X_PW91", "GGA_X_PW91_MOD", "GGA_X_Q1D", "GGA_X_Q2D", "GGA_X_REVSSB_D", "GGA_X_RGE2", "GGA_X_RPBE", "GGA_X_RPW86", "GGA_X_S12G", "GGA_X_SFAT", "GGA_X_SFAT_PBE", "GGA_X_SG4", "GGA_X_SOGGA", "GGA_X_SOGGA11", "GGA_X_SSB", "GGA_X_SSB_D", "GGA_X_SSB_SW", "GGA_X_VMT84_GE", "GGA_X_VMT84_PBE", "GGA_X_VMT_GE", "GGA_X_VMT_PBE", "GGA_X_WC", "GGA_X_WPBEH", "GGA_X_XPBE", "GGA_C_ACGGA", "GGA_C_ACGGAP", "GGA_C_AM05", "GGA_C_APBE", "GGA_C_BMK", "GGA_C_CCDF", "GGA_C_CHACHIYO", "GGA_C_CS1", "GGA_C_FT97", "GGA_C_GAM", "GGA_C_GAPC", "GGA_C_GAPLOC", "GGA_C_HCTH_A", "GGA_C_HYB_TAU_HCTH", "GGA_C_LM", "GGA_C_LYP", "GGA_C_LYPR", "GGA_C_MGGAC", "GGA_C_N12", "GGA_C_N12_SX", "GGA_C_OP_B88", "GGA_C_OP_G96", "GGA_C_OP_PBE", "GGA_C_OP_PW91", "GGA_C_OP_XALPHA", "GGA_C_OPTC", "GGA_C_P86", "GGA_C_P86_FT", "GGA_C_P86VWN", "GGA_C_P86VWN_FT", "GGA_C_PBE", "GGA_C_PBE_GAUSSIAN", "GGA_C_PBE_JRGX", "GGA_C_PBE_MOL", "GGA_C_PBE_SOL", "GGA_C_PBE_VWN", "GGA_C_PBEFE", "GGA_C_PBEINT", "GGA_C_PBELOC", "GGA_C_PW91", "GGA_C_Q2D", "GGA_C_REGTPSS", "GGA_C_REVTCA", "GGA_C_RGE2", "GGA_C_SCAN_E0", "GGA_C_SG4", "GGA_C_SOGGA11", "GGA_C_SOGGA11_X", "GGA_C_SPBE", "GGA_C_TAU_HCTH", "GGA_C_TCA", "GGA_C_TM_LYP", "GGA_C_TM_PBE", "GGA_C_W94", "GGA_C_WI", "GGA_C_WI0", "GGA_C_WL", "GGA_C_XPBE", "GGA_C_ZPBEINT", "GGA_C_ZPBESOL", "GGA_C_ZVPBEINT", "GGA_C_ZVPBELOC", "GGA_C_ZVPBESOL", "GGA_XC_B97_3C", "GGA_XC_B97_D", "GGA_XC_B97_GGA1", "GGA_XC_BEEFVDW", "GGA_XC_EDF1", "GGA_XC_HCTH_120", "GGA_XC_HCTH_147", "GGA_XC_HCTH_407", "GGA_XC_HCTH_407P", "GGA_XC_HCTH_93", "GGA_XC_HCTH_P14", "GGA_XC_HCTH_P76", "GGA_XC_HLE16", "GGA_XC_KT1", "GGA_XC_KT2", "GGA_XC_KT3", "GGA_XC_MOHLYP", "GGA_XC_MOHLYP2", "GGA_XC_MPWLYP1W", "GGA_XC_NCAP", "GGA_XC_OBLYP_D", "GGA_XC_OPBE_D", "GGA_XC_OPWLYP_D", "GGA_XC_PBE1W", "GGA_XC_PBELYP1W", "GGA_XC_TH1", "GGA_XC_TH2", "GGA_XC_TH3", "GGA_XC_TH4", "GGA_XC_TH_FC", "GGA_XC_TH_FCFO", "GGA_XC_TH_FCO", "GGA_XC_TH_FL", "GGA_XC_VV10", "GGA_XC_XLYP", "GGA_K_ABSP1", "GGA_K_ABSP2", "GGA_K_ABSP3", "GGA_K_ABSP4", "GGA_K_APBE", "GGA_K_APBEINT", "GGA_K_BALTIN", "GGA_K_DK", "GGA_K_ERNZERHOF", "GGA_K_EXP4", "GGA_K_FR_B88", "GGA_K_FR_PW86", "GGA_K_GDS08", "GGA_K_GE2", "GGA_K_GHDS10", "GGA_K_GHDS10R", "GGA_K_GOLDEN", "GGA_K_GP85", "GGA_K_GR", "GGA_K_LC94", "GGA_K_LGAP", "GGA_K_LGAP_GE", "GGA_K_LIEB", "GGA_K_LKT", "GGA_K_LLP", "GGA_K_LUDENA", "GGA_K_MEYER", "GGA_K_OL1", "GGA_K_OL2", "GGA_K_PBE2", "GGA_K_PBE3", "GGA_K_PBE4", "GGA_K_PEARSON", "GGA_K_PERDEW", "GGA_K_PG1", "GGA_K_RATIONAL_P", "GGA_K_REVAPBE", "GGA_K_REVAPBEINT", "GGA_K_TFVW", "GGA_K_TFVW_OPT", "GGA_K_THAKKAR", "GGA_K_TKVLN", "GGA_K_TW1", "GGA_K_TW2", "GGA_K_TW3", "GGA_K_TW4", "GGA_K_VJKS", "GGA_K_VSK", "GGA_K_VT84F", "GGA_K_VW", "GGA_K_YT65", "HYB_GGA_X_CAM_S12G", "HYB_GGA_X_CAM_S12H", "HYB_GGA_X_N12_SX", "HYB_GGA_X_S12H", "HYB_GGA_X_SOGGA11_X", "", "HYB_GGA_XC_APBE0", "HYB_GGA_XC_APF", "HYB_GGA_XC_B1LYP", "HYB_GGA_XC_B1PW91", "HYB_GGA_XC_B1WC", "HYB_GGA_XC_B3LYP", "HYB_GGA_XC_B3LYP3", "HYB_GGA_XC_B3LYP5", "HYB_GGA_XC_B3LYP_MCM1", "HYB_GGA_XC_B3LYP_MCM2", "HYB_GGA_XC_B3LYPS", "HYB_GGA_XC_B3P86", "HYB_GGA_XC_B3P86_NWCHEM", "HYB_GGA_XC_B3PW91", "HYB_GGA_XC_B97", "HYB_GGA_XC_B97_1", "HYB_GGA_XC_B97_1P", "HYB_GGA_XC_B97_2", "HYB_GGA_XC_B97_3", "HYB_GGA_XC_B97_K", "HYB_GGA_XC_BHANDH", "HYB_GGA_XC_BHANDHLYP", "HYB_GGA_XC_BLYP35", "HYB_GGA_XC_CAM_B3LYP", "HYB_GGA_XC_CAM_O3LYP", "HYB_GGA_XC_CAM_PBEH", "HYB_GGA_XC_CAM_QTP_00", "HYB_GGA_XC_CAM_QTP_01", "HYB_GGA_XC_CAM_QTP_02", "HYB_GGA_XC_CAMH_B3LYP", "HYB_GGA_XC_CAMY_B3LYP", "HYB_GGA_XC_CAMY_BLYP", "HYB_GGA_XC_CAMY_PBEH", "HYB_GGA_XC_CAP0", "HYB_GGA_XC_CASE21", "HYB_GGA_XC_EDF2", "HYB_GGA_XC_HAPBE", "HYB_GGA_XC_HFLYP", "HYB_GGA_XC_HJS_B88", "HYB_GGA_XC_HJS_B97X", "HYB_GGA_XC_HJS_PBE", "HYB_GGA_XC_HJS_PBE_SOL", "HYB_GGA_XC_HPBEINT", "HYB_GGA_XC_HSE03", "HYB_GGA_XC_HSE06", "HYB_GGA_XC_HSE12", "HYB_GGA_XC_HSE12S", "HYB_GGA_XC_HSE_SOL", "HYB_GGA_XC_KMLYP", "HYB_GGA_XC_LB07", "HYB_GGA_XC_LC_BLYP", "HYB_GGA_XC_LC_BLYP_EA", "HYB_GGA_XC_LC_BLYPR", "HYB_GGA_XC_LC_BOP", "HYB_GGA_XC_LC_PBEOP", "HYB_GGA_XC_LC_QTP", "HYB_GGA_XC_LC_VV10", "HYB_GGA_XC_LC_WPBE", "HYB_GGA_XC_LC_WPBE08_WHS", "HYB_GGA_XC_LC_WPBE_WHS", "HYB_GGA_XC_LC_WPBEH_WHS", "HYB_GGA_XC_LC_WPBESOL_WHS", "HYB_GGA_XC_LCY_BLYP", "HYB_GGA_XC_LCY_PBE", "HYB_GGA_XC_LRC_WPBE", "HYB_GGA_XC_LRC_WPBEH", "HYB_GGA_XC_MB3LYP_RC04", "HYB_GGA_XC_MCAM_B3LYP", "HYB_GGA_XC_MPW1K", "HYB_GGA_XC_MPW1LYP", "HYB_GGA_XC_MPW1PBE", "HYB_GGA_XC_MPW1PW", "HYB_GGA_XC_MPW3LYP", "HYB_GGA_XC_MPW3PW", "HYB_GGA_XC_MPWLYP1M", "HYB_GGA_XC_O3LYP", "HYB_GGA_XC_PBE0_13", "HYB_GGA_XC_PBE38", "HYB_GGA_XC_PBE50", "HYB_GGA_XC_PBE_2X", "HYB_GGA_XC_PBE_MOL0", "HYB_GGA_XC_PBE_MOLB0", "HYB_GGA_XC_PBE_SOL0", "HYB_GGA_XC_PBEB0", "HYB_GGA_XC_PBEH", "HYB_GGA_XC_QTP17", "HYB_GGA_XC_RCAM_B3LYP", "HYB_GGA_XC_RELPBE0", "HYB_GGA_XC_REVB3LYP", "HYB_GGA_XC_SB98_1A", "HYB_GGA_XC_SB98_1B", "HYB_GGA_XC_SB98_1C", "HYB_GGA_XC_SB98_2A", "HYB_GGA_XC_SB98_2B", "HYB_GGA_XC_SB98_2C", "HYB_GGA_XC_TUNED_CAM_B3LYP", "HYB_GGA_XC_WB97", "HYB_GGA_XC_WB97X", "HYB_GGA_XC_WB97X_D", "HYB_GGA_XC_WB97X_D3", "HYB_GGA_XC_WB97X_V", "HYB_GGA_XC_WC04", "HYB_GGA_XC_WHPBE0", "HYB_GGA_XC_WP04", "HYB_GGA_XC_X3LYP", "MGGA_X_2D_JS17", "MGGA_X_2D_PRHG07", "MGGA_X_2D_PRHG07_PRP10", "MGGA_X_B00", "MGGA_X_BJ06", "MGGA_X_BLOC", "MGGA_X_BR89", "MGGA_X_BR89_1", "MGGA_X_BR89_EXPLICIT", "MGGA_X_BR89_EXPLICIT_1", "MGGA_X_EDMGGA", "MGGA_X_GDME_0", "MGGA_X_GDME_KOS", "MGGA_X_GDME_NV", "MGGA_X_GDME_VT", "MGGA_X_GVT4", "MGGA_X_GX", "MGGA_X_HLTA", "MGGA_X_JK", "MGGA_X_KTBM_0", "MGGA_X_KTBM_1", "MGGA_X_KTBM_10", "MGGA_X_KTBM_11", "MGGA_X_KTBM_12", "MGGA_X_KTBM_13", "MGGA_X_KTBM_14", "MGGA_X_KTBM_15", "MGGA_X_KTBM_16", "MGGA_X_KTBM_17", "MGGA_X_KTBM_18", "MGGA_X_KTBM_19", "MGGA_X_KTBM_2", "MGGA_X_KTBM_20", "MGGA_X_KTBM_21", "MGGA_X_KTBM_22", "MGGA_X_KTBM_23", "MGGA_X_KTBM_24", "MGGA_X_KTBM_3", "MGGA_X_KTBM_4", "MGGA_X_KTBM_5", "MGGA_X_KTBM_6", "MGGA_X_KTBM_7", "MGGA_X_KTBM_8", "MGGA_X_KTBM_9", "MGGA_X_KTBM_GAP", "MGGA_X_LTA", "MGGA_X_M06_L", "MGGA_X_M11_L", "MGGA_X_MBEEF", "MGGA_X_MBEEFVDW", "MGGA_X_MBR", "MGGA_X_MBRXC_BG", "MGGA_X_MBRXH_BG", "MGGA_X_MCML", "MGGA_X_MGGAC", "MGGA_X_MK00", "MGGA_X_MK00B", "MGGA_X_MN12_L", "MGGA_X_MN15_L", "MGGA_X_MODTPSS", "MGGA_X_MS0", "MGGA_X_MS1", "MGGA_X_MS2", "MGGA_X_MS2_REV", "MGGA_X_MS2B", "MGGA_X_MS2BS", "MGGA_X_MTASK", "MGGA_X_MVS", "MGGA_X_MVSB", "MGGA_X_MVSBS", "MGGA_X_PBE_GX", "MGGA_X_PKZB", "MGGA_X_R2SCAN", "MGGA_X_R2SCAN01", "MGGA_X_R2SCANL", "MGGA_X_R4SCAN", "MGGA_X_REGTM", "MGGA_X_REGTPSS", "MGGA_X_REVM06_L", "MGGA_X_REVSCAN", "MGGA_X_REVSCANL", "MGGA_X_REVTM", "MGGA_X_REVTPSS", "MGGA_X_RLDA", "MGGA_X_RPP09", "MGGA_X_RPPSCAN", "MGGA_X_RSCAN", "MGGA_X_RTPSS", "MGGA_X_SA_TPSS", "MGGA_X_SCAN", "MGGA_X_SCANL", "MGGA_X_TASK", "MGGA_X_TAU_HCTH", "MGGA_X_TB09", "MGGA_X_TH", "MGGA_X_TLDA", "MGGA_X_TM", "MGGA_X_TPSS", "MGGA_X_VCML", "MGGA_X_VT84", "MGGA_C_B88", "MGGA_C_B94", "MGGA_C_BC95", "MGGA_C_CC", "MGGA_C_CCALDA", "MGGA_C_CS", "MGGA_C_DLDF", "MGGA_C_HLTAPW", "MGGA_C_KCIS", "MGGA_C_KCISK", "MGGA_C_M05", "MGGA_C_M05_2X", "MGGA_C_M06", "MGGA_C_M06_2X", "MGGA_C_M06_HF", "MGGA_C_M06_L", "MGGA_C_M06_SX", "MGGA_C_M08_HX", "MGGA_C_M08_SO", "MGGA_C_M11", "MGGA_C_M11_L", "MGGA_C_MN12_L", "MGGA_C_MN12_SX", "MGGA_C_MN15", "MGGA_C_MN15_L", "MGGA_C_PKZB", "MGGA_C_R2SCAN", "MGGA_C_R2SCAN01", "MGGA_C_R2SCANL", "MGGA_C_REVM06", "MGGA_C_REVM06_L", "MGGA_C_REVM11", "MGGA_C_REVSCAN", "MGGA_C_REVSCAN_VV10", "MGGA_C_REVTM", "MGGA_C_REVTPSS", "MGGA_C_RMGGAC", "MGGA_C_RPPSCAN", "MGGA_C_RREGTM", "MGGA_C_RSCAN", "MGGA_C_SCAN", "MGGA_C_SCAN_RVV10", "MGGA_C_SCAN_VV10", "MGGA_C_SCANL", "MGGA_C_SCANL_RVV10", "MGGA_C_SCANL_VV10", "MGGA_C_TM", "MGGA_C_TPSS", "MGGA_C_TPSS_GAUSSIAN", "MGGA_C_TPSSLOC", "MGGA_C_VSXC", "MGGA_XC_B97M_V", "MGGA_XC_CC06", "MGGA_XC_HLE17", "MGGA_XC_LP90", "MGGA_XC_OTPSS_D", "MGGA_XC_TPSSLYP1W", "MGGA_XC_VCML_RVV10", "MGGA_XC_ZLP", "MGGA_K_CSK1", "MGGA_K_CSK4", "MGGA_K_CSK_LOC1", "MGGA_K_CSK_LOC4", "MGGA_K_GEA2", "MGGA_K_GEA4", "MGGA_K_L04", "MGGA_K_L06", "MGGA_K_PC07", "MGGA_K_PC07_OPT", "MGGA_K_PGSL025", "MGGA_K_RDA", "HYB_MGGA_X_BMK", "HYB_MGGA_X_DLDF", "HYB_MGGA_X_JS18", "HYB_MGGA_X_M05", "HYB_MGGA_X_M05_2X", "HYB_MGGA_X_M06", "HYB_MGGA_X_M06_2X", "HYB_MGGA_X_M06_HF", "HYB_MGGA_X_M06_SX", "HYB_MGGA_X_M08_HX", "HYB_MGGA_X_M08_SO", "HYB_MGGA_X_M11", "HYB_MGGA_X_MN12_SX", "HYB_MGGA_X_MN15", "HYB_MGGA_X_MS2H", "HYB_MGGA_X_MVSH", "HYB_MGGA_X_PJS18", "HYB_MGGA_X_REVM06", "HYB_MGGA_X_REVM11", "HYB_MGGA_X_REVSCAN0", "HYB_MGGA_X_SCAN0", "HYB_MGGA_X_TAU_HCTH", "HYB_MGGA_XC_B0KCIS", "HYB_MGGA_XC_B86B95", "HYB_MGGA_XC_B88B95", "HYB_MGGA_XC_B94_HYB", "HYB_MGGA_XC_B98", "HYB_MGGA_XC_BB1K", "HYB_MGGA_XC_BR3P86", "HYB_MGGA_XC_EDMGGAH", "HYB_MGGA_XC_GAS22", "HYB_MGGA_XC_LC_TMLYP", "HYB_MGGA_XC_MPW1B95", "HYB_MGGA_XC_MPW1KCIS", "HYB_MGGA_XC_MPWB1K", "HYB_MGGA_XC_MPWKCIS1K", "HYB_MGGA_XC_PBE1KCIS", "HYB_MGGA_XC_PW6B95", "HYB_MGGA_XC_PW86B95", "HYB_MGGA_XC_PWB6K", "HYB_MGGA_XC_R2SCAN0", "HYB_MGGA_XC_R2SCAN50", "HYB_MGGA_XC_R2SCANH", "HYB_MGGA_XC_REVTPSSH", "HYB_MGGA_XC_TPSS0", "HYB_MGGA_XC_TPSS1KCIS", "HYB_MGGA_XC_TPSSH", "HYB_MGGA_XC_WB97M_V", "HYB_MGGA_XC_X1B95", "HYB_MGGA_XC_XB1K"};
//        Integer argb_brown = Color.parseColor("#A52A2A");
//        for (String word : words_brown) {
//            int substringStart=0;
//            int start;
//            while((start=text.indexOf(word,substringStart))>=0){
//                spannable.setSpan(
//                        new ForegroundColorSpan(argb_brown),start,start+word.length(),
//                        Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
//                );
////                spannable.setSpan(
////                        new BackgroundColorSpan(argb_back),start,start+word.length(),
////                        Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
////                );
//                substringStart = start+word.length();
//            }
//        }



        String[] words_cyan = {"S", "PBE", "PY86", "PW91", "BECKE", "CHACHIYO", "B3", "HALF", "VWN5", "PW92", "CHACHIYO", "BLYP", "B3LYP"};
        Integer argb_cyan = Color.parseColor("#7AD5E1");
        for (String word : words_cyan) {
            int substringStart=0;
            int start;
            while((start=text.indexOf(word,substringStart))>=0){
                spannable.setSpan(
                        new ForegroundColorSpan(argb_cyan),start,start+word.length(),
                        Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
                );
                spannable.setSpan(
                        new android.text.style.StyleSpan(Typeface.BOLD),start,start+word.length(),
                        Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
                );
//                spannable.setSpan(
//                        new BackgroundColorSpan(argb_back),start,start+word.length(),
//                        Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
//                );
                substringStart = start+word.length();
            }
        }

        String[] words_blue = {"-HF", "-DFT", "-LDA", "-LIBXC", "-Q", "-M", "-R", "-U", "-xSlater", "-xPerdewYue", "-xPBE", "-xBecke88", "-xMVS", "-xChachiyo", "-FORCE", "-HESSIAN", "-OPT", "-MP2", "-MECP", "-EXCITE", "-QMD", "-GUESS", "-SCFDIIS", "-SCFDIIS3", "-SCFDIIS2", "-SCFDAMP", "-SCFDRAG", "-SCFCONV", "-SCFMAX", "-SCFACC", "-SCFACC", "-MAXMEM", "-GRIDSIZE", "-GRIDSIZE", "-GRID", "-GRIDINIT", "-LCHECK", "-SCHECK", "-FCHECK", "-LDMATRIX", "-SDMATRIX", "-FDMATRIX", "-DENSITY", "-POTENTIAL", "-GRADOVER43", "-GRADRS", "-MOUP", "-MODN", "-VOLCUT", "-VOLGRID", "-XSF", "-CUBE", "-GAUSSIAN", "-NCPU", "-PREFIX", "-OPTMAX", "-MECPMAX", "-FCHECKA", "-FCHECKB", "-FDMATRIXA", "-FDMATRIXB", "-GAUSSINA", "-GAUSSINB", "-GAUSSEXE", "-EXCITE", "-EF", "-INITVEL", "-INITTEMP", "-KEEPTEMP", "-TRAJ", "-DT", "-QMDMAX", "-EFREQ"};
        Integer argb_blue = Color.BLUE;
        for (String word : words_blue) {
            int substringStart=0;
            int start;
            while((start=text.indexOf(word,substringStart))>=0){
                spannable.setSpan(
                        new ForegroundColorSpan(argb_blue),start,start+word.length(),
                        Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
                );
//                spannable.setSpan(
//                        new BackgroundColorSpan(argb_back),start,start+word.length(),
//                        Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
//                );
                substringStart = start+word.length();
            }
        }

        String[] words_red = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", ".", "+", "-"};
        Integer argb_red = Color.RED;
        for (String word : words_red) {
            int substringStart=0;
            int start;
            while((start=text.indexOf(word,substringStart))>=0){
                spannable.setSpan(
                        new ForegroundColorSpan(argb_red),start,start+word.length(),
                        Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
                );
//                spannable.setSpan(
//                        new BackgroundColorSpan(argb_back),start,start+word.length(),
//                        Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
//                );
                substringStart = start+word.length();
            }
        }

        // currently not working - not perfect analogy with words_comments
        //
//        String[] words_quotations = {"\'"};
//        Integer argb_quotations = Color.MAGENTA;
//        for (String word : words_quotations) {
//            int substringStart = 0;
//            int start;
//            int i = 0;
//            int prevQuot = 0;
//            int nextQuot = 0;
//            while ((start = text.indexOf(word, substringStart)) >= 0) {
//                i++;
//                if (i == 1){
//                    prevQuot = text.indexOf(word,start);
//                    substringStart = prevQuot;
//                } else if (i > 1){
//                    nextQuot = text.indexOf(word,prevQuot);
//                    if (nextQuot != -1) {
//                        spannable.setSpan(
//                                new ForegroundColorSpan(argb_quotations), prevQuot, nextQuot,
//                                Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
//                        );
//                        substringStart = nextQuot+1;
//                        prevQuot = nextQuot+1;
//                    } else {
//                        spannable.setSpan(
//                                new ForegroundColorSpan(argb_quotations), prevQuot, text.length(),
//                                Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
//                        );
//                        substringStart = start+word.length();
//                    }
//                }
//            }
//        }

        String[] words_quotations1 = {"\\'(.*?)\\'"};
        Integer argb_quotations1 = Color.MAGENTA;
        for (String word : words_quotations1) {
            int substringStart = 0;
            int start;
            while ((start = text.indexOf(word, substringStart)) >= 0) {
                int neqtQuot1 = text.indexOf(word,start);
                // endOfLine = -1 in the last line, since there is no more line break until the ond of the file
                if (neqtQuot1 != -1) {
                    spannable.setSpan(
                            new ForegroundColorSpan(argb_quotations1), start, neqtQuot1,
                            Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
                    );
//                    spannable.setSpan(
//                            new BackgroundColorSpan(argb_back),start,endOfLine,
//                            Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
//                                );
                    substringStart = neqtQuot1;
                } else {
                    spannable.setSpan(
                            // in the last line, only the "#" character would be colorized by green, the following characters would be either black or colorized by previous
//                            new ForegroundColorSpan(argb_comment), start, start+word.length(),
                            // text.length() is the position of the end of whole text, better (it works as should)
                            new ForegroundColorSpan(argb_quotations1), start, text.length(),
                            Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
                    );
//                    spannable.setSpan(
//                            new BackgroundColorSpan(argb_back),start,text.length(),
//                            Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
//                                );
                    substringStart = start+word.length();
                }
            }
        }

        String[] words_comment = {"#", "REM"};
        Integer argb_comment = Color.parseColor("#058a47");
        for (String word : words_comment) {
            int substringStart = 0;
            int start;
            while ((start = text.indexOf(word, substringStart)) >= 0) {
                int endOfLine = text.indexOf("\n",start);
                // endOfLine = -1 in the last line, since there is no more line break until the ond of the file
                if (endOfLine != -1) {
                    spannable.setSpan(
                            new ForegroundColorSpan(argb_comment), start, endOfLine,
                            Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
                    );
//                    spannable.setSpan(
//                            new BackgroundColorSpan(argb_back),start,endOfLine,
//                            Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
//                                );
                    substringStart = endOfLine;
                } else {
                    spannable.setSpan(
                            // in the last line, only the "#" character would be colorized by green, the following characters would be either black or colorized by previous
//                            new ForegroundColorSpan(argb_comment), start, start+word.length(),
                            // text.length() is the position of the end of whole text, better (it works as should)
                            new ForegroundColorSpan(argb_comment), start, text.length(),
                            Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
                    );
//                    spannable.setSpan(
//                            new BackgroundColorSpan(argb_back),start,text.length(),
//                            Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
//                                );
                    substringStart = start+word.length();
                }
            }
        }

        return spannable;
    }

}
