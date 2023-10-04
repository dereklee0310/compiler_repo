;---------------    Debug Info     ---------------;

;--------------- Unnamed Variables ---------------;

@.str.0 = private unnamed_addr constant [42 x i8] c"Test arithmetic expression and statement\0A\00"
@.str.1 = private unnamed_addr constant [4 x i8] c"%d\0A\00"
@.str.2 = private unnamed_addr constant [4 x i8] c"%d\0A\00"
@.str.3 = private unnamed_addr constant [4 x i8] c"%d\0A\00"
@.str.4 = private unnamed_addr constant [4 x i8] c"%d\0A\00"

;--------------- Global Variables  ---------------;


;---------------     Main Code     ---------------;

declare dso_local i32 @printf(i8*, ...)

define dso_local i32 @main()

{
%t1 = alloca i32, align 4
store i32 1, i32* %t1, align 4
%t2 = alloca i32, align 4
store i32 100, i32* %t2, align 4
%t3 = alloca i32, align 4
store i32 1000, i32* %t3, align 4
%t4 = alloca i32, align 4
store i32 7777, i32* %t4, align 4
%t7 = load i32, i32* %t2, align 4
%t8 = mul nsw i32 2, %t7
%t10 = sdiv  i32 %t8, 30
%t11 = add nsw i32 1, %t10
store i32 %t11, i32* %t1, align 4
%t13 = load i32, i32* %t4, align 4
%t14 = load i32, i32* %t3, align 4
%t15 = srem  i32 %t13, %t14
%t16 = load i32, i32* %t2, align 4
%t17 = add nsw i32 %t15, %t16
%t19 = sub nsw i32 %t17, 100
%t21 = srem  i32 %t19, 100
store i32 %t21, i32* %t2, align 4
%t27 = load i32, i32* %t2, align 4
%t28 = mul nsw i32 -10, %t27
%t29 = add nsw i32 -7000, %t28
%t30 = load i32, i32* %t1, align 4
store i32 %t30, i32* %t1, align 4
%t32 = sub nsw i32 0, %t30
%t33 = add nsw i32 %t29, %t32
store i32 %t33, i32* %t4, align 4
%t37 = call i32 (i8*, ...) @printf(i8* noundef getelementptr inbounds ([42 x i8], [42 x i8]* @.str.0, i64 0, i64 0))
%t41 = load i32, i32* %t1, align 4
%t42 = call i32 (i8*, ...) @printf(i8* noundef getelementptr inbounds ([4 x i8], [4 x i8]* @.str.1, i64 0, i64 0), i32 noundef %t41)
%t46 = load i32, i32* %t2, align 4
%t47 = call i32 (i8*, ...) @printf(i8* noundef getelementptr inbounds ([4 x i8], [4 x i8]* @.str.2, i64 0, i64 0), i32 noundef %t46)
%t58 = load i32, i32* %t1, align 4
%t59 = sub nsw i32 7, %t58
%t60 = sub nsw i32 600, %t59
%t62 = add nsw i32 %t60, 177
%t63 = call i32 (i8*, ...) @printf(i8* noundef getelementptr inbounds ([4 x i8], [4 x i8]* @.str.3, i64 0, i64 0), i32 noundef %t62)
%t67 = load i32, i32* %t4, align 4
%t68 = call i32 (i8*, ...) @printf(i8* noundef getelementptr inbounds ([4 x i8], [4 x i8]* @.str.4, i64 0, i64 0), i32 noundef %t67)
ret i32 0
}
