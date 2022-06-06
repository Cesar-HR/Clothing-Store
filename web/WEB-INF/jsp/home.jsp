<%@include file="templates/_header.jsp" %>
<!-- SECTION -->
<div class="section">
    <!-- container -->
    <div class="container">
        <!-- row -->
        <div class="row">
            <!-- shop -->
            <div class="col-md-4 col-xs-6">
                <div class="shop">
                    <div class="shop-img">
                        <img src="https://bit.ly/3HKADeH" alt="">
                    </div>
                    <div class="shop-body">
                        <h3>Women<br>Collection</h3>
                        <a href="#" class="cta-btn">Spring 2022 </a>
                    </div>
                </div>
            </div>
            <!-- /shop -->

            <!-- shop -->
            <div class="col-md-4 col-xs-6">
                <div class="shop">
                    <div class="shop-img">
                        <img src="https://bit.ly/3FeQQaJ" alt="">
                    </div>
                    <div class="shop-body">
                        <h3>Men<br>Collection</h3>
                        <a href="#" class="cta-btn">Spring 2022 </a>
                    </div>
                </div>
            </div>
            <!-- /shop -->

            <!-- shop -->
            <div class="col-md-4 col-xs-6">
                <div class="shop">
                    <div class="shop-img">
                        <img src="https://bit.ly/3n2BK1u" alt="">
                    </div>
                    <div class="shop-body">
                        <h3>Accessories<br>Collection</h3>
                        <a href="#" class="cta-btn">Spring 2022 </a>
                    </div>
                </div>
            </div>
            <!-- /shop -->
        </div>
        <!-- /row -->
    </div>
    <!-- /container -->
</div>
<!-- /SECTION -->

<!-- SECTION -->
<div class="section">
    <div class="container">
        <!-- STORE -->
        <div id="store" class="col-md-12">
            <!-- store products -->
            <div class="row">
                <!-- section title -->
                <div class="col-md-12">
                    <div class="section-title">
                        <h3 class="title">New Products</h3>
                        <div class="section-nav">
                            <ul class="section-tab-nav tab-nav">
                                <li class="active"><a data-toggle="tab" href="#tab1">All</a></li>
                                <li><a data-toggle="tab" href="#tab1">Women</a></li>
                                <li><a data-toggle="tab" href="#tab1">Men</a></li>
                                <li><a data-toggle="tab" href="#tab1">Accessories</a></li>
                            </ul>
                        </div>
                    </div>
                </div>
                <!-- /section title -->
                <!-- product -->
                <c:forEach items="${dataProduct}" var="Pdt">
                    <div class="col-md-4 col-xs-6">
                        <!-- product -->
                        <div class="product">
                            <div class="product-img">
                                <img src="${Pdt.picture}" alt="" height="440">
                                <div class="product-label">
                                    <span class="new">NEW</span>
                                </div>
                            </div>
                            <div class="product-body">
                                <h3 class="product-name"><a href="#">${Pdt.name}</a></h3>
                                <h4 class="product-price">${Pdt.price}</h4>
                                <div class="product-btns">
                                    <button class="quick-view"><i class="fa fa-eye"></i><span class="tooltipp">quick view</span></button>
                                </div>
                            </div>
                            <div class="add-to-cart">
                                <button class="add-to-cart-btn"><i class="fa fa-shopping-cart"></i> add to cart</button>
                            </div>
                        </div>
                        <div style="margin-bottom: 4.5em"></div>
                        <!-- /product -->
                    </div>
                </c:forEach>
                <!-- /product -->
            </div>
            <!-- /store products -->
        </div>
        <!-- /SECTION -->
    </div>
</div>

<!-- NEWSLETTER -->
<div style="margin-top: 1.5em;"></div>
<div id="newsletter" class="section">
    <!-- container -->
    <div class="container">
        <!-- row -->
        <div class="row">
            <div class="col-md-12">
                <div class="newsletter">
                    <p>Sign Up for the <strong>NEWSLETTER</strong></p>
                    <form>
                        <input class="input" type="email" placeholder="Enter Your Email">
                        <button class="newsletter-btn"><i class="fa fa-envelope"></i> Subscribe</button>
                    </form>
                    <ul class="newsletter-follow">
                        <li>
                            <a href="#"><i class="fa fa-facebook"></i></a>
                        </li>
                        <li>
                            <a href="#"><i class="fa fa-twitter"></i></a>
                        </li>
                        <li>
                            <a href="#"><i class="fa fa-instagram"></i></a>
                        </li>
                        <li>
                            <a href="#"><i class="fa fa-pinterest"></i></a>
                        </li>
                    </ul>
                </div>
            </div>
        </div>
        <!-- /row -->
    </div>
    <!-- /container -->
</div>
<!-- /NEWSLETTER -->
<%@include file="templates/_footer.jsp" %>