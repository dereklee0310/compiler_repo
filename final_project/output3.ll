;---------------    Debug Info     ---------------;

;--------------- Unnamed Variables ---------------;

@.str.0 = private unnamed_addr constant [25 x i8] c"Test if else statements\0A\00"
@.str.1 = private unnamed_addr constant [7 x i8] c"a > 7\0A\00"
@.str.2 = private unnamed_addr constant [7 x i8] c"a < 7\0A\00"
@.str.3 = private unnamed_addr constant [8 x i8] c"b == 7\0A\00"
@.str.4 = private unnamed_addr constant [8 x i8] c"c < 78\0A\00"
@.str.5 = private unnamed_addr constant [7 x i8] c"error\0A\00"
@.str.6 = private unnamed_addr constant [7 x i8] c"error\0A\00"
@.str.7 = private unnamed_addr constant [7 x i8] c"error\0A\00"

;--------------- Global Variables  ---------------;


;---------------     Main Code     ---------------;

declare dso_local i32 @printf(i8*, ...)

define dso_local i32 @main()

{
%t1 = alloca i32, align 4
store i32 7, i32* %t1, align 4
%t2 = alloca i32, align 4
store i32 77, i32* %t2, align 4
%t3 = alloca i32, align 4
store i32 77, i32* %t3, align 4
%t5 = alloca i32, align 4
store i32 -7777, i32* %t5, align 4
%t9 = call i32 (i8*, ...) @printf(i8* noundef getelementptr inbounds ([25 x i8], [25 x i8]* @.str.0, i64 0, i64 0))
%t15 = load i32, i32* %t1, align 4
%t16 = icmp sge i32 %t15, 7
%t17 = zext i1 %t16 to i32
%t10 = trunc i32 %t17 to i1
br i1 %t10, label %t11, label %t12
t11:
%t21 = call i32 (i8*, ...) @printf(i8* noundef getelementptr inbounds ([7 x i8], [7 x i8]* @.str.1, i64 0, i64 0))
br label %t13
t12:
%t25 = call i32 (i8*, ...) @printf(i8* noundef getelementptr inbounds ([7 x i8], [7 x i8]* @.str.2, i64 0, i64 0))
br label %t13
t13:
%t31 = load i32, i32* %t2, align 4
%t32 = icmp eq i32 %t31, 7
%t33 = zext i1 %t32 to i32
%t26 = trunc i32 %t33 to i1
br i1 %t26, label %t27, label %t29
t27:
%t37 = call i32 (i8*, ...) @printf(i8* noundef getelementptr inbounds ([8 x i8], [8 x i8]* @.str.3, i64 0, i64 0))
br label %t29
t29:
%t43 = load i32, i32* %t3, align 4
%t44 = icmp slt i32 %t43, 80
%t45 = zext i1 %t44 to i32
%t38 = trunc i32 %t45 to i1
br i1 %t38, label %t39, label %t40
t39:
%t51 = load i32, i32* %t3, align 4
%t52 = icmp slt i32 %t51, 79
%t53 = zext i1 %t52 to i32
%t46 = trunc i32 %t53 to i1
br i1 %t46, label %t47, label %t48
t47:
%t59 = load i32, i32* %t3, align 4
%t60 = icmp slt i32 %t59, 78
%t61 = zext i1 %t60 to i32
%t54 = trunc i32 %t61 to i1
br i1 %t54, label %t55, label %t56
t55:
%t65 = call i32 (i8*, ...) @printf(i8* noundef getelementptr inbounds ([8 x i8], [8 x i8]* @.str.4, i64 0, i64 0))
br label %t57
t56:
%t69 = call i32 (i8*, ...) @printf(i8* noundef getelementptr inbounds ([7 x i8], [7 x i8]* @.str.5, i64 0, i64 0))
br label %t57
t57:
br label %t49
t48:
%t73 = call i32 (i8*, ...) @printf(i8* noundef getelementptr inbounds ([7 x i8], [7 x i8]* @.str.6, i64 0, i64 0))
br label %t49
t49:
br label %t41
t40:
%t77 = call i32 (i8*, ...) @printf(i8* noundef getelementptr inbounds ([7 x i8], [7 x i8]* @.str.7, i64 0, i64 0))
br label %t41
t41:
ret i32 0
}
