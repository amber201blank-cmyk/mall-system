<template>
    <div class="footer">
        <div class="footer-logo">
            <a href="/#/index"><img src="/imgs/logo-footer.png" alt=""></a>
            <p>美剧周边商城</p>
        </div>
        <div class="footer-link">
            <span>Spring Boot</span>
            <span>|</span>
            <span>Vue</span>
            <span>|</span>
            <span>Redis</span>
            <span>|</span>
            <span>MySQL</span>
        </div>
        <div class="copyright">
            © 2026 <span class="heart"> ❤ </span>美剧周边商城
        </div>
    </div>
</template>

<script>
    export default {
        name: 'nav-footer'
    }
</script>

<style lang="scss">
    @import "./../assets/scss/config.scss";

    .footer {
        height: 234px;
        background-color: #f6f9fa;
        color: $colorB;
        font-size: 16px;
        text-align: center;
        padding: 2px;

        .footer-logo {
            margin-top: 46px;
            margin-bottom: 31px;

            img {
                height: 46px;
                margin-bottom: 13px;
            }
        }

        .footer-link {
            span {
                margin: 0 10px;
            }

            margin-bottom: 13px;
        }

        .copyright {
            .heart {
                color: $colorA;
            }
        }
    }
</style>